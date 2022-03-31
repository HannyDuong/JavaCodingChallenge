/* 
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
 and you may not use the same element twice.
 Youcan return he answer in any order.
*/

/* 
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution
and you may not use the same element tiwce
You can return the answer in anyorder
*/





import java.util.*;

public class Test{
	public static float[] addTo(float[] nums, float target){
		Map<Float, Integer> map = new HashMap<>();
		float[] results = new float[2];
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(nums[i])){
				results[0] = i;
				results[1] = (int) map.get(nums[i]);
			}
			map.put(target - nums[i], i);
		}
		
		return results;
	}
	  public static void main(String [] args){
		  float [] nums = {5.0f, 2.0f, 7.0f, 3.0f};
		  float target = 9.0f;
		  float[] results = addTo(nums, target);
		  System.out.println(Arrays.toString(results));

  }
}

