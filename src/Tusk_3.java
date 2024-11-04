
import java.util.Scanner;


public class Tusk_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i  = 0; i < n; ++i)
        {
            arr[i]=in.nextInt();
        }
        int ComboUnit= arr[0];
        for(int i  = 1; i < n; ++i){
            if(arr[i]!=ComboUnit)
            {
                System.out.print(ComboUnit + " ");
                ComboUnit = arr[i];
            }

        }
        System.out.print(ComboUnit + " ");


    }
}