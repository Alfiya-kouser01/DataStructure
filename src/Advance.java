import java.util.HashMap;

public class Advance {
    public static void main(String[]args){
        int count=0;
        HashMap<String,String> fun = new HashMap<String,String>();
        fun.put("Alfiya","Great");
        fun.put("Kouser","allu");
        fun.put("day","plmk");
        fun.put("hello","world");
        fun.remove("Kouser");
        System.out.println(fun);
        if(fun.containsValue("Alfiya")){
            count++;
        }
        System.out.println(count);
        System.out.println(fun.size());
        System.out.println(fun.replace("day","plmk","date"));
        System.out.println(fun);
        System.out.println(fun.values());
        System.out.println(fun.keySet());
    }
}
