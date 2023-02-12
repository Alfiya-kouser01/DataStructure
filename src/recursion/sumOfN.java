package recursion;

public class sumOfN {
    static int sum=0;
    public static int addUp(int n){
       // sum=sum+n;
        if(n==0)
            return 0;
        return n+addUp(n-1);

    }
    public static void main(String[] args) {
        int n=50;
        System.out.println(addUp(n));
        int sum2 =(n*(n+1))/2;
        System.out.println(sum2);
    }
}
