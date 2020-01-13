/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;
class StrangeGame{
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        while(T-->0)
        {
            int N=s.nextInt();
            int K=s.nextInt();

            int[] a=new int[N];

            int[] b=new int[N];

            for(int i=0;i<N;i++)
            {
                a[i]=s.nextInt();
            }
            for(int i=0;i<N;i++)
            {
                b[i]=s.nextInt();
            }

            int mb=b[0];
            for(int i=1;i<N;i++)
            {
                if(b[i]>mb)
                {
                    mb=b[i];
                }
            }

            int m=mb+1;
            int sum=0;
            for(int i=0;i<N;i++)
            {
                int diff=0;
                if(a[i]<m)
                {

                    diff=m-a[i];
                }
                sum=sum+diff;
            }
            System.out.println(sum*K);
        }

    }
}
