
import java.util.Scanner;

public class array_diff {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = n;

        for (int i = 1; i <= n; i++) {
             int x=k;
            if (i >= 2) {                         //condition and loop for printing 4 and then 3 4 in next line and so on
                for (int d = 1; d<=i-1;d++) {
                    System.out.print(x);
                    x++;
                }
            }
            for (int j = i; j <= n; j++) {             //this loop for printing just 5 or n
                System.out.print(n);
            }
            System.out.println();
            k=k-1;                             //here k is decreased by 1 so that x can print 4 and then does not come back to 5 thats why int x=k;

        }
    }
}
