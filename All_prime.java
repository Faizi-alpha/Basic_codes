import java.util.Scanner;
public class All_prime {
    public static void main(String args[]) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value till you need to find prime numbers");
        int n = s.nextInt();
        int i=2;
        while(i<=n)
        {    int flag=0;
            int j=2;
            while(j<i)
            {
                if (i%j==0)
                    flag=1;
                j++;
            }
            if(flag==0)
                System.out.println(i);

            i++;

        }
    }
}

