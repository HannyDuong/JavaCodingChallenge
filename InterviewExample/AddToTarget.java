
/* 
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
 and you may not use the same element twice.
 Youcan return he answer in any order.
*/



package InterviewExample;
import java.util.*;


public class AddToTarget {
    public static int[] addUpToTarget(int[] nums, int target){
        int [] results = new int[6];
        if(nums.length < 2){
            results[0] = -1;
            results[1] = -1;
            return results;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsValue(nums[i])){
                results[j++] = i;
                results[j++] = map.get(nums[i]);
                results[j++] = 0;
                
            }
            map.put(i, target - nums[i]);

        }
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        return results;

    }
    public static void main (String[]args){
        int [] nums = {4, 1, 6, 7, 3};
        int target = 9;
        int [] result = addUpToTarget(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
