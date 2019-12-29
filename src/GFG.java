import java.util.Scanner;
class GFG{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);



            int N=s.nextInt();
            int a[]=new int[N];
            for(int i=0;i<N;i++)
            {
                a[i]=s.nextInt();
            }


            int temp=0;
            for(int i=0;i<N-1;i++)
            {
                for(int j=0;j<N-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
            int range=a[N-1]-a[0];
            System.out.println("Range is"+range);

        }
    }
