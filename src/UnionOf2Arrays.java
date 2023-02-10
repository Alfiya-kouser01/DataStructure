import java.util.HashMap;
import java.util.Set;

public class UnionOf2Arrays {
    public static void main(String []args){
        int [] arr1={1,2,3,4,5,6} ;
        int [] arr2={1,3,5};
        int n= arr1.length;
        int m= arr2.length;
        HashMap<Integer,Integer> unionMap =new HashMap<>();
        for(int i=0;i<n;i++) {
            int value = unionMap.getOrDefault(arr1[i], 0) + 1;
            unionMap.put(arr1[i], value);
        }
        for(int i=0;i<m;i++) {
            int value = unionMap.getOrDefault(arr2[i], 0) + 1;
            unionMap.put(arr2[i], value);
        }
        System.out.println(unionMap);
        int s=unionMap.size();

       Set keys=  unionMap.keySet();

        System.out.println(keys);


    }

}
