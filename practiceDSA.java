public class practiceDSA {
    public static void main(String[] args) {
        int arr[]={1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int num=4;
       for (int i = 0; i < arr.length; i++) {
          if (arr[i]==num) {
            return i;
          }
       }
       return -1;
       
    }
}
