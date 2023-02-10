package recursion;

import java.util.Scanner;

public class backWard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of N");
        int n = sc.nextInt();
        int i = 1;
        rec(i, n);
    }

    public static void rec(int i, int n) {
        //int i=1;
        if (n < i) {

            return;
        }
        System.out.println(n);
        //i++;
        rec(i, n - 1);
        // i++;
        System.out.println("hi");
    }
}
