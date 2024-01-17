
import java.io.*;
import java.util.*;


public class count {
    //{ Driver Code Starts
//Initial Template for Java


    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            count2 ob = new count2();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class count2 {
    static int evenlyDivides(int N) {
        // code here
        int k = N;
        int count = 0;
        while (k != 0) {
            int rem = k % 10;
            //System.out.println(rem);
            if ( rem != 0 && N % rem == 0) {
                count++;
            }
            k = k / 10;
        }

        return count;
    }
}

