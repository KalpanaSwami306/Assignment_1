/***
 * The program should run automatically once executed, and the user should
    have the option to switch between tasks and execute them as needed.
 * Program owner - Kalpana Swami
 * Date : 09 september 2024
 */

import java.util.*;
public class StringFunction {
//    Write a Java program that generates all valid combinations of the string pairs of
//parentheses. Each combination should be unique and well-formed.
        public static void validParentheses(String input, String output, int index) {
            if (index >= input.length()) {
                System.out.print(" ' " + output + " ' ");
                return;
            }
            char character = input.charAt(index);
            validParentheses(input, output, index + 1);
            validParentheses(input, output + character , index + 1);
        }
// Write a Java program that continuously takes a number as input and replaces it with the sum of
//its digits until the number is reduced to a single digit.
        public static int digitSum(int number, int sumVariable) {
             if (number == 0) {
                return sumVariable;
            }
            int digit = number % 10;
            sumVariable += digit;
            return digitSum(number / 10, sumVariable);
        }
//Write a Java program that finds whether a given number can be expressed as the sum of two or
//more consecutive natural numbers. If possible, the program should print all possible
//combinations of consecutive natural numbers that sum up to the given number.
        public static void consecutiveSum(int Input_Number) {
            Constant constant2 = new Constant();
            int countSum = 0;
            for (int i = 1; i < Input_Number; i++) {
                int sum = 0;
                for (int j = i; j < Input_Number; j++) {
                    sum += j;
                    if (sum == Input_Number) {
                        countSum++;
                        for (int k = i; k < j; k++) {
                            System.out.print(k + "+");
                        }
                        System.out.println(j);
                    }
                }
            }
            if (countSum == 0) {
                System.out.println(constant2.NO_SUM);
            }
        }
//Description: Write a program that implements the Caesar Cipher encryption technique
//but with a twist. The program should take an input string and a shift pattern array. For
//each character in the string, apply the corresponding shift value from the pattern array. If
//the pattern array length is shorter than the input string, repeat the pattern.
    public static String caesarCipherWithPattern(String input, int[] pattern) {
        StringBuilder result = new StringBuilder();
        int patternLength = pattern.length;
        int inputLength = input.length();

        for (int i = 0; i < inputLength; ++i) {
            char currentChar = input.charAt(i);
            int shift = pattern[i % patternLength];

            if (currentChar >= 'a' && currentChar <= 'z') {
                // Encrypt lowercase letters
                char encryptedChar = (char) ('a' + (currentChar - 'a' + shift) % 26);
                result.append(encryptedChar);
            } else if (currentChar >= 'A' && currentChar <= 'Z') {
                // Encrypt uppercase letters
                char encryptedChar = (char) ('A' + (currentChar - 'A' + shift) % 26);
                result.append(encryptedChar);
            } else {
                // Non-alphabetic characters remain unchanged
                result.append(currentChar);
            }
        }

        return result.toString();
    }
//Write a Java program that takes an unsorted array of digits and a series of integers. It encodes
//the highest digits, based on the provided series, into their corresponding ASCII characters.
    public static void encodedASCII(char[] arrayOfCharacter, int series){
            Constant constant3 = new Constant();
        Arrays.sort(arrayOfCharacter);
        for(int i = 0,j=arrayOfCharacter.length-1;i< arrayOfCharacter.length/2 ;i++,j--) {
            char temp = arrayOfCharacter[i];
            arrayOfCharacter[i] = arrayOfCharacter[j];
            arrayOfCharacter[j] = temp;
        }
        StringBuilder result = new StringBuilder();
        String seriesString = String.valueOf(series);
        for(int i = 0; i < seriesString.length(); i++){
            int index = Character.getNumericValue(seriesString.charAt(i)) - 1;
            if (index >= 0 && index < arrayOfCharacter.length) {
                result.append((int)arrayOfCharacter[index]);
            }
            if(index > arrayOfCharacter.length-1 || index <0){
                System.out.println(constant3.INVALID_SERIES);
            }
        }
        System.out.println(result);
    }
        public static  void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Constant constant = new Constant();
            String CHOOSE;
            do {
                System.out.println(constant.INPUT_STRING);
                System.out.println(constant.TASK1);
                System.out.println(constant.TASK2);
                System.out.println( constant.TASK3);
                System.out.println(constant.TASK4);
                System.out.println(constant.TASK5);
                System.out.println(constant.EXIT);
                System.out.print(constant.CHOICE);
                char choice = scanner.next().charAt(0);

                switch (choice) {
                    case '1': {
                        System.out.println(constant.ENTER_INPUT);
                        String newString = scanner.next();
                        System.out.print('[');
                        validParentheses(newString, "", 0);
                        System.out.println(']');
                        break;
                    }
                    case '2': {
                      try{  System.out.println(constant.INPUT_NUMBER);
                        int num = scanner.nextInt();
                        if (num< 0) {
                            System.out.println(constant.INVALID);
                        } else {
                            int outputNum = digitSum(num, 0);
                            while (outputNum > 10) {
                                outputNum = digitSum(outputNum, 0);
                            }
                            System.out.println(constant.SUM + num + constant.IS + outputNum);
                        }}
                      catch(InputMismatchException e){
                          System.out.println(constant.INVALID_INDEX);
                      }
                        break;
                    }
                    case '3': {
                        try{
                        System.out.println(constant.INPUT_NUMBER);
                        int num = scanner.nextInt();
                        if (num < 0) {
                            System.out.println(constant.INVALID);
                        } else {
                            consecutiveSum(num);
                        }}
                        catch(InputMismatchException e){
                            System.out.println(constant.INVALID_INDEX);
                        }
                        break;
                    }
                    case '4': {
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.print(constant.INPUT_STRING1);
                        String input = scanner1.nextLine();
                        System.out.print(constant.SHIFT_NUMBER);
                        int patternLength = scanner1.nextInt();
                        int[] pattern = new int[patternLength];
                        System.out.print(constant.SHIFT_VALUE);
                        for (int i = 0; i < patternLength; ++i) {
                            pattern[i] = scanner1.nextInt();
                        }
                        String encrypted = caesarCipherWithPattern(input, pattern);
                        System.out.println( constant.OUTPUT_STRING + encrypted);
                        break;
                    }
                    case '5': {
                        try{
                        Scanner scan = new Scanner(System.in);
                        System.out.println(constant.ARRAY_SIZE);
                        int size = scan.nextInt();
                        char[] arrayOfCharacter = new char[size];
                        System.out.println(constant.ARRAY_INPUT);
                        for (int i = 0; i < arrayOfCharacter.length; i++) {
                            arrayOfCharacter[i] = scan.next().charAt(0);
                        }
                        System.out.println(constant.SERIES_VALUES);
                        int series = scan.nextInt();
                        encodedASCII(arrayOfCharacter,series);}
                        catch(InputMismatchException e){
                            System.out.println(constant.INVALID_INDEX);
                        }
                        break;
                    }
                    case '6': {
                        scanner.close();
                        return;
                    }
                    default: {
                        System.out.println(constant.INVALID1);
                        break;
                    }
                }
                System.out.println(constant.EXECUTE);
                Scanner input = new Scanner(System.in);
                CHOOSE = input.nextLine();
            }while(Objects.equals(CHOOSE, "1"));
        }
    }

