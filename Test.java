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
	public  List<String> removeComments(String[] source) {
        List res = new ArrayList<>();
boolean commented = false;
 StringBuilder sb = new StringBuilder();
       // String temp = "";
for (String line : source) {
    for (int i = 0; i < line.length(); i++) {
        if (commented) {
            if (line.charAt(i) == '*' && i < line.length()-1 && line.charAt(i+1) == '/') {
                commented = false;
                i++;
            }
        }
        else {
            if (line.charAt(i) == '/' && i < line.length()-1 && line.charAt(i+1) == '*') {
                commented = true;
                i++;
            }
            else if (line.charAt(i) == '/' && i < line.length()-1 && line.charAt(i+1) == '/') {
                break;
            }
            else {
                 sb.append(line.charAt(i));
               // temp = temp + line.charAt(i);
            }
        }
    }
     if (!commented && sb.length() != 0) {
    //if(!commented && temp.length() !=0){
    res.add(sb.toString());
      //  res.add(temp);
     //  temp = "";
     sb = new StringBuilder();
}
    
    
    
}
return res;
	}
	public static void main(String[] args){
        String[] source = { "/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c, d, h, h, v, t,l, m,n, , f, r, o, p;", "/* This is a test", "   multiline  ", " comment for ", "   testing */", "a = b + c;", "}"};
       Test test= new Test();
		
		//test.removeComments(source);
		System.out.println(test.removeComments(source));

  }
}

