
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
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
    5 6 
   4 5 6 
  3 4 5 6 
 2 3 4 5 6 
1 2 3 4 5 6 
 */
public class pattern9 {

    public static void main(String[] args) {
        System.out.println("Enter the size of an pattern");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("................................");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" "+j);
                System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j <= n; j++) {
                System.out.print(" "+j);
                System.out.print(" ");
            }

            System.out.println();
        }
    }

}
