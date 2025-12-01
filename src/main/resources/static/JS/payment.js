document.getElementById('cardNumber').addEventListener('input', function(e) {
        const input = e.target.value.replace(/\D/g, '').substring(0, 16);
        const formatted = input.match(/.{1,4}/g);
        e.target.value = formatted ? formatted.join(' ') : '';
    });

    // Simple client-side validation logic
    function validatePayment() {
        const form = document.getElementById('paymentForm');
        // This is where you would typically integrate with a payment processor SDK
        // (e.g., Stripe.js) to tokenize the card data before submitting the form.

        // For simple HTML form validation, ensure browser constraints (patterns, required) are met.
        if (!form.checkValidity()) {
            form.classList.add('was-validated');
            return false;
        }
        return true;
    }