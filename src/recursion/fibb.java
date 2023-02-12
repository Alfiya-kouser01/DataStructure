package recursion;

//0 1 1 2 3 5 8 13 21
//0 1 2 3 4 5 6 7 8
public class fibb {
     static int  n1=0,n2=1;

    private static void fibo(int n) {
        int n3=0;
        if(n>=0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            //System.out.print(" "+n3);
            fibo(n-1);
            System.out.print(" "+n3);
        }
    }
    public static void main(String[] args) {
        int n=8;
        fibo(n-2);
        System.out.print(" " + "1"+" "+"0");
    }



}
