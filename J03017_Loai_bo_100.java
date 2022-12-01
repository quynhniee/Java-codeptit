import java.util.Scanner;

public class J03017_Loai_bo_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int len = s.length();
            while (s.matches(".*100.*")) {
                s = s.replaceAll("100", "");
            }
            System.out.println(len - s.length());
        }
        sc.close();
    }
}
