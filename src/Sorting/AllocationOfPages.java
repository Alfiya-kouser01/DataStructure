package Sorting;//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
class AllocationOfPages {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of test case");
        int t=sc.nextInt();

        while(t-->0)
        {
            System.out.println("size of array");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("GIVE ARRAY elements");

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int m=sc.nextInt();
            Solutions ob = new Solutions();
            System.out.println(ob.findPages(a,n,m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solutions
{
    //Function to find minimum number of pages.
    public static int findPages(int[]a,int n,int m)
    {
        //Your code here
        if(n<m)
            return -1;
        int max=-1,sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            if(max<a[i])
                max=a[i];
        }
        int start=max;
        int end=sum;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isvalid(a,n,m,mid)==true){
                ans=mid;
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return ans;

    }
    private static boolean isvalid(int a[],int n,int m,int mid){
        int student=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum>mid){
                student++;
                sum=a[i];
            }
            if(m<student)
                return false;
        }
        return true;
    }
};