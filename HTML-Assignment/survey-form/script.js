const countries = ['India', 'USA', 'Canada', 'Australia', 'United Kingdom','China',
                    'Japan','Russia','Germany','France','Brazil','South Korea','Italy','Spain',
                    'Mexico','Indonesia','Turkey','Saudi Arabia','South Africa','Egypt'];

const countrySelect = document.getElementById('country');

countries.forEach(country => {
    const option = document.createElement('option');
    option.value = country;
    option.textContent = country;
    countrySelect.appendChild(option);
});

function resetForm() {
    document.getElementById('surveyForm').reset();
}

function submitForm() {
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const genderRadios = document.getElementsByName('gender');
    let selectedGender = '';
    for (const radio of genderRadios) {
        if (radio.checked) {
            selectedGender = radio.value;
            break;
        }
    }
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    if (!firstName || !lastName || !dob || !country || !selectedGender || !profession || !email || !mobile) {
        alert('Please fill in all the required fields.');
        return;
    }

    const popupContent = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${selectedGender}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    document.getElementById('popupContent').innerHTML = popupContent;
    document.getElementById('popup').style.display = 'block';
}

function closePopup() {
    document.getElementById('popup').style.display = 'none';
}
