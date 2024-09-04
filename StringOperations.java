/***
When the program is run, the user will first enter a string. After that, the program should
ask the user which operation they want to execute on the string. The available operations are
listed below: Append, CountWords, Replace, isPalindrome, Splice, Split,
MaxRepeatingCharacter, Sort, Shift, and Reverse. Each method should perform its
respective operation based on the user's input.

Created by-Kalpana 
Date:04 September 2024
  **/

package codeup_Assign;

 import java.util.*;

public class StringOperations {

    // Method to append a new string to the current string
    public static void append(StringBuilder curString) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the NewString: ");
        String newString = scanner.nextLine();
        curString.append(" ").append(newString);
    }

    // Method to count the number of words in the string
    public static int countWords(String curString) {
        String[] words = curString.trim().split("\\s+");
        return words.length;
    }

    // Method to replace all occurrences of a character in the string
    public static void replace(StringBuilder curString, char oldChar, char newChar) {
        for (int i = 0; i < curString.length(); i++) {
            if (curString.charAt(i) == oldChar) {
                curString.setCharAt(i, newChar);
            }
        }
    }

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String curString) {
        int length = curString.length();
        for (int i = 0, j = length - 1; j > i; i++, j--) {
            if (curString.charAt(i) != curString.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    // Method to splice the string based on given indices
    public static void splice(int start, int end, String curString) {
        if (start < 0 || end < 0 || start >= curString.length() || end >= curString.length() || start > end) {
            System.out.println("Invalid indices.");
            return;
        }
        String result = curString.substring(0, start) + curString.substring(end + 1);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder s = new StringBuilder(scanner.nextLine());

        while (true) {
            System.out.println("Which of the following operations do you want to execute:");
            System.out.println("1. Append");
            System.out.println("2. Count Words");
            System.out.println("3. Replace");
            System.out.println("4. Is Palindrome");
            System.out.println("5. Splice");
            System.out.println("6. Split (Not Implemented)");
            System.out.println("7. Max Repeat (Not Implemented)");
            System.out.println("8. Sort (Not Implemented)");
            System.out.println("9. Shift (Not Implemented)");
            System.out.println("10. Reverse (Not Implemented)");
            System.out.print("Choose one of the above options: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    append(s);
                    System.out.println("Updated String: " + s);
                    break;
                case 2:
                    System.out.println("Word Count: " + countWords(s.toString()));
                    break;
                case 3:
                    System.out.print("Enter the character to replace: ");
                    char oldChar = scanner.next().charAt(0);
                    System.out.print("Enter the replacement character: ");
                    char newChar = scanner.next().charAt(0);
                    replace(s, oldChar, newChar);
                    System.out.println("Updated String: " + s);
                    break;
                case 4:
                    System.out.println("Is Palindrome: " + (isPalindrome(s.toString()) ? "true" : "false"));
                    break;
                case 5:
                    System.out.print("Enter the starting index: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter the ending index: ");
                    int end = scanner.nextInt();
                    splice(start, end, s.toString());
                    break;
                // Cases for unimplemented functionalities
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Function not implemented yet.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid operation.");
                    break;
            }

            System.out.print("Do you want to run the program again (1 for Yes, 0 for No): ");
            int runAgain = scanner.nextInt();
            if (runAgain != 1) {
                break;
            }
        }
        scanner.close();
    }
}