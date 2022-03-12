import java.util.*;
/* 
The arithmetic mean of N numbers is the sum of the numbers, divided by N. 
The mode of N numbers is the most frequently occuring number.
Your program must outputs the mean and the mode of a set of numbers.

Input:
THe first line of the input consists of an integer-inputArr_size,
 an integer representing the count of numbers in the given list.
 The second line of the input consists of N space-separated real number-
 inputArr representing the numbers of the given list.

 Output:
 Print two space-separated real numbers up-to-two digits
  representing the mean and the mode of a set of numbers.

Note:
0 and negative numbers are valid inputs
If more than one number has the same frequency, then choose the smallest 
number as a mode.

Example:
Input: 5
        1 2 7 3 2
Output: 3.00 2.00
Pseudocode
1. Take user input
2. Sort the array
3. Store first element in the array in a variable
4. Sum all elements using for loop
5. Count the occurenece of each elements 
6. Store the highest frequency
7. tie will be break by the smaller element since array already sorted
*/

public class MeanModeMedian {
    public static float[] meanAndMode(float [] inputArr){
        float [] answer = new float[3];
        float count = inputArr.length;
        float sum = 0f;
        float mean = 0f;
        float maxfreq = 0f;
        float mode = 0f;
        float median = 0f;
        Arrays.sort(inputArr);
        float firstEle = inputArr[0];
        int tempcount = 0;
        for(int i = 0; i < count; i++){
            sum += inputArr[(int)i];
           
            if(inputArr[(int)i] == firstEle){
                tempcount++;
                if(tempcount > maxfreq){
                    maxfreq = tempcount;
                    mode = inputArr[i];
                }
            }
            tempcount = 1;
            firstEle = inputArr[i];
        }

        mean = sum / count;
        answer[0] = mean;
        answer[1] = mode;
        if(count % 2 !=0){ median = inputArr[(int)count/2];}
        median = (inputArr[(int)(count -1)/ 2] + inputArr[(int) count /2]) / 2;
        answer[2] = median;
        return answer;
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int inputSize = in.nextInt();
            float inputArr[] = new float[inputSize];
            for(int i = 0; i < inputSize; i++){
                inputArr[i] = in.nextFloat();
            }

            float result [] = meanAndMode(inputArr);
            for(int i = 0; i< result.length ; i++){
                System.out.print(result[i] + " ");
            }
        }
   

    }
}
