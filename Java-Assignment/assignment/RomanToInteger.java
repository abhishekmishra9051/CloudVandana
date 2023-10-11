package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    public static Map<Character, Integer> mapRomanToIntegerMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanToIntegerMap = mapRomanToIntegerMap();

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanToIntegerMap.get(s.charAt(i));
            if (currValue >= prevValue) {
                total += currValue;
            } else {
                total -= currValue;
            }
            prevValue = currValue;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        scanner.close();

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer : " + result);
    }

}



