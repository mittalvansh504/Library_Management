const cardNumberInput = document.getElementById('cardNumber');
    const expiryDateInput = document.getElementById('expiryDate');

    // 1. Dynamic Card Number Formatting (XXXX XXXX XXXX XXXX)
    cardNumberInput.addEventListener('input', (e) => {
        let value = e.target.value.replace(/\D/g, ''); // Remove non-digits

        // Add space every 4 digits
        value = value.match(/.{1,4}/g)?.join(' ') || '';

        // Limit to 19 characters (16 digits + 3 spaces)
        e.target.value = value.substring(0, 19);
    });

    // 2. Dynamic Expiry Date Formatting (MM/YY)
    expiryDateInput.addEventListener('input', (e) => {
        let value = e.target.value.replace(/\D/g, ''); // Remove non-digits

        if (value.length > 2) {
            // Insert '/' after the second digit
            value = value.substring(0, 2) + '/' + value.substring(2, 4);
        }

        // Limit to 5 characters (MM/YY)
        e.target.value = value.substring(0, 5);
    });

    // 3. Client-side Validation (Mandatory for Form Submit)
    const validatePayment = (event) => {
        let isValid = true;

        // Reset all custom feedback
        document.querySelectorAll('.is-invalid').forEach(el => el.classList.remove('is-invalid'));
        document.getElementById('cardNumberFeedback').style.display = 'none';
        document.getElementById('expiryDateFeedback').style.display = 'none';

        const cardNum = cardNumberInput.value.replace(/\s/g, '');
        const expiry = expiryDateInput.value;

        // Validate Card Number (16 digits)
        if (!/^\d{16}$/.test(cardNum)) {
            cardNumberInput.classList.add('is-invalid');
            document.getElementById('cardNumberFeedback').style.display = 'block';
            isValid = false;
        }

        // Validate Expiry Date (MM/YY format and future date)
        if (!/^(0[1-9]|1[0-2])\/\d{2}$/.test(expiry)) {
            expiryDateInput.classList.add('is-invalid');
            document.getElementById('expiryDateFeedback').innerText = 'Invalid format (MM/YY).';
            document.getElementById('expiryDateFeedback').style.display = 'block';
            isValid = false;
        } else {
            const [mm, yy] = expiry.split('/').map(Number);
            const currentYear = new Date().getFullYear() % 100;
            const currentMonth = new Date().getMonth() + 1;

            if (yy < currentYear || (yy === currentYear && mm < currentMonth)) {
                expiryDateInput.classList.add('is-invalid');
                document.getElementById('expiryDateFeedback').innerText = 'Card has expired.';
                document.getElementById('expiryDateFeedback').style.display = 'block';
                isValid = false;
            }
        }

        if (!isValid) {
            event.preventDefault(); // Stop form submission
            return false;
        }
        return true;
    };

    // Attach validation to form submit (already done in HTML, but kept here for clarity)
    document.querySelector('form').addEventListener('submit', validatePayment);