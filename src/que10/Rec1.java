/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que10;

import java.util.Scanner;

/**
 *
 * @author S541994
 */
public class Rec1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("***Narsing Rao Nikitha Madhari***");
        System.out.println("Please enter any number");
        int num = scan.nextInt();
        Rect(num);

    }

    public static void Rect(int n) {
        if (n == 0) {
            System.out.println("Bye.....");
        } else {
            System.out.println("hi...");
            n--;
            Rect(n);
        }
    }
}
