/***
 * Today we are doing five tasks. Each task perform different function .
 * All Task done without using for/while loops in the function

 * Program owner- Kalpana Swami
 * Date : 11 september 2024
 */

import java.util.*;
public class JavaTaskSwitcher {

//    Write a Java program that takes a string as input and calculates the number of unique
//     combinations where a palindrome is formed.
    private static int expandPalindromicSubstrings(String newstring, int StartPosition, int EndPosition) {
        if (StartPosition >= 0 &&  EndPosition < newstring.length()  && newstring.charAt(StartPosition) == newstring.charAt( EndPosition)) {
            return 1 + expandPalindromicSubstrings(newstring, StartPosition - 1,  EndPosition + 1);
        }
        return 0;
    }
    public static int PalindromicStringCount(String newstring) {
        return countPalindromicSubstrings(newstring, 0);
    }
    private static int countPalindromicSubstrings(String newstring, int index) {
        if (index >= newstring.length()) {
            return 0;
        }
        int Odd_Output = expandPalindromicSubstrings(newstring,index, index);
        int Even_Output = expandPalindromicSubstrings(newstring, index, index + 1);
        return  Odd_Output + Even_Output + countPalindromicSubstrings(newstring, index + 1);
    }

//    Write a Java program to print the nth number in the Fibonacci series without using loops.
//    example. input = 13 then output = 233
    public static int NthFibonacci(int number ){
      if(number == 0 || number == 1){ return number;}
        return NthFibonacci(number - 1 ) + NthFibonacci(number - 2 );
    }

//    Write a Java program where the user inputs a string in snake_case. If the string is not in
//    snake_case, first convert it to snake_case, and then to camelCase.
    public static void SnakeToCamel(String newstring ,String OutputString, int index) {
        if (index >= newstring.length()) {
            System.out.println(OutputString);
            return ;
        }
        if (newstring.charAt(index) != '_' && newstring.charAt(index) != ' ') {
            OutputString += Character.toLowerCase(newstring.charAt(index));
        }
        else{
            if (newstring.charAt(index + 1) != '_' && newstring.charAt(index + 1) != ' ') {
                OutputString += Character.toUpperCase(newstring.charAt(index + 1));
                index++;
            }
        }
       SnakeToCamel(newstring,  OutputString ,index+1);

    }
//Write a Java program that takes a string as input and finds the number of consonants in
//the string.
    public static int CountConsonants(String newString , int index ){
        int countConsonants = 0;
        if(index >= newString.length()){
            return  countConsonants;
        }
        if(newString.charAt(index) == 'b' || newString.charAt(index) == 'B' || newString.charAt(index) == 'c' || newString.charAt(index) == 'C' || newString.charAt(index) == 'd' || newString.charAt(index) == 'D' || newString.charAt(index) == 'f' || newString.charAt(index) == 'F' || newString.charAt(index) == 'g' || newString.charAt(index) == 'G' || newString.charAt(index) == 'h' || newString.charAt(index) == 'H' || newString.charAt(index) == 'j' || newString.charAt(index) == 'J' || newString.charAt(index) == 'k' || newString.charAt(index) == 'K' || newString.charAt(index) == 'l' || newString.charAt(index) == 'L' || newString.charAt(index) == 'm' || newString.charAt(index) == 'M' || newString.charAt(index) == 'n' || newString.charAt(index) == 'N' || newString.charAt(index) == 'p' || newString.charAt(index) == 'P' || newString.charAt(index) == 'q' || newString.charAt(index) == 'Q' || newString.charAt(index) == 'r' || newString.charAt(index) == 'R' || newString.charAt(index) == 's' || newString.charAt(index) == 'S' || newString.charAt(index) == 't' || newString.charAt(index) == 'T' || newString.charAt(index) == 'v' || newString.charAt(index) == 'V' || newString.charAt(index) =='w' || newString.charAt(index) == 'W' || newString.charAt(index) == 'x' || newString.charAt(index) == 'X' || newString.charAt(index) == 'y' || newString.charAt(index) == 'Y' || newString.charAt(index) == 'Z' || newString.charAt(index) == 'z' ){
            countConsonants++;
        }
         int count =  CountConsonants(newString,index + 1);
        return count + countConsonants;
    }

//    Write a Java program that takes an integer in binary format and converts it to its decimal
//representation.
    public static boolean checkBinary(long number){
        if(number < 0 ){
            return  false;
        }
        if(number == 0){
            return true;
        }
        if(number % 10 > 1){
            return false;
        }
        return checkBinary(number / 10 );

    }
    public static long BinaryToDecimal(long number,int UnityVariable){
      if(number == 0){
          return 0;
      }
      long remainder = number % 10;
      long  OutputNumber1 = UnityVariable * remainder;
      long OutputNumber2 = BinaryToDecimal(number / 10,UnityVariable * 2 );
      return  OutputNumber1 + OutputNumber2;
   }

//   Main Function:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConstantString constant = new ConstantString();
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
                        Scanner UserInputString = new Scanner(System.in);
                        String Input_string = UserInputString.nextLine();
                        System.out.println(PalindromicStringCount( Input_string) - 2);
                        } catch(InputMismatchException e){
                            System.out.println(constant1.INVALID1);
                        }
                    break;
                case "2" : try{
                    System.out.println(constant.NUMBER_INPUT);
                    Scanner UserNumber = new Scanner(System.in);
                    int number = UserNumber.nextInt();
                    System.out.println(NthFibonacci(number));}
                   catch(InputMismatchException e){
                       System.out.println(constant1.INVALID1);
                   }
                    break;
                case "3" : try{
                    System.out.println(constant.INPUT_STRING2);
                    Scanner UserInput = new Scanner(System.in);
                    String UserString = UserInput.nextLine();
                    String OutputString = "";
                    SnakeToCamel(UserString,OutputString,0);

                } catch(InputMismatchException e){
                    System.out.println(constant1.INVALID1);
                }
                    break;
                case "4" :
                    try{
                        System.out.println(constant.INPUT_STRING2);
                        Scanner UserInput = new Scanner(System.in);
                        String InputString = UserInput.nextLine();
                        System.out.println(CountConsonants(InputString,0));
                        } catch(InputMismatchException e){
                        System.out.println(constant1.INVALID1);}
                          break;
                case "5" :
                    try{
                        System.out.println(constant.INPUT_NUMBER);
                        Scanner userInput = new Scanner(System.in);
                        long InputNumber = userInput.nextLong();
                        if(checkBinary(InputNumber)){
                            System.out.println(BinaryToDecimal(InputNumber,1));
                        }
                        else{
                            System.out.println(constant1.INVALID1);
                        }
                    } catch(InputMismatchException e){
                        System.out.println(constant1.INVALID1);}
                    break;
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
