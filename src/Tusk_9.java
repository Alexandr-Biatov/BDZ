import java.util.Arrays;
import java.util.Scanner;


public class Tusk_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char[] c = n.toCharArray();
        Arrays.sort(c);
        while (true){
            if (c[0] != '0') {
                System.out.print(new String(c) + " ");
            }
            int s = c.length;
            int i = s - 1;
            while (i > 0 && c[i - 1] >= c[i]) {
                i--;
            }
            if (i <= 0) {
                break;
            }
            int j = s - 1;
            while (c[j] <= c[i - 1]) {
                j--;
            }
            char buf = c[i - 1];
            c[i - 1] = c[j];
            c[j] = buf;
            j = s - 1;
            while (i < j) {
                buf = c[i];
                c[i] = c[j];
                c[j] = buf;
                i++;
                j--;
            }
        }
    }
}