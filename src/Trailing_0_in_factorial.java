import java.util.Scanner;
public class Trailing_0_in_factorial {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value ");
        int n=s.nextInt();

        int k=0;
        for(int i=5;i<=n;i=i*5)
        {
            k=k+n/i;
        }
        System.out.println(k);
    }
}
