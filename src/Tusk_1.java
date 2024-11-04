
import java.util.Scanner;


public class Tusk_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), ans=0;
        while(n>0){
            ans*=10;
            ans+=n%10;
            n/=10;
        }
        System.out.println(ans);



    }
}