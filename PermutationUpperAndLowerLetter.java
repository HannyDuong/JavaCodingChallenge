/* 
Given a string with lower-case and Upper-case mixed, 
print all the permutation of it under the follow condition:
The position of the upper-case letter cannot be changed
Approach:
1. find all permutation
    a. begin a new string with the first character from the given string
    b. starting from the second character.
        for each character in the given string
        insert it to all posible position in the new string 
2. check if the upper case at the same position after permuting


*/


import java.util.ArrayList;

public class PermutationUpperAndLowerLetter {
    public static ArrayList<String> permute(String s){
        char c = s.charAt(0);
        String temp = "" + c;
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add(temp);
        for(int i = 1; i<s.length(); i++){
            char ch = s.charAt(i);
            stringList = insertChar(stringList, ch);
        }
        return stringList;
    }

    public static ArrayList<String> insertChar(ArrayList<String> str, char ch){
        ArrayList<String> permutationList = new ArrayList<>();
        for (String string : str) {
            for(int j = 0 ; j <= string.length(); j++ ){
                StringBuilder temp = new StringBuilder(string);
                temp.insert(j, ch);
                String temp1 = temp.toString();
                permutationList.add(temp1);
            }  
        }
        return permutationList;
    }

    public static ArrayList<String> checkString(ArrayList<String> permutedStr, String s){
        ArrayList<String> str = new ArrayList<>();
        
        for (String string : permutedStr) {
            int flag = 0;
            for(int i = 0; i < string.length(); i++){
                if(Character.isUpperCase(string.charAt(i)) && (string.charAt(i)) != s.charAt(i)){
                    flag = 1;
                    break;

                }
            }
            if(flag == 0){
                str.add(string);
            }
    }
    return str;

    }

    public static void main(String args[]){
        String s = "aBc";
        ArrayList<String> answer = permute(s);
        answer = checkString(answer, s);
        for (String st : answer){
            System.out.print(st + " ");
        }

    }

}

