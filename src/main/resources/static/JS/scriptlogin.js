function validateForm() {
        const usernameInput = document.getElementById('username');
        const passwordInput = document.getElementById('password');
        let isValid = true;

        // Simple check for username emptiness
        if (usernameInput.value.trim() === '') {
            usernameInput.classList.add('is-invalid');
            document.getElementById('usernameFeedback').textContent = 'Username/ID is required.';
            isValid = false;
        } else {
            usernameInput.classList.remove('is-invalid');
        }

        // Simple check for password emptiness
        if (passwordInput.value.trim() === '') {
            passwordInput.classList.add('is-invalid');
            document.getElementById('passwordFeedback').textContent = 'Password is required.';
            isValid = false;
        } else {
            passwordInput.classList.remove('is-invalid');
        }

        return isValid;
    }

    // Optional: Remove validation messages on input
    document.getElementById('loginForm').addEventListener('input', function(e) {
        if (e.target.classList.contains('is-invalid')) {
            e.target.classList.remove('is-invalid');
        }
    });