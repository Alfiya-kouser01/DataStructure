public class Mergesort {
    public static void main(String []args){
        int [] arr={2,5,1,6,9};
        int n=arr.length;
        sort(arr,0,n-1);
    }
    public static void sort(int []arr,int s,int e){
        if(s>e){
            return;
        }
        int mid = (s+e)/2;
        //left part sort
        sort(arr,s,mid);
        //right part sort
        sort(arr,mid+1,e);
            merge(arr,s,e);
    }
    public static void merge(int arr[],int s,int e){
        int mid = (s+e)/2;


    }

}
