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
1010100
0101001
1010010
0100101
1001010
0010101
 */
public class pattern11 {
    public static void main(String []args)
    {
        System.out.println("Enter the size of an pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("............................");
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                if(j%2==1)
                {
                System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
         for(int j=1;j<=i;j++)
            {
                if(j%2==1)
                {
                System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
        }
         System.out.println();
        }
    }
    
}
