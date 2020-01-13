import java.util.Scanner;
public class Move_NegetiveArray_Order {

    static void move(int arr[], int N) {
        int temp[] = new int[N];
        int j = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }
        }
        //to check if array contains all positive or all negetive numbers

        if (j == N || j == 0)
            return;

        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) {
                temp[j++] = arr[i];
            }
        }
        //move all elements now from temp array to original arr
        for(int i=0;i<N;i++)
        {
            arr[i]=temp[i];
        }
    }

    public static void main(String args[])
    {
        int abc[]={1, -1, -3, -2, 7, 5, 11, 6};
        int d=abc.length;

        move(abc,d);

        for(int i=0;i<d;i++)
        {
            System.out.print(abc[i]+" ");
        }
    }
}
