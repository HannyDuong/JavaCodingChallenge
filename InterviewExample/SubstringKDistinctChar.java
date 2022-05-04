package InterviewExample;
import java.util.*;

/* 
Given a string S, find the length of the longest substring T
     that contains at most k distinct characters.

Example:
    Input: str = "eceba" and k = 3
    Output: 4

Approach:
    Using hashmap to store each character as a key and its occurence as a value.

    For each character in the string
        if it is in the hashmap already,
            put it in the hashmap with its old value + 1
        else
            put it in the hashmap with the value as 1
        
        if hashmap's size <= k,
            longestlength = max of longestlength and (the number of iteration minus the nummber of remove plus 1)
        else
            while hashmap's size > k
                start from the begining of string
                if the occurence of the current character = 1
                    remove that character
                else
                    put that character in the hashmap with the old value - 1
                increment the string
    return the longestlength


*/
 public class SubstringKDistinctChar {
     public int findLongestLengthSubstring(String s, int k){
         Map<Character, Integer> map = new HashMap<>();
         int longest = 0;
         int j = 0;
         for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                 map.put(c, map.get(c) + 1);
            }
            else{
                 map.put(c, 1);
            }

            if(map.size() <= k){
                longest = Math.max(longest, i - j + 1);
            }
            else{
                while(map.size() > k){
                    char ch = s.charAt(j);
                    int count = map.get(ch);
                    if(count == 1){
                        map.remove(ch);
                    }
                    else{
                        map.put(ch, count - 1);
                    }
                    j++;

                }
            }

         }
         System.out.println(map.keySet());
         System.out.println(map.values());
         return longest;
     }

     public static void main(String[] args){
          String s = "abcadcacacaca";
       // String s ="eaeaeb";
       // String s ="ebeaea";
        // String s = "WORLD";
         int k = 2;
         SubstringKDistinctChar sub = new SubstringKDistinctChar();
         System.out.println(sub.findLongestLengthSubstring(s, k));

     }

}








