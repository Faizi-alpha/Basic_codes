import java.util.Scanner;
class Takeoff {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0)
        {
            t--;
            int N=s.nextInt();
            int p=s.nextInt();
            int q=s.nextInt();
            int r=s.nextInt();


            int c=0;
            for(int i=1;i<=N;i++)
            {
                if(i%p==0 && i%q!=0 && i%r!=0)
                    c++;
                else if(i%q==0 && i%p!=0 && i%r!=0)
                    c++;
                else if(i%r==0 && i%p!=0 && i%q!=0)
                    c++;
            }
            System.out.println(c);
        }
    }
}
