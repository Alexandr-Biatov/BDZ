
import java.util.Scanner;


public class Tusk_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a= in.nextInt(), b=in.nextInt();

        while(b!=0){
            int x = (a&b)<<1;
            a^=b;
            b=x;
        }

        System.out.println(a);

    }
}