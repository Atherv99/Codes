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
654321
65432
6543
654
65
6
 */
public class pattern4 {
    public static void main(String []args)
    {
        System.out.println("Enter the size of pattern");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(".............................");
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" "+j);
            }
            System.out.println("");
        }
    }    
}
