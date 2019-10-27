import java.util.Scanner;
public class PF1_a {

    public static void main(String[] args) {
        // Write your code here
        char name;
        int t1,t2,t3,x,z,avg;
        int sum=0;

        Scanner s =new Scanner(System.in);
        System.out.print("Enter values");
        name=s.next().charAt(0);
        t1 = s.nextInt();
        t2 = s.nextInt();
        t3 = s.nextInt();
        x=t1<t2?t1:t2;
        z=x<t3?x:t3;
        sum=t1+t2+t3;
        avg=(sum-z)/2;
        System.out.print(name);
        System.out.print(" ");
        System.out.print(avg);

    }
}
