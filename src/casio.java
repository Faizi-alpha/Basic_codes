import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class casio {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T-- > 0) {
            int N = s.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++)
            {
                arr[i]=s.nextInt();
            }
            int max=arr[arr.length-1];
            System.out.print(max+" ");
            for(int j=N-2;j>=0;j--)
            {

                if(arr[j]>max)
                {
                    max=arr[j];
                    System.out.print(max+" ");
                }

            }

        }
    }
}