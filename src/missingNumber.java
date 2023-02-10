public class missingNumber {
    public static void main(String[] args) {
        int []A={1,2,3,4,5,7};
        int n=A.length;
        int l =A[n-1];
        int add=0;
        int sum=l*(l+1)/2;
        for(int i=0;i<n;i++){
            add=add+A[i];
        }
        int ans=sum-add;
        System.out.println(ans);

    }
}
