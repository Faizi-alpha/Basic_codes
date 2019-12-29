//For pattern
//1
//11
//202
//3003
//40004


import java.util.Scanner;
public class PF_NumP2 {

        public static void main(String args[]) {
            int x;
            System.out.print("Enter no of rows to be printed");
            Scanner s = new Scanner(System.in);
            x = s.nextInt();
            int row = 2;
            int d = x - 2;
            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("1");
                }
                System.out.println();
            }
            //Till here
            // 1
            // 11  is printed
            if (d > 0) {
                for (int i = 1; i <= d; i++) {
                    System.out.print(row);
                    for (int j = 0; j < i; j++) {
                        System.out.print("0");
                    }
                    System.out.print(row);
                    System.out.println();
                    row++;
                }
            }
        }
    }
