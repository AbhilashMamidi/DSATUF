public class Pattern12 {
    public static void main(String[] args) {
        int n=3;
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + n - 1);  // Start with the character corresponding to 'N'
            
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--;  // Decrease the character in each iteration
            }
            
            System.out.println();  // Move to the next line after each row
        }
    }
}
// C 
// C B 
// C B A 