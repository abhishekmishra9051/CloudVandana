function sortArrayDescending(arr) {
    return arr.sort((a, b) => b - a);
}

const inputArrayString = prompt("Enter comma-separated numbers to sort in descending order:");
const inputArray = inputArrayString.split(',').map(Number);

console.log("Original array:", inputArray);
const sortedArray = sortArrayDescending(inputArray);
console.log("Sorted array (descending):", sortedArray);
