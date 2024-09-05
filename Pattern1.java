public class Pattern1 {
    public static void main(String[] args) {
	    int n=5; 
	    for (int i=1;i<=n;i++) {
	         for (int b=1;b<=n-i;b++){
	          System.out.print("   ");
	        } 
	        for(int a=1;a<=(2*i-1);a++){
	          System.out.print(" * ");
	        }
	        for (int b=1;b<=n-i;b++){
	          System.out.print("   ");
	        } 
	       	System.out.println();
	       
	   }
	}
    }

//              *
//           *  *  *
//        *  *  *  *  *
//     *  *  *  *  *  *  *
//  *  *  *  *  *  *  *  *  *
        