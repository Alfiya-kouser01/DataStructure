package Array;

import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);


        for(Integer myElement:myList) {
            System.out.print(myElement+" ");
        }
        System.out.println();

        System.out.println(myList);
    }
}
