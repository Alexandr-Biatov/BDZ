
import java.util.Scanner;


public class Tusk_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day=in.nextInt();
        int monce=in.nextInt();
        int year=in.nextInt(), visflag = 0;
        if((year%4==0 && year%100!=0) || (year%400==0))
            visflag=1;
        int[] arr = {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
        if(visflag==1)
        {
            --arr[0];
            --arr[1];
        }
        int[] arrcode = new int[101];
        for(int i = 0; i <= 100; ++i){
            if(i%4==0)
                arrcode[i]=6;
            if(i%4==1)
                arrcode[i]=4;
            if(i%4==2)
                arrcode[i]=2;
            if(i%4==3)
                arrcode[i]=0;
        }
        int century = year/100;
        int codeYear = (arrcode[century]+year%100+(year%100)/4)%7;
        int ans = (day + arr[monce-1] + codeYear)%7;
        if(ans == 0)
            System.out.println("Saturday");
        if(ans == 1)
            System.out.println("Sunday");
        if(ans == 2)
            System.out.println("Monday");
        if(ans == 3)
            System.out.println("Tuesday");
        if(ans==4)
            System.out.println("Wednsday");
        if(ans==5)
            System.out.println("Thursday");
        if(ans == 6)
            System.out.println("Friday");
    }
}