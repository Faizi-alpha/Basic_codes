import java.util.Scanner;
public class Maximise_the_Earning {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int S=s.nextInt();

        while(S-->0)
        {
            int N=s.nextInt();
            int R=s.nextInt();
            int [] arr=new int[N];

            for(int i=0;i<N;i++)
            {
                arr[i]=s.nextInt();
            }

            int max=arr[0];
            int c=1;
            for(int i=1;i<=N-1;i++)
            {
                if(arr[i]>max)
                {
                    c++;
                    max=arr[i];
                }
            }
            int price=R*c;
            System.out.println(price);

        }
    }
}
