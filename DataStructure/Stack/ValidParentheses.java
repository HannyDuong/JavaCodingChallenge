/* 
Reference: https://leetcode.com/problems/valid-parentheses/
Valid Parentheses
Given a string s containing just the characters 
'(', ')', '{', '}', '[', ']'
determine if the input string is valid
An input string is valid if:
* Open brackets must be closed by the same type of brackets.
* Open brackets must be closed in the correct order
Example:
* Input: s = "()"
* Output: true

Constraints:
* 1<= s.length <= 10^4
* s consists of parentheses only '(){}[]'

Approach
* For each character in the string
* If the char is the open bracket,  square bracket, or parenthesis
* push it to the stack
* If the char is the closed bracket,  square bracket, or parenthesis
* peek() the top element in the stack
* If it is matched as a pair of brackets
* then pop the element from the stack
* else return false
* If there is an empty stack at the end , return true
 */

package DataStructure.Stack;
import java.util.*;
public class ValidParentheses {
    public static boolean validateParen(String str){
        Stack<Character> stack = new Stack<>();
        for (Character ch : str.toCharArray()) {
            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            }
            else if(ch == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(ch == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else return false;
        }
        return stack.isEmpty();

    }
    public static void main(String [] args){
        String s = "[)]";
        //validateParen(s);
        System.out.println(validateParen(s));
    }
    
}
