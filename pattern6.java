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
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
 */
public class pattern6 {
    public static void main(String []args)
    {
        System.out.println("Enter the size of an pattern");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("............................");
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
        
        
        
    }
    
}
