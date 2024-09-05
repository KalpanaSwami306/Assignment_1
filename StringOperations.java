/***
When the program is run, the user will first enter a string. After that, the program should
ask the user which operation they want to execute on the string. The available operations are
listed below: Append, CountWords, Replace, isPalindrome, Splice, Split,
MaxRepeatingCharacter, Sort, Shift, and Reverse. Each method should perform its
respective operation based on the user's input.

Created by-Kalpana 
Date:04 September 2024
  **/

package codeup_Assign;

 import java.util.*;

public class StringOperations {

    
        public static void append(StringBuilder curString) {  
      // Description: Appends function append the newString provided by the user to the existing string. 
      //Example:
     // String currentString = "Hello";
     // append(" World"); // Result: "Hello World"
    // curString is a parameter 
    // Return type- void means return NULL value     
        	
        Scanner scanner = new Scanner(System.in);
        Constant statement = new Constant();
        System.out.print(statement.NEWSTRING);
        String newString = scanner.next();
        curString.append(" ").append(newString);
    }

    
    public static int countWords(String curString) {
    	//● Description: Counts the total number of words in the current string.
    	//String text = "Hello World ";
    	// wordCount = countWords(); // Result: 2
    	// Return-Type  is integer 
        // Parameter pass the string value
        String[] words = curString.trim().split("\\s+");
        return words.length;
    }

    
    public static void replace(StringBuilder curString, char oldChar, char newChar) {
//    	● Description: Replaces all occurrences of character a with character b in the current
//    	string.
//    	Example:
//    	String text = "Java Programming";
//    	replace('a', 'o'); // Result: "Jovo Progromming";
//    	Return-type:void
//    	Parameter - curString , oldChar, newChar
        for (int i = 0; i < curString.length(); i++) {
            if (curString.charAt(i) == oldChar) {
                curString.setCharAt(i, newChar);
            }
        }
    }

   
    public static boolean isPalindrome(String curString) {
//    	● Description: Checks if the current string is a palindrome. A palindrome is a word,
//    	phrase, or sequence that reads the same backward as forward.
//    	Example:
//    	String text = "madam";
//    	boolean isPal = isPalindrome(); // Result: true
//    	Return-type:boolean
//    	parameter passing string value
        int length = curString.length();
        for (int i = 0, j = length - 1; j > i; i++, j--) {
            if (curString.charAt(i) != curString.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    
    public static void splice(int start, int end, String curString) {
//    	● Description: Removes a substring from the current string starting at index start and of
//    	length length.
//    	Example:
//    	String text = "Academy";
//    	splice(2, 2); // Result: "Acemy"
//    	Return-Type:void
//    	Parameter:start and end(integer value), curString(string)
    	
        if (start < 0 || end < 0 || start >= curString.length() || end >= curString.length() || start > end) {
            System.out.println("Invalid indices.");
            return;
        }
        String result = curString.substring(0, start) + curString.substring(end + 1);
        System.out.println(result);
    }
 
    public static void maxrepeat(StringBuilder  curstring) {
//    	● Description: Finds and returns the character that appears the most frequently in the
//    	current string.
//    	Example:
//    	String text = "success";
//    	char maxChar = maxRepeat(); // Result:
//    	's' -> 3
//    	Return-type:void
//    	Parameter:string value
    	int  length = curstring.length();
    	int count1 =0;
    	int i=0; char s1=' '; 
    	for(;i<length;i++) {
    		int  count2=0;
    		 s1=curstring.charAt(i);
    		for(int j=i;j<length;j++) {
    			 if(s1==curstring.charAt(j)) {
    				 count2++;
    			 }
    		}
    		if(count2>count1) {
    			count1=count2;
    		}
    	}
    	 System.out.print(s1);
    	 System.out.print("->");
    	 System.out.println(count1);
    }
    

    public static void sort(StringBuilder curstring) {
//    	● Description: Sorts the characters of the current string in alphabetical order.
//    	Example:
//    	String text = "program";
//    	String sortedText = sort(); // Result: "agmnoprr"
//    	Return-type:void
//    	Parameter:string
        char[] charArray = curstring.toString().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        curstring.setLength(0); 
        curstring.append(charArray);
        
    }
    
    public static void shift(StringBuilder curString, int k) {
//    	● Description: Moves the first n characters from the start to the end of the current string.
//    	Example:
//    	String text = "abcdef";
//    	shift(2); // Result: "efabcd"
//    	Return type:void
//    	Parameter:string,integer
        int length = curString.length();
        k = k % length;
        while (k > 0) {
            char lastChar = curString.charAt(length - 1);
            for (int i = length - 1; i > 0; i--) {
                curString.setCharAt(i, curString.charAt(i - 1));
            }
            curString.setCharAt(0, lastChar);
            k--;
        }

        System.out.println(curString.toString());
    }

     public static void split(StringBuilder curstring) {
//    	 ● Description: Splits the current string into an array of words.
//    	 Example:
//    	 String text = "Codeup ACE Academy";
//    	 String[] words = split(“ “); // Result: ["Codeup", "ACE", "Academy"]
//    	 return type:void
//    	 Parameter:string
     	Scanner input = new Scanner(System.in); 
    	Constant constant = new Constant();
     	System.out.println(constant.TEXT);
     	String text = input.nextLine();
    	char[] words = text.toCharArray();
    	int n = words.length;
    	System.out.print("[");
    	for(char word : words) {
    		String str = "";
    		if( word != ' ') {
    			str = str + word;
    		}
    		System.out.print(str);
    		if(word == ' ') {
    			System.out.print(" , ");
    			
    		}
    	}
    	System.out.print("]");
    	System.out.println();
    }
    public static void reverse(StringBuilder curString) {
//    	● Description: Reverses the current string.
//    	Example:
//    	String text = "Java";
//    	● String reversedText = reverse(); // Result: "avaJ"
//    	Return type:void
//    	Parameter : string
        int i = 0;
        int j = curString.length() - 1;
        while (i < j) {
            char temp = curString.charAt(i);
            curString.setCharAt(i, curString.charAt(j));
            curString.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(curString);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Constant string = new Constant();
        System.out.print(string.TEXT1);
        StringBuilder Mainstring = new StringBuilder(scanner.nextLine());

        while (true) {
            System.out.println("Which of the following operations do you want to execute:");
            System.out.println("1. Append");
            System.out.println("2. Count Words");
            System.out.println("3. Replace");
            System.out.println("4. Is Palindrome");
            System.out.println("5. Splice");
            System.out.println("6. Split ");
            System.out.println("7. Max Repeat");
            System.out.println("8. Sort ");
            System.out.println("9. Shift ");
            System.out.println("10. Reverse ");
            System.out.print("Choose one of the above options: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    append( Mainstring);
                    System.out.println(string.INPUT1 +  Mainstring);
                    break;
                case 2:
                    System.out.println(string.WORD + countWords( Mainstring.toString()));
                    break;
                case 3:
                    System.out.print(string.ENTER);
                    char oldChar = scanner.next().charAt(0);
                    System.out.print(string.REPLACE);
                    char newChar = scanner.next().charAt(0);
                    replace( Mainstring, oldChar, newChar);
                    System.out.println(string.INPUT1 +  Mainstring);
                    break;
                case 4:
                    System.out.println(string.CHECK + (isPalindrome( Mainstring.toString()) ? "true" : "false"));
                    break;
                case 5:
                    System.out.println(string.INDEX1);
                    int start = scanner.nextInt();
                    System.out.println(string.INDEX2);
                    int end = scanner.nextInt();
                    splice(start, end,  Mainstring.toString());
                    break;
                case 6:
                	 
                	 Constant constant = new Constant();
                	 System.out.println(constant.TEXT);
                	  split( Mainstring);
                	  break;
                case 8:
                	sort( Mainstring);
                	System.out.println( Mainstring);
                	   break;
                case 10:
                	 reverse( Mainstring);
                	 break;
                case 9: 
                	System.out.println(string.SHIFT);
                	int k = scanner.nextInt(); 
                	shift( Mainstring,k);
                	break;
                	
                case 7:
                	maxrepeat( Mainstring);
                    break;
                default:
                    System.out.println(string.INVALID);
                    break;
            }

            System.out.print(string.AGAIN);
            int runAgain = scanner.nextInt();
            if (runAgain != 1) {
                break;
            }
        }
        scanner.close();
    }
}