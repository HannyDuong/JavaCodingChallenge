/*
Given a list of distinct positive integers named pegs representing the location of each peg
along the support beam, write a function solution(pegs) which, 
if there is a solution, returns a list of two positive integers a and b 
representing the numerator and denominator of the first gear's radius in its simplest form
in order to achieve the goal above, such that radius = a/b. 
The ratio a/b should be greater than or equal to 1. 
Not all support configurations will necessarily be capable of creating the proper rotation ratio, 
so if the task is impossible, the function solution(pegs) should return the list [-1, -1].

For example, if the pegs are placed at [4, 30, 50], then the first gear could have a radius of 12, 
the second gear could have a radius of 14, and the last one a radius of 6. 
Thus, the last gear would rotate twice as fast as the first one. In this case, 
pegs would be [4, 30, 50] and solution(pegs) should return [12, 1].
The list pegs will be given sorted in ascending order 
and will contain at least 2 and no more than 20 distinct positive integers, 
all between 1 and 10000 inclusive.

Test cases
==========
-- Java cases --
Input:
Solution.solution({4, 17, 50})
Output:
    -1,-1

Input:
Solution.solution({4, 30, 50})
Output:
    12,1

*/
public class Solution {
    public static int[] solution(int[] pegs) {
        int pegsLength = pegs.length;
        int [] invalid = new int[]{-1, -1};
        int [] valid = new int[2];
        if(pegsLength < 2){
             return invalid;
        }
        int radi = 0;
        int sign = - 1;
        int numerator = 0;
        int denomerator = 0;
        int min_odd = Integer.MAX_VALUE;
        int max_even = Integer.MIN_VALUE;
        for(int i = 0; i < pegsLength - 1; i++){
            radi -=  (sign * (pegs[i+1] - pegs[i]));
            sign = sign * -1;
            if(i % 2 == 0){
                min_odd = Math.min(min_odd, radi);
            }
            else
                max_even = Math.max(max_even, radi);
        }
        numerator = 2 * radi;
        denomerator = Math.abs(1 + (2*sign));
        if((numerator > denomerator*(min_odd -1)) || (numerator < denomerator * (max_even + 1))){
             return invalid;
        }
        if(sign == 1 && numerator % 3 == 0){
            // while(numerator %3 == 0){
            //     numerator = numerator / 3;
            // } this block of code will cause 1 test case failed
            numerator = Math.floorDiv(numerator, 3);
            denomerator = 1;
        }
        
        valid[0] = numerator;
        valid[1] = denomerator;
        
        return valid;

    }


    public static void main(String[] args) {
        int pegs[] = new int[]{4,30, 50};
        int result[] = solution(pegs);
        for(int i = 0; i < result.length; i++){
             System.out.print(result[i] +" ");
    }
}
}