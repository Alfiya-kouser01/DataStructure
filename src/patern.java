public class patern {
    public static void main(String[] args) {
        int n=5;
       for(int i=1;i<n;i++){
           char val='A';
           for(int j=1;j<=i;j++){
               System.out.print(val);
               val++;

           }
           --val;
           for(int k=1;k<=i;k++){
               System.out.print(val);
               val--;
           }
           System.out.println();
       }
    }
}
