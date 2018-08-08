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
10
101
1010
10101
 */
public class pattern10 {
    public static void main(String[]args)
    {
        System.out.println("Enter the size of an pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(".............................");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
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
            System.out.println("");
        }
    }
    
}
