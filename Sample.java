import java.util.Scanner;
public class Sample {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int d;
        System.out.print("Enter the no of lines");
        d=s.nextInt();
        int x=d-2;
        for(int i=1;i<=2;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("1");
            }
            System.out.println();
        }
                                          //Till here
                                          // 1
                                          // 11  is printed
        if(d>0)
        {
            for(int i=1;i<=x;i++)
            {
                System.out.print("1");
                for(int j=1;j<=i;j++)
                {
                    System.out.print("2");
                }
                System.out.print("1");
                System.out.println();
            }
        }
    }
 }            //IN ABOVE CODE
              //121
              //1221
              //12221 IS PRINTED
