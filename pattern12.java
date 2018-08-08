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
000000
100000
020000
003000
000400
000050
000006
 */
public class pattern12 {
    public static void main(String []args)
    {
        System.out.println("Enter the size of an pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("................................");
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j)
                {
                System.out.print(i);
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
}
