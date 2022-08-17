import java.util.Arrays;
import java.util.Scanner;

public class J02005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = input.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        while (i < n && j < m) {
            
        }
    }
}
