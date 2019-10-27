//Basic Pattern 3
//From website http://cbasicprogram.blogspot.com/2012/04/number-patterns.html
import java.util.Scanner;
public class Pat3 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=n;
        for(int i=1;i<=k;i++)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            n--;
        }
    }
}
