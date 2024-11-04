
import java.util.Scanner;


public class Tusk_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a=in.nextLine();

        char[] arr = a.toCharArray();
        int Combo=1;
        char ComboUnit=arr[0];
        for(int i  = 1; i < arr.length; ++i){
            if(arr[i]!=ComboUnit)
            {
                System.out.print(ComboUnit  + "" + Combo);
                ComboUnit = arr[i];
                Combo = 1;
            }
            else{
                ++Combo;
            }

        }
        System.out.print(ComboUnit + "" + Combo);


    }
}