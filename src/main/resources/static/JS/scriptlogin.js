function validateForm() {
        let isValid = true;
        const usernameInput = document.getElementById('username');
        const passwordInput = document.getElementById('password');

        // Check Username/ID
        if (usernameInput.value.trim() === "") {
            usernameInput.classList.add('is-invalid');
            document.getElementById('usernameFeedback').innerText = 'Email or Library ID is required.';
            isValid = false;
        } else {
            usernameInput.classList.remove('is-invalid');
        }

        // Check Password
        if (passwordInput.value === "") {
            passwordInput.classList.add('is-invalid');
            document.getElementById('passwordFeedback').innerText = 'Password is required.';
            isValid = false;
        } else {
            passwordInput.classList.remove('is-invalid');
        }

        return isValid;
    }