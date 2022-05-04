/* 
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters.
The words in s will be separated by at least one space
Return a string of the words in reverse order concatenated by a single space
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a sinlge space separating the words.
Do not include any extra spaces.

Example:
Input: s = " the sky is blue "
Output: "blue is the sky"

Approach:
1. remove white space and put the string into a string array
2. for each element in the array , start from the right most (in reverse ordered),
    put it in a string with a space
3. trim the white space at then end of the string
4. return the string


*/


package InterviewExample;

public class ReverseWords {
    public String reverseWords(String s){
        if(s == null) return null;
        String revString = " ";
        String [] array = s.split(" +");
        for(int i = array.length -1 ; i >= 0 ; i--){
            revString = revString + array[i] + " ";
        }
        revString = revString.trim();
        return revString;
    }

    public static void main(String [] args){
        String s = " the sky is blue";
        ReverseWords obj = new ReverseWords();
        System.out.println(obj.reverseWords(s));
        
    }
}
