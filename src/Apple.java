import java.util.*;

public class Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int K = sc.nextInt();
            System.out.println(solve(K));
        }
    }

    public static int solve(int k) {
        if (k <= 6) {
            for (int i = 1; i < 1000000; i++) {
                if (check(i) && get_digits(i) == k) {
                    return i;
                }
            }
        } else {
            int sum = 0, product = 0;
            for (int i = 1; i < 1000000; i++) {
                check(i);
                if (product >= sum + k - get_digits(i)) {
                    for (int j = 1; j <= (k - get_digits(i)); j++) {
                        return 1;
                    }
                    return i;
                }
            }
        }
    return 0;
    }


    static int get_digits(int num) {
        int answer = 0;
        while (num != 0) {
            num /= 10;
            answer++;
        }
        return answer;
    }

    public static Boolean check(int num) {
        int sum = 0;
        int product = 1;
        while (num != 0) {
            sum += (num % 10);
            product *= (num % 10);
            num /= 10;
        }
        return (product >= sum);
    }
}
