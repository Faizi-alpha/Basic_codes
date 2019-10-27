import java.util.Scanner;
public class reverse {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number");
        int n=s.nextInt();
         int y=0;
       while(n!=0){
           int x=n%10;
           y=y*10+x;
           n=n/10;

       }
       System.out.print("reverse is "+y);

    }
}
