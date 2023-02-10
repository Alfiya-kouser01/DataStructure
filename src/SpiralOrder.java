import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    int r = 3, c = 4;

    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                };

        printSpiral(arr, 3, 4);
    }

    static void printSpiral(int[][] arr, int r, int c) {
        List<Integer> nums=new ArrayList<>();
        int top = 0, left = 0, bottom = r - 1, rigth = c - 1;
        while (top <= bottom && left <= rigth) {
            for (int i = left; i <= rigth; i++)
                nums.add(arr[top][i]);
                top++;

            for (int i = top; i <= bottom; i++)
                nums.add(arr[i][rigth]);
                rigth--;

            for (int i = rigth; i >= left; i--)
                nums.add(arr[bottom][i]);
                bottom--;

            for(int i=bottom;i>=top;i--)
                nums.add(arr[i][left]);
                left++;
        }
        for(int X: nums){
            System.out.print(X);
        }
    }
}
