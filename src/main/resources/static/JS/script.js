const passwordInput = document.getElementById('password');
    const confirmPasswordInput = document.getElementById('confirmPassword');
    const matchFeedback = document.getElementById('passwordMatchFeedback');
    const successFeedback = document.getElementById('passwordMatchSuccess');

    // Function to check password match
    const checkPasswordMatch = () => {
        const password = passwordInput.value;
        const confirmPassword = confirmPasswordInput.value;

        if (confirmPassword.length === 0) {
            confirmPasswordInput.classList.remove('is-invalid');
            confirmPasswordInput.classList.remove('is-valid');
            matchFeedback.style.display = 'none';
            successFeedback.style.display = 'none';
            return;
        }

        if (password === confirmPassword) {
            confirmPasswordInput.classList.remove('is-invalid');
            confirmPasswordInput.classList.add('is-valid');
            matchFeedback.style.display = 'none';
            successFeedback.style.display = 'block';
        } else {
            confirmPasswordInput.classList.add('is-invalid');
            confirmPasswordInput.classList.remove('is-valid');
            matchFeedback.style.display = 'block';
            successFeedback.style.display = 'none';
        }
    };

    // Add event listeners for live feedback
    passwordInput.addEventListener('input', checkPasswordMatch);
    confirmPasswordInput.addEventListener('input', checkPasswordMatch);

    // Main validation function for form submission
    const validatePassword = (event) => {
        // Run the visual check one last time
        checkPasswordMatch();

        if (passwordInput.value !== confirmPasswordInput.value) {
            // Prevent form submission if passwords don't match
            event.preventDefault();
            // Ensure the invalid state is visible
            confirmPasswordInput.classList.add('is-invalid');
            // Alert user (optional, but ensures they see the error)
            alert("Registration failed: Passwords do not match.");
            return false;
        }

        // Let form submit if all validation passes
        return true;
    };

    // Attach the main validation function to the form submit
    document.getElementById('registrationForm').addEventListener('submit', validatePassword);