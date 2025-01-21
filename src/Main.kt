import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    println("Enter a sentence to convert to Pig Latin:")

    // Read the entire line input by the user
    val enteredSentence = reader.nextLine()

    val words = enteredSentence.split(" ")

    val convertedWords = mutableListOf<String>()

    // Loop through each word and convert it to Pig Latin
    for (word in words) {
        val firstLetter = word.substring(0, 1)

        // Initialize convertedWord
        val convertedWord = when (firstLetter.lowercase()) {
            "a", "e", "i", "o", "u" -> {
                // If the first letter is a vowel, append "yay"
                word + "yay"
            }
            else -> {
                word.substring(1) + firstLetter + "ay"
            }
        }
        //Add words join list
        convertedWords.add(convertedWord)
    }

    val convertedSentence = convertedWords.joinToString(" ")

    // Print the Pig Latin version of the entered sentence
    println("The Pig Latin version of the sentence is: '$convertedSentence'.")
}