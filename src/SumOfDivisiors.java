import java.util.Scanner;

public class SumOfDivisiors {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int N=sc.nextInt();
             find ob =new find();
             long ans=ob.sumof(N);
            System.out.println(ans);

        }
    }
}
class find{
    public static long sumof(int N){
        long sum=0;
        for(int i=1;i<=N;i++){
            sum+=((N/i)*i);
            //4, 8, 11, 15
        }
        return sum;
    }
}
