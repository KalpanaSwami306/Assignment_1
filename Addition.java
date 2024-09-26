/***
 * In this file all operation are related to Addition

 * Program_owner : Kalpana Swami
 * Date : 24 September 2024
 */
package NumberConversion;

import java.util.*;

 class Addition {
     public static void Choose_5() {
         Scanner NumberType = new Scanner(System.in);
         Constant constant = new Constant();
         InvalidString InvalidInput = new InvalidString();
         System.out.println(constant.WARNING);
         System.out.println(constant.NUMBER1);
         String UserString1 =  NumberType.nextLine();
         System.out.println(constant.NUMBER2);
         String UserString2 =  NumberType.nextLine();
         switch (UserString1) {
             case "decimal" :{
                 switch ( UserString2 ){
                     case "decimal" : {
                         try{
                         System.out.println(constant.Decimal_NUMBER1);
                         long DecimalNumber1 = NumberType.nextLong();
                         System.out.println(constant.Decimal_NUMBER2);
                         long DecimalNumber2 = NumberType.nextLong();
                         System.out.println(DecimalNumber1 + DecimalNumber2);}
                         catch(Exception e){
                             System.out.println(InvalidInput.INVALID);
                         }
                         break;
                     }
                     case "binary":{
                         try{
                         System.out.println(constant.DECIMAL_NUMBER);
                         long DecimalNumber1 = NumberType.nextLong();
                         System.out.println(constant.BINARY_NUMBER);
                         long BinaryNumber = NumberType.nextLong();
                             if(BinaryOperation.checkBinary(BinaryNumber)){
                                 long DecimalNumber2 = BinaryOperation.BinaryToDecimal(BinaryNumber,1);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             long DecimalNumber1 = NumberType.nextLong();
                             System.out.println(constant.OCTAL_NUMBER);
                             long OctalNumber = NumberType.nextLong();
                             if(OctalOperation.checkOctal(OctalNumber)){
                                 long DecimalNumber2 = OctalOperation.OctalToDecimal(OctalNumber,1);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             long DecimalNumber1 = NumberType.nextLong();
                             System.out.println(constant.HEX_NUMBER);
                             String HexNumber = NumberType.nextLine();
                             String StoreVariable = HexNumber.trim();
                             if(HexadecimalOperation.checkHexadecimal(StoreVariable)){
                                 long DecimalNumber2 = HexadecimalOperation.HexadecimalToDecimal(StoreVariable);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             long DecimalNumber2 = NumberType.nextLong();
                             System.out.print(constant.BINARY_NUMBER);
                             long BinaryNumber1 = NumberType.nextLong();
                             if(BinaryOperation.checkBinary(BinaryNumber1)){
                                 long DecimalNumber1 = BinaryOperation.BinaryToDecimal(BinaryNumber1,1);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             long BinaryNumber1 = NumberType.nextLong();
                             if(BinaryOperation.checkBinary(BinaryNumber1)){
                                 DecimalNumber1 = BinaryOperation.BinaryToDecimal(BinaryNumber1,1);
                             }
                             else{
                                 System.out.println(InvalidInput.INVALID);
                             }
                             System.out.println(constant.BINARY_NUMBER2);
                             long BinaryNumber2 = NumberType.nextLong();
                             if(BinaryOperation.checkBinary(BinaryNumber2)){
                                 DecimalNumber2 = BinaryOperation.BinaryToDecimal(BinaryNumber2,1);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             long BinaryNumber1 = NumberType.nextLong();
                             if(BinaryOperation.checkBinary(BinaryNumber1)){
                                 DecimalNumber1 = BinaryOperation.BinaryToDecimal(BinaryNumber1,1);
                             }
                             else{
                                 System.out.println(InvalidInput.INVALID);
                             }
                             System.out.print(constant.OCTAL_NUMBER);
                             long OctalNumber = NumberType.nextLong();
                             if(OctalOperation.checkOctal(OctalNumber)){
                                 DecimalNumber2 = OctalOperation.OctalToDecimal(OctalNumber,1);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             long BinaryNumber1 = NumberType.nextLong();
                             if(BinaryOperation.checkBinary(BinaryNumber1)){
                                 Decimal_Number1 = BinaryOperation.BinaryToDecimal(BinaryNumber1,1);
                             }
                             else{
                                 System.out.println(InvalidInput.INVALID);
                             }
                             System.out.println(constant.HEX_NUMBER);
                             String HexNumber = NumberType.nextLine();
                             String StoreVariable = HexNumber.trim();
                             if(HexadecimalOperation.checkHexadecimal(StoreVariable)){
                                 Decimal_Number2 = HexadecimalOperation.HexadecimalToDecimal(StoreVariable);
                                 System.out.println(Decimal_Number1 + Decimal_Number2);
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
                             long DecimalNumber2 = NumberType.nextLong();
                             System.out.print(constant.BINARY_NUMBER);
                             long OctalNumber1 = NumberType.nextLong();
                             if(OctalOperation.checkOctal(OctalNumber1)){
                                 long DecimalNumber1 = OctalOperation.OctalToDecimal(OctalNumber1,1);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             long BinaryNumber = NumberType.nextLong();
                             if(BinaryOperation.checkBinary(BinaryNumber)){
                                 DecimalNumber1 = BinaryOperation.BinaryToDecimal(BinaryNumber,1);
                             }
                             else{
                                 System.out.println(InvalidInput.INVALID);
                             }
                             System.out.println(constant.OCTAL_NUMBER);
                             long OctalNumber = NumberType.nextLong();
                             if(OctalOperation.checkOctal(OctalNumber)){
                                 DecimalNumber2 = OctalOperation.OctalToDecimal(OctalNumber,1);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             long OctalNumber1 = NumberType.nextLong();
                             if(OctalOperation.checkOctal(OctalNumber1)){
                                 DecimalNumber1 =  OctalOperation.OctalToDecimal(OctalNumber1,1);
                             }
                             else{
                                 System.out.println(InvalidInput.INVALID);
                             }
                             System.out.println(constant.OCTAL_NUMBER2);
                             long OctalNumber2 = NumberType.nextLong();
                             if(OctalOperation.checkOctal(OctalNumber2)){
                                 DecimalNumber2 = OctalOperation.OctalToDecimal(OctalNumber2,1);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             long OctalNumber1 = NumberType.nextLong();
                             if(OctalOperation.checkOctal(OctalNumber1)){
                                 Decimal_Number1 =  OctalOperation.OctalToDecimal(OctalNumber1,1);
                             }
                             else{
                                 System.out.println(InvalidInput.INVALID);
                             }
                             System.out.print(constant.HEX_NUMBER);
                             String HexNumber = NumberType.nextLine();
                             String StoreVariable = HexNumber.trim();
                             if(HexadecimalOperation.checkHexadecimal(StoreVariable)){
                                 Decimal_Number2 = HexadecimalOperation.HexadecimalToDecimal(StoreVariable);
                                 System.out.println(Decimal_Number1 + Decimal_Number2);
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
                             long DecimalNumber2 = NumberType.nextLong();
                             System.out.print(constant.HEX_NUMBER);
                             String HexNumber1 = NumberType.nextLine();
                             String StoreVariable = HexNumber1.trim();
                             if(HexadecimalOperation.checkHexadecimal(StoreVariable)){
                                 long DecimalNumber1 = HexadecimalOperation.HexadecimalToDecimal(StoreVariable);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             long BinaryNumber = NumberType.nextLong();
                             if(BinaryOperation.checkBinary(BinaryNumber)){
                                 DecimalNumber1 = BinaryOperation.BinaryToDecimal(BinaryNumber,1);
                             }
                             else{
                                 System.out.println(InvalidInput.INVALID);
                             }
                             System.out.println(constant.HEX_NUMBER);
                             String HexadecimalNumber = NumberType.nextLine();
                             String StoreVariable = HexadecimalNumber.trim();
                             if(HexadecimalOperation.checkHexadecimal(StoreVariable)){
                                 DecimalNumber2 = HexadecimalOperation.HexadecimalToDecimal(StoreVariable);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             long Octal_Number = NumberType.nextLong();
                             if(OctalOperation.checkOctal(Octal_Number)){
                                 DecimalNumber1 =  OctalOperation.OctalToDecimal(Octal_Number,1);
                             }
                             else{
                                 System.out.println(InvalidInput.INVALID);
                             }
                             System.out.print(constant.HEX_NUMBER);
                             String HexNumber = NumberType.nextLine();
                             String StoreVariable = HexNumber.trim();
                             if(HexadecimalOperation.checkHexadecimal(StoreVariable)){
                                 DecimalNumber2 = HexadecimalOperation.HexadecimalToDecimal(StoreVariable);
                                 System.out.println(DecimalNumber1 + DecimalNumber2);
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
                             String  HexNumber1 = NumberType.nextLine();
                             String StoreVariable = HexNumber1.trim();
                             if(HexadecimalOperation.checkHexadecimal(StoreVariable)){
                                 Decimal_Number1 = HexadecimalOperation.HexadecimalToDecimal(StoreVariable);
                             }
                             else{
                                 System.out.println(InvalidInput.INVALID);
                             }
                             System.out.print(constant.HEX_NUMBER2);
                             String HexNumber2 = NumberType.nextLine();
                             String StoreVariable1 = HexNumber2.trim();
                             if(HexadecimalOperation.checkHexadecimal(StoreVariable1)){
                                 Decimal_Number2 = HexadecimalOperation.HexadecimalToDecimal(StoreVariable1);
                                 System.out.println(Decimal_Number1 + Decimal_Number2);
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