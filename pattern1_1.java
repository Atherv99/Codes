import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

 class pattern1 {
    public static void main(String []args)
    {
        int i,j,k;
        System.out.println("Enter the size of patterm");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        k=n;
        for(i=1;i<=n;i++)
        {
            
            for(j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
                
            }
            for(j=1;j<2*(k*2)-3;j++)
            {
                System.out.print(" ");
            }
            k--;
             for(j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
}
