import java.util.Scanner;
public class num_space_pattern {
    public static void main(String args[])
    {

        for(int i=1;i<=5;i++)
        {   int k=i;
            int a=4;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k=k+a;
                a--;
            }
            System.out.println();
        }
    }
}
