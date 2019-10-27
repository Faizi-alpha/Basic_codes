import java.util.Scanner;
public class PF_f {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num;
        int s_odd=0;
        int s_even=0;
        int dig;
        System.out.print("Enter the value of digit");
        num=s.nextInt();

        while(num>0) {
            dig = num % 10;
            if (dig % 2 == 0)
                s_even += dig;
            else
                s_odd += dig;

            num = num / 10;
        }
        System.out.println("Sum of even digits"+" "+s_even);
        System.out.print("Sum of odd digits "+s_odd);
    }
}
