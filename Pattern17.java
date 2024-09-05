public class Pattern17 {
    public static void main(String[] args) {
            
                int n = 4;  // Example input
                int size = 2 * n - 1;  // The size of the pattern is 2N-1
        
                // Loop through each row
                for (int i = 0; i < size; i++) {
                    // Loop through each column
                    for (int j = 0; j < size; j++) {
                        // Determine the value to print based on the distance to the nearest edge
                        int minDistance = Math.min(Math.min(i, j), Math.min(size - i - 1, size - j - 1));
                        System.out.print(n - minDistance);
                    }
                    System.out.println();  // Move to the next line after each row
                }
        
    }
}
// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444