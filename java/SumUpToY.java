import java.util.*;

/* Given an integer X, find the number of integers less than
or equals to X whose digits adds up to Y
Input:
the first line of the input consists of an integer- numX, representing the input number(X)
The second line consists of an integer-numY, representing the number(Y)
Output:
Print an integer representing the count of numbers whose digits adds up to Y for the given number X
Constraints:
1<=X<= 1000
Example:
Input: 20 5
Output: 2

Pseudocode
while(temp > 0)
temp % 10
 */


public class SumUpToY {
    public static int sumDigits(int numX, int numY){
        //check the constraints of numX
        if(numX < 1 || numX > 1000) return 0;
        int count = 0;
        for(int i = numY; i <= numX; i++){
            int sum= 0;
            int digit = 0;
            int j = i;
            while(j > 0){
                digit = j % 10; 
                sum += digit;
                j = j / 10;
            }
            if (sum == numY){
                count++;
                System.out.println("Digits whose sum is equal to numY is " +i);
            }
    }
    return count;

    }
    public static void main(String[] args) {
        
    
    try (Scanner in = new Scanner(System.in)) {
        int numX = in.nextInt();
        int numY = in.nextInt();
        int result = sumDigits(numX, numY);
        System.out.println(result);
    }
}
}
