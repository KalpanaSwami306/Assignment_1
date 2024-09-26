/***
 * In this file all operation are related to Binary Number

 * Program_owner : Kalpana Swami
 * Date : 24 September 2024
 */
package NumberConversion;

import java.util.*;

 class BinaryOperation {
     //checkBinary function is used to check the number is binary or not
     // Parameter : long
     // Return-Type: Boolean
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
     // BinaryToDecimal function is used to convert binary to decimal Number
     // Parameter : long , Integer
     // Return-Type: long
     public static long BinaryToDecimal(long number,int UnityVariable){
         if(number == 0){
             return 0;
         }
         long remainder = number % 10;
         long  OutputNumber1 = UnityVariable * remainder;
         long OutputNumber2 = BinaryToDecimal(number / 10,UnityVariable * 2 );
         return  OutputNumber1 + OutputNumber2;
     }
     // BinaryToOctal function is used to convert binary to  Octal Number
     // Parameter : long , Integer
     // Return-Type: long
     public static long BinaryToOctal(long number){
         if(number >= 0 && number < 8){
             return number;
         }
         long OutputNumber1 = number % 8 ;
         long OutputNumber2 = BinaryToOctal(number / 8);
        return OutputNumber2 * 10 + OutputNumber1;
     }
    public static void Choose_1() {
        Scanner scanner = new Scanner(System.in);
        Constant constant = new Constant();
        InvalidString InvalidString = new InvalidString();
        char Choose;
        do{
        System.out.println(constant.SELECT_STRING);
        System.out.println("1. " + constant.CHOICE2);
        System.out.println("2. " + constant.CHOICE3);
        System.out.println("3. " + constant.CHOICE4);
        System.out.println(constant.ENTER_STRING);
        String UserChoice = scanner.nextLine();
        switch (UserChoice){
            case "1":{
                char Again = '0';
                do{
                try{
                    System.out.println(constant.BINARY_NUMBER);
                    Scanner userInput = new Scanner(System.in);
                    long InputNumber = userInput.nextLong();
                    if(checkBinary(InputNumber)){
                        System.out.println(BinaryToDecimal(InputNumber,1));
                    }
                    else{
                        System.out.println(InvalidString.INVALID);
                        Again = '1';
                    }
                } catch(InputMismatchException e){
                    System.out.println(InvalidString.INVALID);
                    Again = '1';
                }
                }while(Again == '1');
                break;}
            case "2":{
                char Again = '0';
                do {
                    try {
                        System.out.println(constant.BINARY_NUMBER);
                        Scanner userInput = new Scanner(System.in);
                        long InputNumber = userInput.nextLong();
                        if (checkBinary(InputNumber)) {
                            long DecimalNumber = BinaryToDecimal(InputNumber, 1);
                            System.out.println(BinaryToOctal(DecimalNumber));
                        } else {
                            System.out.println(InvalidString.INVALID);
                            Again = '1';
                        }
                    } catch (InputMismatchException e) {
                        System.out.println(InvalidString.INVALID);
                        Again = '1';
                    }
                }while(Again == '1');
                break;}
            case "3":{
                char Again = '0';
                do {
                    try {
                        System.out.println(constant.BINARY_NUMBER);
                        Scanner user_number = new Scanner(System.in);
                        long UserNumber = user_number.nextLong();
                        if (checkBinary(UserNumber)) {
                            long DecimalNumber = BinaryToDecimal(UserNumber, 1);
                            System.out.println(DecimalOperation.DecimalToHexadecimal(DecimalNumber));
                        } else {
                            System.out.println(InvalidString.INVALID);
                            Again = '1';
                        }
                    } catch (InputMismatchException e) {
                        System.out.println(InvalidString.INVALID);
                        Again = '1';
                    }
                }while(Again == '1');
                break;}
            default:{
                System.out.println(InvalidString.INVALID_CHOICE);
                break;
            }
        }
        System.out.println(constant.EXECUTE);
        Choose = scanner.next().charAt(0);
        scanner.nextLine();
    }while(Objects.equals(Choose, '1'));
    }

 }
