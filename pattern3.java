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
12345 
1234 
123 
12 
1 
1 
12 
123 
1234 
12345 
123456 
 */
public class pattern3 {
    public static void main(String []args)
    {
        System.out.println("Enter the size of an pattern");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("......................");
            for(int i=n;i>=1;i--)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" "+j);
                }
                System.out.println(" ");
            }
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" "+j);
                }
                System.out.println(" ");
            }
            
    }
    
}
