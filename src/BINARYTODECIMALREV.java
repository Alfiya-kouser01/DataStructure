
import java.io.*;
import java.util.*;
public class BINARYTODECIMALREV {
    //{ Driver Code Starts
//Initial Template for Java




        public static void main(String args[]) throws IOException {
            BufferedReader read =
                    new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                Long X = Long.parseLong(read.readLine());

                REV ob = new REV();
                System.out.println(ob.reversedBits(X));
            }
        }
    }
// } Driver Code Ends


//User function Template for Java


//User function Template for Java

    class REV {
        static Long reversedBits(Long X) {
            // code here


//User function Template for Java


            long res=0;
            for(int i=0;i<32;i++){
                res=res<<1;
                if((X&1)==1){
                    res++;
                }
                X=X>>1;
            }
            return res;

        }
    };

