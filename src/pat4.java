
// From website http://cbasicprogram.blogspot.com/2012/04/number-patterns.html

import java.util.Scanner;
public class pat4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=1;i<=n;i++)
        {   int k=n;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                k--;
            }

            System.out.println();
        }
    }
}