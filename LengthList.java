
import java.util.*;

/* Given a list of integers. Find the size of the list
Input:
The first line of the input consists of space-separated integers-inputArr,
representing the elements of the given list.
Output:
Print an integer representing the size of the given list.
Note:
The number of integers is less than or equal to 1000
Example:
Input: 100 100 100
Output: 3

Pseudocode:
1. Read user input until encounter newline character
2. Remove whitespace
3. Store the input in String array
4. Find the length of the array
*/ 

public class LengthList {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        String str = s.nextLine();
        String inputArr[] = str.split("\\s+");
        System.out.println(inputArr.length);
//Sum all the integers
        for(int i = 0; i < inputArr.length; i++){
            sum += Integer.parseInt(inputArr[i]);
        }
        System.out.println("Sum is " +sum);

    }
}