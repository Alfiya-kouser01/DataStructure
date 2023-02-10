//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG{
    public static void main(String args[]) throws IOException {
        long array[] = {1,2,3,4,5};
        int n= array.length;
        int total=1;
        for(int i=0;i<n;i++) {
            if (array[i] > total) {
                System.out.println(total);
                break;
            }
            else {
                total += array[i];
            }
        }
        System.out.println(total);
    }

    }


