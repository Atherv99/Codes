import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author Ashwani Kumar
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the size of pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("................");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
             System.out.print(" "+j);
            }
            System.out.println();
        }
        
    }
    
}
