package Array;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
        import java.util.*;


    // Driver code
    public class findMissingAndRepeatingTerms {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("testCases");
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println("size of the Array");
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println("give String Value");
            String[] str = br.readLine().split(" ");
            System.out.println("Array elements");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            System.out.println("this is the array");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
            }

            System.out.println("Funtion Call!");
            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] ans = new int[n+1];
//        for(int i=1;i<=n;i++){
//           ans[i]=0;
//        }

        for(int i=0;i<n;i++) {
            int j = arr[i];
            ans[j]++;
        }
        for(int i=1;i<=n;i++)
        System.out.println(ans[i]);
        int[] a = new int[2];
        for(int i=1;i<=n;i++){
            if(ans[i]==0){
                a[1]=i;
            }
            else if(ans[i]>1){
                a[0]=i;
            }
            else{
                a[i]=0;
            }
        }

        return a;
    }
}