/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashwani Kumar
 */
public class pattern16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=3,k=1;
        for(int i=1;i<=n;i++)
        {
                if(i%2!=0)
                {
                 while(i<=n)
                 {
                     System.out.print(i);
                 }
                 System.out.print(i+1);
                 System.out.println(" ");
                }
                else
                {
                    k++;
                    System.out.print(k+1);
                    while(i<=n)
                    {
                    System.out.print(i);
                    }
                    System.out.println(" ");
                
                }
            System.out.println(" ");
                
        }
    }
    
}
