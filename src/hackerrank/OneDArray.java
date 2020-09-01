/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Farzana
 */
import java.util.*;

//https://www.hackerrank.com/challenges/java-1d-array/problem

public class OneDArray {

    public static boolean canWin(int leap, int[] game) {

       // System.out.println(" leap "+leap+" "+Arrays.toString(game));
        return isSloved(0, leap, game);
        // Return true if you can win the game; otherwise, return false.
    }

    public static boolean isSloved(int i, int leap, int[] game){
           if (i >= game.length) {
        return true;
    } else if (i < 0 || game[i] == 1) {
        return false;
    }
    game[i]=1;

     return isSloved(i+1, leap, game) || isSloved(i+leap, leap, game) || isSloved(i-1, leap, game) ;


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

