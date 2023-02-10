public class NextPermutation {
    public static void main(String[] args) {
        int [] nums={1,3,2,4,5};
        int N=nums.length;
        pre(nums,N);
    }
    public static void pre(int []A,int N){
        if(A==null || N<=1){
            return;
        }
        int i=N-2;
//        int j=N-1;
        while (i>0 && A[i]>A[i+1])// break point
            i--;
        if(i>=0){
            int j= N-1;
            while(A[j]<=A[i])//finds next larger num
                j--;
            swap(A,i,j);
        }
        reverse(A,i+1,N-1);//arnmgmet in lexiorder
        for(int x : A){
            System.out.print(x);
        }
    }
    public static void swap(int[]A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    public static void reverse(int []A,int i,int j){
        while(i<j)
            swap(A,i++,j--);
    }

    }



