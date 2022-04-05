package BasicofJava.Array.MutidimensionalArrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] twodarray = {{1,3,5},{3, 5,6}};
        System.out.println(twodarray.length);
        System.out.println(twodarray[0].length);
        for(int i = 0; i<twodarray.length; i++){
            for(int j = 0; j< twodarray[0].length; j++){
                System.out.print(twodarray[i][j] + " ");
            }
        }
    }
}
