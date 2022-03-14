import java.util.*;
// public class Test {
//     public static void main(String[] args) {
//             System.out.println(calculateString("ABC"));
//             System.out.println(calculateString("CBA"));
//         }
    
//         private static int calculateString(String str) {
//             HashMap<Character, Integer> map = generateHashMap();
//             char[] chars = str.toCharArray();
    
//             int i, sum = 0;
//             for (i = 0; i < chars.length - 1; i++) {
//                 int firstValue = map.get(chars[i]);
//                 System.out.println("first value " +firstValue);
//                 int nextValue = map.get(chars[i + 1]);
    
//                 if (firstValue > nextValue) {
//                     sum += firstValue;
//                 } else {
//                     sum -= firstValue;
//                 }
//             }
    
//             sum += map.get(chars[i]);
    
//             return sum;
//         }
    
//         private static HashMap<Character, Integer> generateHashMap() {
//             HashMap<Character, Integer> characterMap = new HashMap<>();
//             characterMap.put('A', 1);
//             characterMap.put('B', 13);
//             characterMap.put('C', 110);
//             return characterMap;
//         }
    
// }


public class Test{
    public static void main(String[] args) {
        LinkedList<Integer> list = new  LinkedList<Integer>();
        list.push(1);
        System.out.println(list.toString());
       
     
    }
}