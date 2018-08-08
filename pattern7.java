import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashwani Kumar
 * program
1
121
12321
1234321
123454321
12345654321
 */
public class pattern7 
{
        public static void main(String []args)
        {
            System.out.println("Enter the size of an pattern");
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("..............................");
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                System.out.print(" "+j);
                }
                for(int j=i-1;j>=1;j--)
                {
                    System.out.print(" "+j);
                }
                System.out.println();
            }
        }


    
}
