import java.util.Scanner;
public class matrix {
    public static void main(String args[])
    {

        int[][] arr = { { 1, 0 }, { 0, 0 } };

        int max=0;
        for(int k=0;k<2;k++)
        {
            for(int x=0;x<2;x++)
            {

                if(arr[x][k] == '0')
                {
                  max=max+1;
                }
            }
        }
        System.out.print(max);
    }
}
