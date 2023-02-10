import java.util.*;

public class SetLearning {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();

        for(int i=10; i>5;i--){
            mySet.add(i);
            mySet.add(100);
            mySet.add(i);
        }

        System.out.println(mySet);
    }
}
