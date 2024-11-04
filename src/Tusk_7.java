
import java.util.Scanner;


public class Tusk_7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] arr = new int[n][n];
        for(int i = 0; i < n; ++i)
            for(int j = 0; j <= i; ++ j){

                arr[i][j] = in.nextInt();
            }
        for(int i = n-2; i>=0; --i)
            for(int j = 0; j <= i; ++j){
                if(arr[i+1][j]>arr[i+1][j+1])
                    arr[i][j]+=arr[i+1][j];
                else
                    arr[i][j]+=arr[i+1][j+1];
            }
        System.out.println(arr[0][0]);
    }
}