public class Pattern6 {
  
    public static void main(String [] args) {
        int n=5;
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            //numbers
            for(int a=1;a<=i;a++){
                System.out.print(a);
            }
            //spaces
            for(int b=1;b<=space;b++){
                System.out.print(" ");
            }
            //numbers
            for(int a=i;a>=1;a--){
                System.out.print(a);
            }
            System.out.println();
            space-=2;
        }
  }   
}
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321