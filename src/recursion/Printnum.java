package recursion;
//0 1 1 2 3 5 8 13
public class Printnum {
    public static void print(int n){
        //System.out.println(n);
        if(n<1){
            return;

        }
        print(n-2);
        System.out.println(n);

    }

    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}