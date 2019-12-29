import java.util.Scanner;
public class patt_imp {
    public static void main(String args[])
    {
        Scanner s=new Scanner((System.in));
        int n=s.nextInt();
        int k;
        for(int i=n;i>=1;i--)
        {
            if(i%2==1)
                k=1;
            else
                k=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                if(i%2==1)
                    k++;
                else
                    k--;
            }
            System.out.println();
        }
    }
}
