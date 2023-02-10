public class HashMap {
    public static void main(String[] args) {
        int [] arr={2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        int n=arr.length;
//        HashMap<Integer><Integer> my=new HashMap<Integer><Integer>();
        java.util.HashMap<Integer,Integer> fun = new java.util.HashMap<Integer,Integer>();
//        for(int i=0;i<n;i++){
            for(int i=0;i<n;i++){
                if(fun.containsKey(arr[i])){
                    int k=1;
                    fun.getOrDefault(i,k);
                    k++;
                }
                else{
                    fun.put(arr[i],1);
                }
                fun.getOrDefault(i,1);
                fun.get(i);
            }
        System.out.print(fun);


        }
    }


