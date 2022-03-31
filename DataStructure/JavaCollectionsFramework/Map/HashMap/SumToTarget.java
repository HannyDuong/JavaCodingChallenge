package DataStructure.JavaCollectionsFramework.Map.HashMap;

import java.util.*;

/* 
The user inputs an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
Youcan return he answer in any order.
 Print the result
*/
public class SumToTarget {
    public static int[] findElementSumToTarget(int[] nums, int target){
        int[] results = new int[2];
        if(nums.length < 2){
            results[0] = -1;
            results[1] = -1;
            return results;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            if(map.containsKey(nums[i])){
                results[0] = i;
                results[1] = map.get(nums[i]);
            }
            map.put( target - nums[i], i);
        }
        return results;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target number");
        int target = s.nextInt();
        System.out.println("Enter total number of elements in the array");
        int totalElements = s.nextInt();
        int[] nums = new int[totalElements];
        System.out.println("Enter elements separated by space");
        for(int i = 0; i< totalElements; i++){
            nums[i] = s.nextInt();
        }
        int[] results = findElementSumToTarget(nums, target);
        System.out.println(Arrays.toString(results));
       
    }
}
