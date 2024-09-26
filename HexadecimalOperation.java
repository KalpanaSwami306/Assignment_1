/***
 * In this file all operation are related to Hexadecimal Number

 * Program_owner : Kalpana Swami
 * Date : 24 September 2024
 */
package NumberConversion;

import java.util.*;

class HexadecimalOperation {
    // checkHexadecimal function is used to check whether a number is Hexadecimal or not
    // Parameter : String
    // Return-Type: boolean
    public static boolean checkHexadecimal(String input) {
      for(int i=0;i<input.length();i++){
          if(input.charAt(i) < '0' || input.charAt(i) > '9' && input.charAt(i) < 'A' || input.charAt(i) > 'F' && input.charAt(i) < 'a' || input.charAt(i) > 'f'){
              return false;
          }
      }
       return true;
    }
    // HexadecimalToDecimal function is used to convert Hexadecimal to decimal Number
    // Parameter : String
    // Return-Type: long
    public static long HexadecimalToDecimal(String input ){
        int base = 16;
        long sum = 0;
        for(int i=0 ; i<input.length();i++){
            char character = input.charAt(i);
            int digit;
            if(character >= 48 && character <= 57){
                digit = character - '0';
            }else if(character >= 65 && character <= 70 ){
                digit = character - 55;
            }else{
                digit = character - 87;
            }
            sum = sum * base + digit;
        }
        return sum;
    }
    public static void Choose_4() {
        Scanner UserInputChoice = new Scanner(System.in);
        Constant constant = new Constant();
        InvalidString InvalidInput = new InvalidString();
        char Choose;
        do{
            System.out.println(constant.SELECT_STRING);
            System.out.println("1. " + constant.CHOICE1);
            System.out.println("2. " + constant.CHOICE2);
            System.out.println("3. " + constant.CHOICE3);
            System.out.println(constant.ENTER_STRING);
            String UserInput = UserInputChoice.nextLine();
            switch (UserInput){
                case "1":{
                    char SelectAgain = '0';
                    do{
                    System.out.println(constant.HEX_NUMBER);
                    String Number = UserInputChoice.nextLine();
                    String StoreVariable = Number.trim();
                    if(checkHexadecimal(StoreVariable)){
                        long Decimal_Number = HexadecimalToDecimal(StoreVariable);
                        System.out.println(DecimalOperation.DecimalToBinary(Decimal_Number));
                    }
                    else{
                        System.out.println(InvalidInput.INVALID);
                        SelectAgain = '1';
                    }}while(SelectAgain == '1');
                    break;}
                case "2":{
                    char SelectAgain = '0';
                    do{
                    System.out.println(constant.HEX_NUMBER);
                    String Number = UserInputChoice.nextLine();
                    String StoreVariable = Number.trim();
                    if(checkHexadecimal(StoreVariable)){
                        System.out.println(HexadecimalToDecimal(StoreVariable));
                    }
                    else{
                        System.out.println(InvalidInput.INVALID);
                        SelectAgain = '1';
                    }}while(SelectAgain == '1');
                    break;}
                case "3":{
                    char SelectAgain = '0';
                    do{
                    System.out.println(constant.HEX_NUMBER);
                    String Number = UserInputChoice.nextLine();
                    String StoreVariable = Number.trim();
                    if(checkHexadecimal(Number)){
                        long Decimal_Number = HexadecimalToDecimal(StoreVariable);
                        System.out.println(DecimalOperation.DecimalToOctal(Decimal_Number));
                    }
                    else{
                        System.out.println(InvalidInput.INVALID);
                        SelectAgain = '1';
                    }}while(SelectAgain == '1');
                    break;}
                default:{
                    System.out.println(InvalidInput.INVALID_CHOICE);
                    break;
                }
            }
            System.out.println(constant.EXECUTE);
            Choose = UserInputChoice.next().charAt(0);
            UserInputChoice.nextLine();
        }while(Objects.equals(Choose, '1'));
    }
}
