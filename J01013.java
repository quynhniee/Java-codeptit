import java.util.Scanner;

public class J01013 {
    static Scanner input = new Scanner(System.in);
    static int sum = 0;
    
    static void solution () {
        int n = input.nextInt();
        while (n%2 == 0) {
            sum += 2;
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (i > n)  break;
            while (n%i == 0) {
                sum += i;
                n /= i;
            }
        }
        if (n > 1)  sum += n;
    }
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-- > 0) 
            solution();
        System.out.println(sum);
    }
}
