public class Pattern13 {
    public static void main(String[] args) {
        int n=5;
        int iniS=0;
        for(int i=0;i<n;i++){
            //stars
            for(int a=1;a<=n-i;a++){
                 System.out.print("*");
            }
            //spaces
            for(int b=0;b<iniS;b++){
               System.out.print(" ");
            }
            //stars
            for(int a=1;a<=n-i;a++){
                System.out.print("*");
           }
           System.out.println();
           iniS=iniS+2;
        }
        iniS=8;
        for(int i=1;i<=n;i++){
            //stars
            for(int a=1;a<=i;a++){
                System.out.print("*");
           }
           //spaces
           for(int b=1;b<=iniS;b++){
              System.out.print(" ");
           }
           //stars
           for(int a=1;a<=i;a++){
               System.out.print("*");
          }
          System.out.println();
          iniS=iniS-2;
        }
    }
}
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********