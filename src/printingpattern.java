import java.util.Scanner;

public class printingpattern {

    /*

     *
     * *
     * * *
     * * * *


     */

        static void pattern(int n)
        {
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        }

        public static void main(String[] args) {
            int r, c, n;
            Scanner scn = new Scanner(System.in);

            System.out.println("enter the number");
            n = scn.nextInt();
            pattern(n);
        }
    }


