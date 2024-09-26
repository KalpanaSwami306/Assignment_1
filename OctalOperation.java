/***
 * In this file all operation are related to  Octal Number

 * Program_owner : Kalpana Swami
 * Date : 24 September 2024
 */
package NumberConversion;

import java.util.*;

class OctalOperation {
    // checkOctal function is used to check whether a number is Octal or not
    // Parameter : long
    // Return-Type: boolean
    public static boolean checkOctal(long number){
        if(number < 0) return false;
        if(number == 0) return true;
        if(number % 10 > 8 ){
            return false;
        }
        return checkOctal(number / 10);
    }
    // OctalToDecimal function is used to convert octal to decimal Number
    // Parameter : long , Integer
    // Return-Type: long
    public static long OctalToDecimal(long number,int UnityVariable){
        if(number == 0){
            return 0;
        }
        long remainder = number % 10;
        long  OutputNumber1 = UnityVariable * remainder;
        long OutputNumber2 = OctalToDecimal(number / 10,UnityVariable * 8 );
        return  OutputNumber1 + OutputNumber2;
    }
    public static void Choose_3() {
        Scanner UserChoice = new Scanner(System.in);
        Constant constant = new Constant();
        InvalidString InvalidInput = new InvalidString();
        char Choose;
        do{
            System.out.println(constant.SELECT_STRING);
            System.out.println("1. " + constant.CHOICE1);
            System.out.println("2. " + constant.CHOICE2);
            System.out.println("3. " + constant.CHOICE4);
            System.out.println(constant.ENTER_STRING);
            String UserInput = UserChoice.nextLine();
            switch (UserInput){
                case "1":{
                    char SelectAgain = '0';
                    do{
                    try {
                        System.out.println(constant.OCTAL_NUMBER);
                        long Number = UserChoice.nextLong();
                        if(checkOctal(Number)){
                             long Decimal_Number = OctalToDecimal(Number,1);
                            System.out.println(DecimalOperation.DecimalToBinary(Decimal_Number));
                        }else {
                            System.out.println(InvalidInput.INVALID);
                            SelectAgain = '1';
                        }
                    } catch (Exception e) {
                        System.out.println(InvalidInput.INVALID);
                        SelectAgain = '1';
                    }
                    }while( SelectAgain == '1');
                    break;}
                case "2":{
                    char SelectAgain = '0';
                    do{
                    try {
                        System.out.println(constant.OCTAL_NUMBER);
                        long Number = UserChoice.nextLong();
                        if(checkOctal(Number)){
                            System.out.println(OctalToDecimal(Number,1));
                        }else {
                            System.out.println(InvalidInput.INVALID);
                            SelectAgain = '1';
                        }
                    } catch (Exception e) {
                        System.out.println(InvalidInput.INVALID);
                        SelectAgain = '1';
                    }}while( SelectAgain == '1');
                    break;}
                case "3":{
                    char SelectAgain = '0';
                    do{
                    try {
                        System.out.println(constant.OCTAL_NUMBER);
                        long Number = UserChoice.nextLong();
                        if(checkOctal(Number)){
                            long Decimal_Number = OctalToDecimal(Number,1);
                            System.out.println(DecimalOperation.DecimalToHexadecimal(Decimal_Number));
                        }else {
                            System.out.println(InvalidInput.INVALID);
                            SelectAgain = '1';
                        }
                    } catch (Exception e) {
                        System.out.println(InvalidInput.INVALID);
                        SelectAgain = '1';
                    }}while( SelectAgain == '1');
                    break;}
                default:{
                    System.out.println(InvalidInput.INVALID_CHOICE);
                    break;
                }
            }
            System.out.println(constant.EXECUTE);
            Choose = UserChoice.next().charAt(0);
            UserChoice.nextLine();
        }while(Objects.equals(Choose, '1'));
    }
}
