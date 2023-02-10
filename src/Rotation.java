public class Rotation
{
    public static void main(String [] args){
        int []arr={11,12,13,14};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int [] temp;
        temp = new int[n];
        int k=2;
        for(int i=0;i<n;i++){
            temp[(i+k)%n]=arr[i];
        }
        for(int i=0;i<n;i++) {
            System.out.print(temp[i]+" ");
        }
    }
}
