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
1111
1112
1133
1444
5555
 */
public class Pattern1 {
    public static void main(String []ags)
    {
        System.out.println("Enter the size of pattern");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("1");
            }
      
            for(int j=0;j<n-i;j++)
            {
                System.out.print(n+1-i);
            
            }
            
            System.out.println();
        }
    }
    
}
