public class Pattern3 {
  public static void main(String[] args) {
    int n=5; 
    for (int i=1;i<=n;i++) {
         for (int b=1;b<=n-i;b++){
          System.out.print(" ");
        } 
        for(int a=1;a<=(2*i-1);a++){
          System.out.print("*");
        }
        for (int b=1;b<=n-i;b++){
          System.out.print(" ");
        } 
           System.out.println();
       
   }
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
//     *    
//    ***   
//   *****  
//  ******* 
// *********
// *********
//  ******* 
//   *****  
//    ***   
//     *    