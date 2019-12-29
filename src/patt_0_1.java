import java.util.Scanner;
public class patt_0_1 {
    public static void main(String args[]) {
        Scanner s = new Scanner((System.in));
        int n = s.nextInt();
        int k=1;
        int d=1;
        for (int i=1;i<=n;i++)
        {
            if(i>=2) {
                k=d+i;
                d++;
            }
           for(int j=i;j<=n;j++)
           {
             System.out.print(k);
               k=k+2;
           }
           System.out.println();
        }
    }
}