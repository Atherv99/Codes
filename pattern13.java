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
26
3710
481113
59121415
 */
public class pattern13 {
    public static void main(String []args)
    {
        System.out.println("Enter the size of an pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("...................................");
        for(int i=1;i<=n;i++)
        { 
            int k=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+k);
                k=k+n-j;
            }
            System.out.println();
        }
    }
    
}
