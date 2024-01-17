package Leetcode;

import com.sun.imageio.plugins.common.I18NImpl;

import java.util.*;

public class LC540 {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        //    Write your code here.
        // {1:2, 2:2, 4:1, 5:2}

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (map.containsKey(arr.get(i))) {
                map.put(arr.get(i), map.get(arr.get(i)) + 1);
            } else {
                map.put(arr.get(i), 1);
            }
        }
        System.out.println(map);


/*        // keySet()
        for(Integer i : map.keySet()){
            if(map.get(i) == 1) return i;
        }*/
        int minValue=Integer.MAX_VALUE;
        int minKey = -1;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            //System.out.println("key"+entry.getKey()+"value"+entry.getValue());
            int key=entry.getKey();

            int value = entry.getValue();

            if(value < minValue){

                minKey=key;

                minValue=value;
            }
        }
        System.out.println(minKey);
        
        return minKey;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 4, 5, 5));
        System.out.println(singleNonDuplicate(arr));
    }
}
