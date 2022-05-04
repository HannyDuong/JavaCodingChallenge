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
    public void printAlSubstrings(String s){
        int size = s.length();
       // System.err.println(size);
        for(int i = 0; i< size ; i ++){
            for(int j = i+1; j <= size ; j++){
            System.out.println(s.substring(i, j));
           
        }
         
    }
    
    }


    class box{
        int width;
        int he;
        int le;

    }
    public static void main(String[] args) {
        String str = "abc";
        Test test = new Test();
        test.printAlSubstrings(str);
    //    box ob1 = new box();
    //    box ob2 = new box();
    //    ob1.he = 1;
    //    ob1.le = 2;
    //    ob1.width = 1;
    //    ob2 = ob1;
    //    System.out.println(ob2.he);

    }
}
