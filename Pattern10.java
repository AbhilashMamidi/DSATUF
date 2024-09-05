public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int a = 1; a <= n - i; a++) {
                System.out.print(" ");
            }

            // characters
            char ch = 'A';
            int breakPoint = i;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch+" ");
                if (j < breakPoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
             // spaces
            for (int a = 1; a <= n - i; a++) {
                System.out.print(" ");
            }
            
            // move to the next line
            System.out.println();
        }
    }
}
