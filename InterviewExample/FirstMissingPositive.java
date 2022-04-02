package InterviewExample;
import java.util.*;
/* 
Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.
Example:
Input: nums =[7,8,-1, 12] 
Output = 1

*/


public class FirstMissingPositive {
    public static int findFirstMissingpositive(int[] nums){
        Arrays.sort(nums);
        int count = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < count) continue;
            else if(count != nums[i]){
                return count;
            }
            else count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(findFirstMissingpositive(nums));

    }
}
