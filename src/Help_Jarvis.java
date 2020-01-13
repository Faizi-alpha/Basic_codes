import java.util.Scanner;
public class Help_Jarvis {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();  //No of testcases

        while(t-->0)
        {
            int arr[]=new int[4];
            int n=arr.length;

            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }

            // Implement Insertion Sort
            for(int i=1;i<=n-1;i++)
            {
                int value=arr[i];
                int hole=i;
                while(hole>0 && arr[hole-1]>value)
                {
                    arr[hole]=arr[hole-1];
                    hole=hole-1;
                }
                arr[hole]=value;
            }

            boolean b=false;
            for(int i=0;i<n-1;i++)
            {
                if((arr[i]+1)==arr[i+1])
                    b=true;
                else
                    b=false;
            }

            if(b==true)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
