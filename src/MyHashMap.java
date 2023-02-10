import java.util.HashMap;

public class MyHashMap {
    public static void main (String[]args){
        HashMap<String,Integer> happy=new HashMap<String,Integer>();
        happy.put("a",10);
        happy.put("b",13);
        happy.put("c",24);
        System.out.println(happy.get("c"));
    }
}
