function reverseWords(sentence) {
    let reversedSentence = sentence.split(' ').map(word => {
        return word.split('').reverse().join('');
    }).join(' ');

    return reversedSentence;
}

const inputSentence = prompt("Enter a sentence:");
const reversedSentence = reverseWords(inputSentence);

console.log("Original sentence:", inputSentence);
console.log("Reversed sentence:", reversedSentence);
