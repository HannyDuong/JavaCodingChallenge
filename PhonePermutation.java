/* 
Print all valid phone numbers of length n subject to following constraints:
1. If a number contains a 4, it should start with 4
2. No two consecutive digits can be same
3. Three digits(eg, 7, 2, 9) will be entirely disallowed take as input.
*/

import java.util.*;
public class PhonePermutation {
private final static char [] DIGITS = "0123456789".toCharArray();

public static void generate(int length, Set<Character> disallowedDigits){
    Set<Character> allowedDigits = new TreeSet<>();
    for (Character character : DIGITS) {
        if(!disallowedDigits.contains(character)){
            allowedDigits.add(character);
        }
    }
    if(allowedDigits.contains('4')){
        printNumbers("4", allowedDigits, length);
        allowedDigits.remove('4');
    }
    for (Character character : allowedDigits) {
        printNumbers(""+ character, allowedDigits, length);
    }
  
}

private static void printNumbers(String soFar, Set<Character>allowedDigits, int length){
    int lengthSoFar = soFar.length();

    if(lengthSoFar < length){
        Character last = soFar.charAt(lengthSoFar -1);
        for (Character character : allowedDigits) {
            if(!character.equals(last)){
                printNumbers( soFar + character, allowedDigits, length);
            }
        }
    } else {
        System.out.print(soFar + " ");
       
    }
   
}
public static void main(String[] args) {
    Set<Character> input = new TreeSet<>();
    input.add('3');
    input.add('1');
    input.add('9');
    generate(4, input);
}

}