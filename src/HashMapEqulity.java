

//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

        import java.util.*;
import java.util.HashMap;

public class HashMapEqulity {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        long t=sc.nextLong();

        while(t-->0)
        {
            int n = sc.nextInt();
            long arr[]=new long[n];
            long brr[]=new long[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
            }

            for(int i=0;i<n;i++)
            {
                brr[i]=sc.nextLong();
            }
            ans ob = new ans();
            System.out.println(ob.check(arr,brr,n)==true?"1":"0");


        }
    }
}
// } Driver Code Ends


//User function Template for Java

class ans{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        if (N != B.length) {
            System.out.println("intial false");
            return false;
        }

        Map<Long, Integer> countMap = new HashMap<>();

        // Count frequencies of elements in array A
        for (long num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check frequencies of elements in array B
        for (long num : B) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num);
                if (count == 1) {
                    countMap.remove(num);
                } else {
                    countMap.put(num, count - 1);
                }
            } else {
                System.out.println("second false");
                return false; // Element in B not present in A
            }
        }
        System.out.println("is true !");
        return true; // If countMap is empty, both arrays are equal
    }



}

