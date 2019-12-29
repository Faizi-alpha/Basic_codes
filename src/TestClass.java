import java.util.Scanner;
class TestClass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int G[] = new int[N];
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            G[i] = s.nextInt();
        }
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int time = 0;

        int i=0;
        while(i<N)
        {
            int temp;
            if(G[i]==A[i])
            {
                i=i+1;
                time++;
            }
            else
            {
                for(int j=i;j<N-1;j++)
                {
                    temp=G[j];
                    G[j]=G[j+1];
                    G[j+1]=temp;
                }
                time++;
            }
        }
        System.out.print(time);
    }
    }
