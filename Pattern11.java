public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
           for(char ch=(char)('E'-i+1);ch<='E';ch++){
            System.out.print(ch+" ");
           }
           System.out.println();
        }
    }
}
// E
// DE
// CDE
// BCDE
// ABCDE