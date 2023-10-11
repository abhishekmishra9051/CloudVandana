package assignment;

import java.util.Scanner;

public class PangramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Given Sentence = " + sentence);
        scanner.close();

        if (isPangram(sentence))
            System.out.println("\nIt's a pangram sentence.");
        else
            System.out.println("\nIt's not a pangram sentence.");
    }

    public static boolean isPangram(String sentence) {
        if (sentence.length() < 26)
            return false;

        boolean[] alphabetOccurrence = new boolean[26];

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index;
                if (Character.isUpperCase(ch))
                    index = ch - 'A';
                else
                    index = ch - 'a';
                alphabetOccurrence[index] = true;
            }
        }

        for (boolean occurred : alphabetOccurrence) {
            if (!occurred)
                return false;
        }

        return true;
    }
}

