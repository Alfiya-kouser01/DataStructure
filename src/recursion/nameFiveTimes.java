package recursion;
import java.util.Scanner;

public class nameFiveTimes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //String name = sc.nextLine();
        int n=sc.nextInt();
        int i=1;
        rec(i,n);
    }
    public static void rec(int i,int n){
        //int i=1;
        if(i>n){

            return;
        }
        System.out.println("alfiya");
        //i++;
        rec(i+1,n);
       // i++;

    }
}
