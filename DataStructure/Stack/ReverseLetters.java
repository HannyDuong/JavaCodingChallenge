package DataStructure.Stack;
import java.util.*;
public class ReverseLetters {
    public static void reverseLetters(String str){
        if(str.length() == 0) System.out.println("String is empty");
        else if(str.length() == 1) System.out.println(str);
        else{
            Stack<Character> stack = new Stack<>();
            String reverse ="";
            for(Character ch : str.toCharArray()){
                stack.push(ch);

            }
            while(!stack.isEmpty()){
                Character c = stack.pop();
                reverse = reverse + c;

            }
            System.out.println(reverse);

        }
    }
    public static void main(String [] args){
        String s = "String hello";
        reverseLetters(s);
        

    }
}
