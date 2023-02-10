public class Solution1 {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {1,1,1,2,2,3,4};
        System.out.println(maxFXVI(n,arr));
    }
    static int maxFXVI(int n, int[] arr) {
        // Write your code here.
        int max=0;
        int sum =0;
        int g=0;
        int s=0;
        int count=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                g=n-count;
                sum=s+g;
                s=count;
                count++;
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}
