import java.util.HashMap;
import java.util.Map;

public class binaryfrequeny {
    public static void main(String[] args) {
         int Arr[][] = {{0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}};
            int n=4;
            int m=4;
            int max=0;
        HashMap<Integer,Integer> hmp=new HashMap<>();
            int maxOnes;
            for(int i=0;i<n;i++){
                int count=0;
                for(int j=0;j<m;j++){
                    if(Arr[i][j]==1){
                    count++;
                }
            }

                hmp.put(i,count);
            }
        System.out.println(hmp);
        Map.Entry<Integer, Integer> maxEntry = null;

        for(Map.Entry<Integer, Integer> entry : hmp.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }

        }
        System.out.println(maxEntry.getKey());

    }
}

