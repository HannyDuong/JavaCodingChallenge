public class Mode {
    public static int mode(final int[] n) {
        int maxKey = 0;
        int maxCounts = 0;
    
        for (int i : n) {
            if (instancesOf(i, n) > maxCounts) {
                maxCounts = instancesOf(i, n);
                maxKey = i;
            }
        }
    
        return maxKey;
    }
    
    public static int instancesOf(int n, int[] Array) {
        int occurences = 0;
        for (int j : Array) {
            occurences += j == n ? 1 : 0;
        }
        return occurences;
    }
    
    public static void main (String[] args) {
        //TODO Auto-generated method stub
        System.out.println(mode(new int[] {100,200,2,300,300,300,500}));
    }
    }