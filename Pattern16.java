public class Pattern16 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            // Inner loop for each column
            for (int j = 0; j < n; j++) {
                // Print '*' if we are on the boundary of the square
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    // Print space for the inside of the square
                    System.out.print(" ");
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
// *****
// *   *
// *   *
// *   *
// *****