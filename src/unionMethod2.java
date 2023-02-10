import java.util.ArrayList;
import java.util.TreeSet;

public class unionMethod2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 7};
        int[] arr2 = {3, 4, 5, 6};
        int n = arr1.length;
        int m = arr2.length;
        findUnion(arr1, arr2, n, m);
    }

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();


        TreeSet<Integer> treeset = new TreeSet<>();

        for (int i = 0; i < n; i++) {

            treeset.add(arr1[i]);

        }

        for (int i = 0; i < m; i++) {

            treeset.add(arr2[i]);

        }

        // System.out.println(treeset);

        for (Integer elem : treeset)
            list.add(elem);
        System.out.println("The union is : ");

        System.out.println(list);
        return list;
    }
}
