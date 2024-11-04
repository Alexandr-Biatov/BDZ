import java.util.Scanner;

public class Tusk_8 {
    static void fun(int step, int sturt, int end) {
        String x = "Move disk " + step + " from " + Character.toString('A' + sturt) + " to " + Character.toString('A' + end);
        if (step == 1) {
            System.out.println(x);
            return;
        }
        int next = 3 - sturt - end;
        fun(step - 1, sturt, next);
        System.out.println(x);
        fun(step - 1, next, end);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = in.nextInt();

        fun(n, 0, 2);
    }

}