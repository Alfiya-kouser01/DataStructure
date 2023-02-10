import java.util.HashMap;

public class Question1 {
    public static void main(String[]args){
        int [] arr ={2, 3, 2, 3, 5};
        int n= arr.length;
        int value;
        HashMap<Integer,Integer> myMap =new HashMap<>();
        for(int i=0;i<n;i++){
            value= myMap.getOrDefault(arr[i],0)+1;
            myMap.put(arr[i],value);
        }
        System.out.println(myMap);
        for(int i=0;i<n;i++){
            int count = myMap.getOrDefault(i+1,0);
            myMap.put(i,count);
            arr[i]=count;
        }
        System.out.println(myMap);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
