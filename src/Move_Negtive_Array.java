import java.util.Scanner;
class Move_Negetive_Arrays{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int arr[]=new int[N];

        for(int i=0;i<N;i++)
        {
            arr[i]=s.nextInt();
        }


        int j = 0, temp;
        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }


        for(int i=0;i<=N-1;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
