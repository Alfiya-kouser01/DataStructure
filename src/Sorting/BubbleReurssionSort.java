package Sorting;

import java.util.Arrays;

public class BubbleReurssionSort {
    static void bubblesort(int arr[],int n){
        if(n==1) {
            return;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                //count=count+1;
            }

            bubblesort(arr,n-1);
        }
    }

    public static void main(String[] args){
     int arr[]={1,5,6,8,9,7,6,4,3,2};
     bubblesort(arr,arr.length);
     System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }

}
