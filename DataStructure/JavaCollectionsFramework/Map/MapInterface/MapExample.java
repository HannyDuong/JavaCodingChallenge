package DataStructure.JavaCollectionsFramework.Map.MapInterface;
import java.util.*;
/* 
Adding some entries to a map.
Each entry is a key and value pair as integer and String
* Traversing Map to get key and value separately
* Print a specific key and value pair in a map

*/
public class MapExample {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Helen");
        map.put(2, "John");
        map.put(5,"Kim");

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map.get(2));
    }
}
