public class PermutationString {
    public static void printPermutation(String str, String ans){
        if (str.length() == 0)
        {
            System.out.print(ans + "  ");
             return;
        }
        
        for(int i = 0 ;i < str.length(); i++)
        {
            char ch = str.charAt(i);
            String left_substr = str.substring(0, i);   
            String right_substr = str.substring(i + 1);        
            String rest = left_substr + right_substr; 
            printPermutation(rest, ans + ch);

    }
}
    public static void main(String[] args) {
        String ans =" ";
        printPermutation("Abc", ans);
    
    }
}
