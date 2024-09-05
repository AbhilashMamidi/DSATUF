public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        int iniS = 0;
        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            // Stars
            for (int a = 1; a <= n - i + 1; a++) {
                System.out.print("* ");
            }
            // Spaces
            for (int b = 1; b <= iniS; b++) {
                System.out.print("  ");
            }
            // Stars
            for (int a = 1; a <= n - i + 1; a++) {
                System.out.print("* ");
            }
            System.out.println();
            iniS += 2;
        }

        iniS=8;  // Adjust iniS to correctly start for the lower part

        // Lower part of the pattern
        for (int i = 1; i <= n; i++) {
            // Stars
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            // Spaces
            for (int b = 1; b <= iniS; b++) {
                System.out.print("  ");
            }
            // Stars
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
            iniS -= 2;
        }
    }
}
// * * * * * * * * * * 
// * * * *     * * * * 
// * * *         * * * 
// * *             * * 
// *                 * 
// *                 * 
// * *             * * 
// * * *         * * * 
// * * * *     * * * * 
// * * * * * * * * * * 