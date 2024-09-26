/***
 * In this Assignment we will do All possible conversion of numbers like :
 * Binary to Decimal,Octal and Hexadecimal
 * Decimal to Binary,Octal and Hexadecimal
 * Octal to  Binary,Hexadecimal and Decimal
 * Hexadecimal to Binary,Octal and Decimal
 * Addition
 * Subtraction

 * Program_owner : Kalpana Swami
 * Date : 24 September 2024
 */
package NumberConversion;

import java.util.*;

public class NumberOperation {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Constant constant = new Constant();
    InvalidString InvalidInput = new InvalidString();
    char Choose ;
    do{
        System.out.println(constant.CHOICE_STRING);
        System.out.println("1. " + constant.CHOICE1);
        System.out.println("2. " + constant.CHOICE2);
        System.out.println("3. " + constant.CHOICE3);
        System.out.println("4. " + constant.CHOICE4);
        System.out.println("5. " + constant.CHOICE5);
        System.out.println("6. " + constant.CHOICE6);
        System.out.println(constant.ENTER_STRING);
        String UserChoice = scanner.nextLine();
        switch (UserChoice){
            case "1":{
                BinaryOperation.Choose_1();
                break;}
            case "2":{
                DecimalOperation.Choose_2();
                break;}
            case "3":{
                OctalOperation.Choose_3();
                break;}
            case "4":{
                HexadecimalOperation.Choose_4();
                break;}
            case "5":{
                Addition.Choose_5();
                break;}
            case "6":{
                Subtraction.Choose_6();
                break;}
            default:{
                System.out.println(InvalidInput.INVALID_CHOICE);
                break;
            }
        }
        System.out.println(constant.EXECUTE);
        Choose = scanner.next().charAt(0);
        scanner.nextLine();
    }while(Objects.equals(Choose, '1'));

}}

