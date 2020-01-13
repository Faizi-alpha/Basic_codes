import java.util.Scanner;
public class ATM_Queue {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int a[]=new int[N];

        for(int i=0;i<N;i++)
        {
            a[i]=s.nextInt();
        }
        int g=1;
        for(int i=0;i<N-1;i++)
        {
            if(a[i]>a[i+1])
                g++;
        }
        System.out.print(g);
    }
}
//Passed All test cases ! Done
