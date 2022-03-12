/* 
Write a program to convert number to chracter
as in old mobile phone
2 entered 1 = A
2 entered 2 = B
2 entered 3 = C
# = space
Example:
22#22 = B B
*/


import java.util.*;
public class NumberToCharacter {
    private static HashMap<Integer, Character>storeIntToChar(){
        HashMap<Integer, Character> store = new HashMap<>();
        store.put(11, 'A');
        store.put(22, 'B');
        store.put(33, 'C');
    return store;    
    }

    public static String convertIntToChar(String str){
        HashMap<Integer, Character> map = storeIntToChar();
        String result = "";       
        String [] temp = str.split("#+");
        for(int i = 0; i < temp.length; i++){
            result = result + map.get(Integer.parseInt(temp[i])) +" ";

        }
        return result;
    }
    public static void main(String args[]){
        System.out.println(convertIntToChar("11#22#33"));
    }

      
    
}
