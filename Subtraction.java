/***
 * In this file all operation are related to Subtraction

 * Program_owner : Kalpana Swami
 * Date : 24 September 2024
 */
package NumberConversion;

import java.util.*;

public class Subtraction {
    public static void Choose_6() {
        Scanner NumberType1 = new Scanner(System.in);
        Constant constant = new Constant();
        InvalidString InvalidInput = new InvalidString();
        System.out.println(constant.WARNING);
        System.out.println(constant.NUMBER1);
        String UserString1 =  NumberType1.nextLine();
        System.out.println(constant.NUMBER2);
        String UserString2 =  NumberType1.nextLine();
        switch (UserString1) {
            case "decimal" :{
                switch ( UserString2 ){
                    case "decimal" : {
                        try{
                            System.out.println(constant.Decimal_NUMBER1);
                            long DecimalNumber1 = NumberType1.nextLong();
                            System.out.println(constant.Decimal_NUMBER2);
                            long DecimalNumber2 = NumberType1.nextLong();
                            if(DecimalNumber1 > DecimalNumber2){
                                System.out.println(DecimalNumber1 - DecimalNumber2);
                            }else{
                            System.out.println(DecimalNumber2 - DecimalNumber1);}}
                        catch(Exception e){
                            System.out.println(InvalidInput.INVALID);
                        }
                        break;
                    }
                    case "binary":{
                        try{
                            System.out.println(constant.DECIMAL_NUMBER);
                            long DecimalNumber1 = NumberType1.nextLong();
                            System.out.println(constant.BINARY_NUMBER);
                            long BinaryNumber2 = NumberType1.nextLong();
                            if(BinaryOperation.checkBinary(BinaryNumber2)){
                                long DecimalNumber2 = BinaryOperation.BinaryToDecimal(BinaryNumber2,1);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    case "octal":{
                        try{
                            System.out.println(constant.DECIMAL_NUMBER);
                            long DecimalNumber1 = NumberType1.nextLong();
                            System.out.println(constant.OCTAL_NUMBER);
                            long OctalNumber = NumberType1.nextLong();
                            if(OctalOperation.checkOctal(OctalNumber)){
                                long DecimalNumber2 = OctalOperation.OctalToDecimal(OctalNumber,1);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    case "hexadecimal":{
                        try{
                            System.out.println(constant.DECIMAL_NUMBER);
                            long DecimalNumber1 = NumberType1.nextLong();
                            System.out.println(constant.HEX_NUMBER);
                            String HexNumber = NumberType1.nextLine();
                            String StoreVariable = HexNumber.trim();
                            if(HexadecimalOperation.checkHexadecimal(StoreVariable)){
                                long DecimalNumber2 = HexadecimalOperation.HexadecimalToDecimal(StoreVariable);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    default:{
                        System.out.println(InvalidInput.INVALID);
                        break;}
                }
                break;
            }
            case "binary":{
                switch ( UserString2 ){
                    case "decimal" : {
                        try{
                            System.out.print(constant.DECIMAL_NUMBER);
                            long DecimalNumber2 = NumberType1.nextLong();
                            System.out.print(constant.BINARY_NUMBER);
                            long BinaryNumber1 = NumberType1.nextLong();
                            if(BinaryOperation.checkBinary(BinaryNumber1)){
                                long DecimalNumber1 = BinaryOperation.BinaryToDecimal(BinaryNumber1,1);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        }
                        catch(Exception e){
                            System.out.println(InvalidInput.INVALID);
                        }
                        break;
                    }
                    case "binary":{
                        try{
                            long DecimalNumber1 = 0, DecimalNumber2;
                            System.out.println(constant.BINARY_NUMBER1);
                            long BinaryNumber1 = NumberType1.nextLong();
                            if(BinaryOperation.checkBinary(BinaryNumber1)){
                                DecimalNumber1 = BinaryOperation.BinaryToDecimal(BinaryNumber1,1);
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                            System.out.println(constant.BINARY_NUMBER2);
                            long BinaryNumber2 = NumberType1.nextLong();
                            if(BinaryOperation.checkBinary(BinaryNumber2)){
                                DecimalNumber2 = BinaryOperation.BinaryToDecimal(BinaryNumber2,1);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    case "octal":{
                        try{
                            long DecimalNumber1 = 0, DecimalNumber2 = 0;
                            System.out.println(constant.BINARY_NUMBER);
                            long BinaryNumber1 = NumberType1.nextLong();
                            if(BinaryOperation.checkBinary(BinaryNumber1)){
                                DecimalNumber1 = BinaryOperation.BinaryToDecimal(BinaryNumber1,1);
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                            System.out.print(constant.OCTAL_NUMBER);
                            long OctalNumber = NumberType1.nextLong();
                            boolean Result = OctalOperation.checkOctal(OctalNumber);
                            if(Result){
                                DecimalNumber2 = OctalOperation.OctalToDecimal(OctalNumber,1);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    case "hexadecimal":{
                        try{
                            long Decimal_Number1 = 0, Decimal_Number2 = 0;
                            System.out.println(constant.BINARY_NUMBER);
                            long BinaryNumber1 = NumberType1.nextLong();
                            if(BinaryOperation.checkBinary(BinaryNumber1)){
                                Decimal_Number1 = BinaryOperation.BinaryToDecimal(BinaryNumber1,1);
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                            System.out.println(constant.HEX_NUMBER);
                            String HexNumber = NumberType1.nextLine();
                            String StoreHexNumber = HexNumber.trim();
                            if(HexadecimalOperation.checkHexadecimal(StoreHexNumber)){
                                Decimal_Number2 = HexadecimalOperation.HexadecimalToDecimal(StoreHexNumber);
                                if(Decimal_Number1 > Decimal_Number2){
                                    System.out.println(Decimal_Number1 - Decimal_Number2);
                                }else{
                                    System.out.println(Decimal_Number2 - Decimal_Number1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    default:{
                        System.out.println(InvalidInput.INVALID);
                        break;}
                }
                break;}
            case "octal":{
                switch ( UserString2 ){
                    case "decimal" : {
                        try{
                            System.out.print(constant.DECIMAL_NUMBER);
                            long DecimalNumber2 = NumberType1.nextLong();
                            System.out.print(constant.BINARY_NUMBER);
                            long OctalNumber1 = NumberType1.nextLong();
                            if(OctalOperation.checkOctal(OctalNumber1)){
                                long DecimalNumber1 = OctalOperation.OctalToDecimal(OctalNumber1,1);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        }
                        catch(Exception e){
                            System.out.println(InvalidInput.INVALID);
                        }
                        break;
                    }
                    case "binary":{
                        try{
                            long DecimalNumber1 = 0, DecimalNumber2;
                            System.out.println(constant.BINARY_NUMBER);
                            long BinaryNumber = NumberType1.nextLong();
                            if(BinaryOperation.checkBinary(BinaryNumber)){
                                DecimalNumber1 = BinaryOperation.BinaryToDecimal(BinaryNumber,1);
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                            System.out.println(constant.OCTAL_NUMBER);
                            long OctalNumber = NumberType1.nextLong();
                            if(OctalOperation.checkOctal(OctalNumber)){
                                DecimalNumber2 = OctalOperation.OctalToDecimal(OctalNumber,1);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    case "octal":{
                        try{
                            long DecimalNumber1 = 0, DecimalNumber2 = 0;
                            System.out.println(constant.OCTAL_NUMBER1);
                            long OctalNumber1 = NumberType1.nextLong();
                            if(OctalOperation.checkOctal(OctalNumber1)){
                                DecimalNumber1 =  OctalOperation.OctalToDecimal(OctalNumber1,1);
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                            System.out.println(constant.OCTAL_NUMBER2);
                            long OctalNumber2 = NumberType1.nextLong();
                            if(OctalOperation.checkOctal(OctalNumber2)){
                                DecimalNumber2 = OctalOperation.OctalToDecimal(OctalNumber2,1);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    case "hexadecimal":{
                        try{
                            long Decimal_Number1 = 0, Decimal_Number2 = 0;
                            System.out.print(constant.OCTAL_NUMBER);
                            long OctalNumber1 = NumberType1.nextLong();
                            if(OctalOperation.checkOctal(OctalNumber1)){
                                Decimal_Number1 =  OctalOperation.OctalToDecimal(OctalNumber1,1);
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                            System.out.print(constant.HEX_NUMBER);
                            String HexNumber = NumberType1.nextLine();
                            String StoreHexNumber = HexNumber.trim();
                            if(HexadecimalOperation.checkHexadecimal(StoreHexNumber)){
                                Decimal_Number2 = HexadecimalOperation.HexadecimalToDecimal(StoreHexNumber);
                                if(Decimal_Number1 > Decimal_Number2){
                                    System.out.println(Decimal_Number1 - Decimal_Number2);
                                }else{
                                    System.out.println(Decimal_Number2 - Decimal_Number1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    default:{
                        System.out.println(InvalidInput.INVALID);
                        break;}
                }
                break;
            }
            case "hexadecimal":{
                switch ( UserString2 ){
                    case "decimal" : {
                        try{
                            System.out.print(constant.DECIMAL_NUMBER);
                            long DecimalNumber2 = NumberType1.nextLong();
                            System.out.print(constant.HEX_NUMBER);
                            String HexNumber1 = NumberType1.nextLine();
                            String StoreHexNumber = HexNumber1.trim();
                            if(HexadecimalOperation.checkHexadecimal(StoreHexNumber)){
                                long DecimalNumber1 = HexadecimalOperation.HexadecimalToDecimal(StoreHexNumber);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        }
                        catch(Exception e){
                            System.out.println(InvalidInput.INVALID);
                        }
                        break;
                    }
                    case "binary":{
                        try{
                            long DecimalNumber1 = 0, DecimalNumber2;
                            System.out.println(constant.BINARY_NUMBER);
                            long BinaryNumber = NumberType1.nextLong();
                            if(BinaryOperation.checkBinary(BinaryNumber)){
                                DecimalNumber1 = BinaryOperation.BinaryToDecimal(BinaryNumber,1);
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                            System.out.println(constant.HEX_NUMBER);
                            String HexadecimalNumber = NumberType1.nextLine();
                            String StoreHexNumber = HexadecimalNumber.trim();
                            if(HexadecimalOperation.checkHexadecimal(StoreHexNumber)){
                                DecimalNumber2 = HexadecimalOperation.HexadecimalToDecimal(StoreHexNumber);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    case "octal":{
                        try{
                            long DecimalNumber1 = 0, DecimalNumber2 = 0;
                            System.out.println(constant.OCTAL_NUMBER);
                            long Octal_Number = NumberType1.nextLong();
                            if(OctalOperation.checkOctal(Octal_Number)){
                                DecimalNumber1 =  OctalOperation.OctalToDecimal(Octal_Number,1);
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                            System.out.print(constant.HEX_NUMBER);
                            String HexNumber = NumberType1.nextLine();
                            String StoreHexNumber = HexNumber.trim();
                            if(HexadecimalOperation.checkHexadecimal(StoreHexNumber)){
                                DecimalNumber2 = HexadecimalOperation.HexadecimalToDecimal(StoreHexNumber);
                                if(DecimalNumber1 > DecimalNumber2){
                                    System.out.println(DecimalNumber1 - DecimalNumber2);
                                }else{
                                    System.out.println(DecimalNumber2 - DecimalNumber1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    case "hexadecimal":{
                        try{
                            long Decimal_Number1 = 0, Decimal_Number2 = 0;
                            System.out.print(constant.HEX_NUMBER1);
                            String  HexNumber1 = NumberType1.nextLine();
                            String StoreHexNumber = HexNumber1.trim();
                            if(HexadecimalOperation.checkHexadecimal(StoreHexNumber)){
                                Decimal_Number1 = HexadecimalOperation.HexadecimalToDecimal(StoreHexNumber);
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                            System.out.print(constant.HEX_NUMBER2);
                            String HexNumber2 = NumberType1.nextLine();
                            String StoreVariable = HexNumber2.trim();
                            boolean isTrue = HexadecimalOperation.checkHexadecimal(StoreVariable);
                            if(isTrue){
                                Decimal_Number2 = HexadecimalOperation.HexadecimalToDecimal(StoreVariable);
                                if(Decimal_Number1 > Decimal_Number2){
                                    System.out.println(Decimal_Number1 - Decimal_Number2);
                                }else{
                                    System.out.println(Decimal_Number2 - Decimal_Number1);}
                            }
                            else{
                                System.out.println(InvalidInput.INVALID);
                            }
                        } catch(InputMismatchException e){
                            System.out.println(InvalidInput.INVALID);}
                        break;}
                    default:{
                        System.out.println(InvalidInput.INVALID);
                        break;}
                }
                break;
            }
            default:{
                System.out.println(InvalidInput.INVALID);
                break;}
        }
    }
}
