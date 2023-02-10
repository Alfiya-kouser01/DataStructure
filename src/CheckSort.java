public class CheckSort {
    public static void main (String []args){
        int arr[]={10,20,35,25,40};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("0");
            }
        }
        System.out.println("1");
    }
}
