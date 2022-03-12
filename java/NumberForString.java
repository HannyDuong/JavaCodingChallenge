import java.util.HashMap;

/* 
Given a set of character such as 'A', 'B', 'C'
Each char have its representative number.
A = 1, B = 13, C = 110
When the char next to current index is smaller than current we add them together
Example: CBA = 110 + 13 +1 = 124 ; since B < C
When the char next to the current index is bigger than the current, all the answer
in previous will become minus sign but not the last one.
Example: ABC = -1 -13 + 110 = 96; since B > A
Calculate the number for each string input

Pseudocode:
private static HashMap<Character, Integer> storeValue(){
    put('A', 1);
    put('B',13);
    put('C', 110);
    return characteValue;
}
public static int calculateStringValue(String str){
    get the value of the current char
    get the value of the next char

    for each char in char array
        if the next char < current char
            sum = sum + the value of the chars
        else
            sum = sum - the value of the chars
    
    sum = sum + the value of the last char
    return sum

}
*/

public class NumberForString {
    public static int calculateStringValue(String str){
        HashMap<Character, Integer> map = storeValue();
        int i, sum = 0;
        char [] chars = str.toCharArray();
        int firstChar = map.get(chars[0]);
        int secondChar = map.get(chars[1]);
        
        for(i = 0; i < chars.length - 1; i++){            
            if(secondChar < firstChar){
                sum += map.get(chars[i]);
            }
            else {
                sum -= map.get(chars[i]);
            }           
        }
        sum += map.get(chars[i]);
        return sum;
    }
    private static HashMap<Character, Integer> storeValue(){
        HashMap<Character, Integer> characterValue = new HashMap<>();
        characterValue.put('A', 1);
        characterValue.put('B', 13);
        characterValue.put('C', 110);
        return characterValue;
    }

    
    public static void main(String[] args){
        System.out.println(calculateStringValue("ABC"));
        System.out.println(calculateStringValue("CAB"));
    }
    
}
