package recursion;
import java.util.Scanner;
public class powerOfTwo {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
         boolean result =ans(n);
        System.out.println(result);
    }
    public static boolean ans(int n){
        if(n==1)
            return true;
        if(n==0)
            return false;
        if(n%2!=0)
            return false;
        return ans(n/2);
    }
}

