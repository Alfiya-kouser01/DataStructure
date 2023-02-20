package Array;

public class longestSubArray {
    public static void main(String[] args) {
        int []arr={7,1,6,0};
        int n=arr.length;
        int k=7;
        System.out.println("Length of th longest subarray with sum k is: "+ longestarray(arr,n,k));
    }
    public static int longestarray(int []arr,int n,int k){
        int maxLength=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum==k){
                    maxLength=Math.max(maxLength,(j-i+1));
                }
            }
        }
        return maxLength;
    }
}
