package WeeK2_Assignment;
import java.util.*;
public class StringFunction {
        public static void validParentheses(String input, String output, int index) {
            if (index >= input.length()) {
                System.out.print(" ' " + output + " ' ");
                return;
            }
            char ch = input.charAt(index);
            validParentheses(input, output, index + 1);
            validParentheses(input, output + ch, index + 1);
        }

        public static int digitSum(int num, int sum) {
            if (num == 0) {
                return sum;
            }
            int digit = num % 10;
            sum += digit;
            return digitSum(num / 10, sum);
        }

        public static void consecutiveSum(int num) {
            Constant constant2 = new Constant();
            int count = 0;
            for (int i = 1; i < num; i++) {
                int sum = 0;
                for (int j = i; j < num; j++) {
                    sum += j;
                    if (sum == num) {
                        count++;
                        for (int k = i; k < j; k++) {
                            System.out.print(k + "+");
                        }
                        System.out.println(j);
                    }
                }
            }
            if (count == 0) {
                System.out.println(constant2.NO_SUM);
            }
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
                        System.out.println(constant.INPUT_NUMBER);
                        int num = scanner.nextInt();
                        if (num < 0) {
                            System.out.println(constant.INVALID);
                        } else {
                            int outputNum = digitSum(num, 0);
                            while (outputNum > 10) {
                                outputNum = digitSum(outputNum, 0);
                            }
                            System.out.println(constant.SUM + num + constant.IS + outputNum);
                        }
                        break;
                    }
                    case '3': {
                        System.out.println(constant.INPUT_NUMBER);
                        int num = scanner.nextInt();
                        if (num < 0) {
                            System.out.println(constant.INVALID);
                        } else {
                            consecutiveSum(num);
                        }
                        break;
                    }
                    case '4': {
                        // Caesar Cipher with Shift Variability - not implemented
                        break;
                    }
                    case '5': {
                        // Encoding challenge with ASCII Conversion - not implemented
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

