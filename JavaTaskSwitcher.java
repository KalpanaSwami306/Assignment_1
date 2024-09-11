/***
 * Today we are doing five tasks. Each task perform different function .
 * All Task done without using for/while loops in the function

 * Program owner- Kalpana Swami
 * Date : 11 september 2024
 */

import java.util.*;
public class JavaTaskSwitcher {
    private static int expand(String s, int i, int j) {
        if (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            return 1 + expand(s, i - 1, j + 1);
        }
        return 0;
    }
    public static int stringCount(String s) {
        return countPalindromicSubstrings(s, 0);
    }
    private static int countPalindromicSubstrings(String s, int i) {
        if (i >= s.length()) {
            return 0;
        }
        int Odd_Output = expand(s, i, i);
        int Even_Output = expand(s, i, i + 1);
        return  Odd_Output + Even_Output + countPalindromicSubstrings(s, i + 1);
    }

//    Write a Java program to print the nth number in the Fibonacci series without using loops.
//    example. input = 13 then output = 233
    public static int NthFibonacci(int number ){
      if(number == 0 || number == 1){ return number;}
        return NthFibonacci(number -1 ) + NthFibonacci(number -2 );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConstantSting constant = new ConstantSting();
        String choice ;
        do{
            System.out.println(constant.INPUT_STRING);
            System.out.println(constant.TASK1);
            System.out.println(constant.TASK2);
            System.out.println(constant.TASK3);
            System.out.println(constant.TASK4);
            System.out.println(constant.TASK5);
            System.out.println(constant.CHOICE);
            choice = scanner.nextLine();
            InvalidConstant constant1 = new InvalidConstant();
            switch(choice){
                case "1" :
                    try {
                        System.out.println(constant.INPUT_STRING2);
                        Scanner scanner2 = new Scanner(System.in);
                        String Input_string = scanner2.nextLine();
                        System.out.println(stringCount( Input_string) - 2);
                        } catch(InputMismatchException e){
                            System.out.println(constant1.INVALID1);
                        }
                    break;
                case "2" : try{
                    System.out.println(constant.NUMBER_INPUT);
                    Scanner scanner1 = new Scanner(System.in);
                    int number = scanner1.nextInt();
                    System.out.println(NthFibonacci(number));}
                   catch(InputMismatchException e){
                       System.out.println(constant1.INVALID1);
                   }
                    break;
                case "3" : break;
                case "4" : break;
                case "5" : break;
                default :{
                    System.out.println(constant1.INVALID1);
                     break;}
            }
            System.out.println(constant.EXECUTE);
            Scanner input = new Scanner(System.in);
            choice = input.nextLine();
        }while(Objects.equals(choice, "1"));
            
    }
}
