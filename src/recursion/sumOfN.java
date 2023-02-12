package recursion;

public class sumOfN {
    static int sum=0;
    public static int addUp(int n){
        sum=sum+n;
        if(n!=0) {

            addUp(n - 1);

        }return sum;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(addUp(n));
    }
}
