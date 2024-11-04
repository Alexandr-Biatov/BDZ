
import java.util.Scanner;


public class Tusk_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr1 = new int[26], arr2 = new int[26];
        String word1 = in.nextLine(), word2 = in.nextLine();
        char[] wordChar1 = word1.toCharArray(), wordChar2 = word2.toCharArray();
        for(int i = 0; i < wordChar1.length; ++i)
        {
            if(wordChar1[i]>90 && wordChar1[i]<123)
            {
                wordChar1[i]-=32;
            }
            if(wordChar1[i]>64)
                ++arr1[wordChar1[i]-65];

        }
        for(int i = 0; i < wordChar2.length; ++i)
        {
            if(wordChar2[i]>90 && wordChar2[i]<123)
            {
                wordChar2[i]-=32;
            }
            if(wordChar2[i]>64)
                ++arr2[wordChar2[i]-65];

        }
        int flag = 0;
        for(int i = 0; i < 26 && flag!=1; ++i)
        {
            if(arr1[i]!=arr2[i])
                flag=1;
        }
        if(flag==1)
            System.out.println("No");
        else
            System.out.println("Yes");

    }
}