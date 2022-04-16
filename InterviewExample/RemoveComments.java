package InterviewExample;

/* 
Given a C++ program, remove comments from it.
The program source is an array of strings source where source[i]
is the the i^th line of the source code.
This represents the result of splitting the original source code string
 by the newline chracter '\n'

In C++ there are two types of comments: line comments, and block comments
    The string "//" denotes a line comment, which represents that it and 
    the rest of the characters to the right of it in the same line should be ignored.
*/
   // The string "/*" denotes a block comment, which represents that all chracters until the next(non-overlapping) occurrence of  "*/"  should be ignored

  //  The string "/*/    would be overlapping.

// Example:
// Input: source = ["/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"]
// Output: ["int main()","{ ","  ","int a, b, c;","a = b + c;","}"]

/* 
Reference: https://leetcode.com/problems/remove-comments/


Approach:
For each line in the given string
    for each character in the current line
        if it is in a block comment
            if the current character and the next character are the end of block comment
                commented = false
                iterate to the next character
        else(not in block comment)
            if the current chracter and the next character are the beginning of block comment
                commented = true
                iterate to the next character
            else if the current and the next character are line comment,
                break the loop
            else(not begining of block comment and not a line comment)
                 append the current character in a StringBuilder
    if not commented and StringBuilder is not empty
        add the string to a List.
    
return the list
                 

*/
import java.util.*;
public class RemoveComments{
    public  List<String> removeComments(String[] source){
        List<String> list = new ArrayList<>();
        boolean commented= false;
        StringBuilder temp = new StringBuilder();

        for(String line:source){
            for(int i = 0; i < line.length(); i++){
                if(commented){
                    if(line.charAt(i) == '*' && i < line.length() -1 && line.charAt(i + 1) == '/'){
                        commented = false;
                        i++;
                    }
                }
                else{
                    if(line.charAt(i) == '/' && i < line.length() -1 && line.charAt(i + 1) == '*'){
                        commented = true;
                        i++;
                    }
                    else if(line.charAt(i) == '/' && line.charAt(i + 1) == '/'){
                        break;
                    }
                    else{
                        temp.append(line.charAt(i)); 
                    }
                }
            }
            if(!commented && temp.length() != 0){
                list.add(temp.toString());
                temp = new StringBuilder();
            }
        }
        return list;

    }

    public static void main(String[] args) {
        String[] source = {"/*Test program */", "int main()", "{ ", "   // variable declaration ", "int a, b, c;",
                             "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
        //System.out.println(removeComments(source));
        RemoveComments rc = new RemoveComments();
        List<String> results = new ArrayList<>();
        results = rc.removeComments(source);
        for(String line: results){
           if(!line.trim().isEmpty() ){
            System.out.println(line);
            }
        }
    }

}