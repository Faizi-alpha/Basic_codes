import java.util.Scanner;
public class Arrow_Pattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of lines to be printed");
        int n = s.nextInt();
        int d = (n + 1) / 2;
        System.out.println("*");
        if (d > 1) {
            for (int i = 1; i <= d - 1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            //from here lower part of pattern is to be coded..
            //Its incomplete.
        }
    }
}
