public class subArray {
    public static void main(String[] args) {
        int arr[]={4,1,1,1,2,3,5};
        int n=arr.length;
        int k=5;
        int j=0;
        int i=0;
        int max=0;
        long sum=0;
        while(j<n){
            sum=sum +arr[j];
            if (sum < k) {
                j++;
            }
            if (sum==k) {
                max=Math.max(max,(j-i+1));
                j++;
            }
            if(sum>k){
                while(sum>k){
                    sum=sum-arr[i];
                    i++;
                }
                j++;
            }

        }
        System.out.println(max);

    }
}
