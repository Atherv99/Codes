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
123456
 23456
  3456
   456
    56
     6
    56
   456
  3456
 23456
123456
 */
public class pattern8 {
    public static void main(String []args)
    {
        System.out.println("Enter the size pf an pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("..............................");
        for(int i=1;i<=n;i++)
        {
             for(int j=1;j<i;j++)
            {
              System.out.print(" ");
            }
           
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<n;i++)
        {
          for(int j=1;j<n-i;j++)
            {
              System.out.print(" ");
            }
           
            for(int j=n-i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
