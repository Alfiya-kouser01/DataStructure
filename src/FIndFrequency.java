import java.util.HashMap;
import java.util.Map;

public class FIndFrequency {
    public static void main(String[]args){
        int []arr={10,2,3,1,5,18,1,5,3,4};
        int n = arr.length;
        System.out.println(n);
        frequency(arr,n);
    }
    static void frequency(int arr[],int n){
            HashMap<Integer,Integer> fun = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(fun.containsKey(arr[i])){
                fun.put(arr[i],fun.get(arr[i]+1));
            }
            else{
                fun.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:fun.entrySet()){
            System.out.print(entry.getKey()+" "+ entry.getKey());
        }

    }
}
