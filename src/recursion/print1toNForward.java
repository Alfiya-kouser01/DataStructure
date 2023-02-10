package recursion;

import java.util.Scanner;

public class print1toNForward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of N");
        int n=sc.nextInt();
        int i=1;
        rec(i,n);
    }
    public static void rec(int i,int n){
        //int i=1;
        if(i>n){

            return;
        }
        System.out.println(i);
        //i++;
        rec(i+1,n);
        // i++;

    }
}
