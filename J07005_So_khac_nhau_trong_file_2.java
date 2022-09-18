import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07005_So_khac_nhau_trong_file_2 {
    public static void main(String[] args) throws FileNotFoundException, NumberFormatException {
        Scanner sc = new Scanner(new File("DATA.IN"));
        int[] map = new int[1005];
        for (int i = 0; i < 100000; i++) {
            int num = Integer.parseInt(sc.next(), 2);
            map[num]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (map[i] > 0) {
                System.out.println(i + " " + map[i]);
            }
        }
        sc.close();
    }
}
// bai nay dang bi IR
