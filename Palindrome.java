public class Palindrome {
    public boolean isPadindrome(String s){
        int i = 0, j =s.length() - 1;
        if(s.length() <= 1) return false;

        while (i < j) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        
        }
        return true;

    }
    public static void main(String[] args) {
        Palindrome pa = new Palindrome();
        String s = "r";
        if(pa.isPadindrome(s)){
            System.out.println(s + " is palindrome");
        }
        else
        System.out.println(s + " is not palindrome");

        
   
        
    }
}