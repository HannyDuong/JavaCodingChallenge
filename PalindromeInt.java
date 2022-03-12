public class PalindromeInt {
    public boolean isPadindromeInt(int x){
       if(x < 0 || (x % 10 == 0 && x != 0)){ return false;}
       int revserInt = 0;
       while(x > revserInt){
           revserInt = revserInt * 10 + x % 10;
           x = x / 10;
       }
       return x == revserInt || x == revserInt  / 10;
    }

  

    public static void main(String[] args) {
        PalindromeInt pa = new PalindromeInt();
        int x = 9;
        if(pa.isPadindromeInt(x)){
            System.out.println(x + " is palindrome");
        }
        else
        System.out.println(x + " is not palindrome");

}}
