//Basic Pattern 2
//From website http://cbasicprogram.blogspot.com/2012/04/number-patterns.html

import java.util.Scanner;
public class pattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=1;i<=n;i++)
        {
            int k=n;
            for(int j=i;j<=k;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}