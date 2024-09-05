public class Pattern2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            //space
            for(int a=0;a<i;a++){
                System.out.print(" ");
            }
            //star
            for(int b=0;b<(2*n-(2*i+1));b++){
                System.out.print("*");
            }
            //space
            for(int a=0;a<i;a++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
// *********
//  *******
//   *****
//    ***
//     *