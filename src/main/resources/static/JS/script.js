function validatePassword() {
        const password = document.getElementById('password').value;
        const confirmPassword = document.getElementById('confirmPassword').value;
        const feedback = document.getElementById('passwordMatchFeedback');
        const confirmInput = document.getElementById('confirmPassword');

        if (password !== confirmPassword) {
            // Show Bootstrap validation feedback
            confirmInput.classList.add('is-invalid');
            feedback.style.display = 'block';
            return false; // Prevent form submission
        } else {
            // Remove feedback if they match
            confirmInput.classList.remove('is-invalid');
            feedback.style.display = 'none';
            return true; // Allow form submission
        }
    }