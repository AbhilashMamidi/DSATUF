public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;  // Input value
        int spaces = 2 * n - 2;  // Initial number of spaces

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;

            // Adjust the number of stars for the lower part of the pattern
            if (i > n) {
                stars = 2 * n - i;
            }

            // Print stars
            for (int a = 1; a <= stars; a++) {
                System.out.print("*");
            }

            // Print spaces
            for (int b = 1; b <= spaces; b++) {
                System.out.print(" ");
            }

            // Print stars
            for (int a = 1; a <= stars; a++) {
                System.out.print("*");
            }

            System.out.println();  // Move to the next line

            // Adjust the number of spaces after each row
            if (i < n) {
                spaces -= 2;  // Decrease spaces in the upper part
            } else {
                spaces += 2;  // Increase spaces in the lower part
            }
        }
    }
}

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *