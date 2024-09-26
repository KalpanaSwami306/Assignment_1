/***
 * In this file all operation are related to Decimal Number

 * Program_owner : Kalpana Swami
 * Date : 24 September 2024
 */
package NumberConversion;

import java.util.*;

class DecimalOperation {
    // DecimalToBinary function is used to convert decimal to binary Number
    // Parameter : long
    // Return-Type: long
    public static long DecimalToBinary(long number){
        if(number == 0 || number == 1){
            return number;
        }
        long Output = DecimalToBinary(number/2);
        long reminder = number % 2;
        return Output * 10 + reminder;
    }
    // DecimalToOctal function is used to convert decimal to Octal Number
    // Parameter : long
    // Return-Type: long
    public static long DecimalToOctal(long number){
        if(number >= 0 && number < 8){
            return number;
        }
        long OutputNumber1 = number % 8 ;
        long OutputNumber2 = DecimalToOctal(number / 8);
        return OutputNumber2 * 10 + OutputNumber1;
    }
    // DecimalToHexadecimal function is used to convert decimal to hexadecimal Number
    // Parameter : long
    // Return-Type: string
    public static String DecimalToHexadecimal(long number){
        if(number == 0){
            return "0";
        }
        char[] hexadecimalCharacter = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] Result = new char[20];
        int index=0;
        while(number > 0){
            long remainder = number % 16;
            Result[index++] = hexadecimalCharacter[(int)remainder];
            number = number / 16;
        }
        StringBuilder ResultString = new StringBuilder();
        int  j = index - 1;
        while(j >= 0 ){
            ResultString.append(Result[j]);
            j--;
        }
        return ResultString.toString();
    }
    public static void Choose_2() {
        Scanner UserNumber = new Scanner(System.in);
        Constant constant = new Constant();
        InvalidString InvalidInput = new InvalidString();
        char Choose;
        do{
            System.out.println(constant.SELECT_STRING);
            System.out.println("1. " + constant.CHOICE1);
            System.out.println("2. " + constant.CHOICE3);
            System.out.println("3. " + constant.CHOICE4);
            System.out.println(constant.ENTER_STRING);
            String UserInput = UserNumber.nextLine();
            switch (UserInput){
                case "1":{
                    char SelectAgain = '0';
                    do{
                    try {
                        System.out.println(constant.DECIMAL_NUMBER);
                        long Number = UserNumber.nextLong();
                        System.out.println(DecimalToBinary(Number));
                    } catch (Exception e) {
                        System.out.println(InvalidInput.INVALID);
                        SelectAgain = '1';
                    }}while(SelectAgain != '0');
                    break;}
                case "2":{
                    char SelectAgain = '0';
                    do{
                    try {
                        System.out.println(constant.DECIMAL_NUMBER);
                        long Number = UserNumber.nextLong();
                        System.out.println(DecimalToOctal(Number));
                    } catch (Exception e) {
                        System.out.println(InvalidInput.INVALID);
                        SelectAgain = '1';
                    }}while(SelectAgain != '0');
                    break;}
                case "3":{
                    char SelectAgain = '0';
                    do{
                    try {
                        System.out.println(constant.DECIMAL_NUMBER);
                        long Number = UserNumber.nextLong();
                        System.out.println(DecimalToHexadecimal(Number));
                    } catch (Exception e) {
                        System.out.println(InvalidInput.INVALID);
                        SelectAgain = '1';
                    }}while(SelectAgain != '0');
                    break;}
                default:{
                    System.out.println(InvalidInput.INVALID_CHOICE);
                    break;
                }
            }
            System.out.println(constant.EXECUTE);
            Choose = UserNumber.next().charAt(0);
            UserNumber.nextLine();
        }while(Objects.equals(Choose, '1'));
    }
}

