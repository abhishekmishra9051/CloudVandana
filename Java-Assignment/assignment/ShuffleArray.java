package assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int[] array = {1, 2, 3, 4, 5, 6, 7};

//        Using Scanner to take input from the user
/*        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        */

        System.out.println("Original Array: " + Arrays.toString(array));

        shuffleArray(array);

        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
