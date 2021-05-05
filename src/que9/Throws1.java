/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que9;

import java.io.IOException;

/**
 *
 * @author S541994
 */
public class Throws1 {

    public static char p1(String str)
            throws java.io.IOException {
        System.out.print(str + " : ");
        return (char) System.in.read();
    }

    public static void main(String args[]) throws IOException {
        System.out.println("***Narsing Rao Nikitha Madhari***");
        char ch;

        try {
            ch = p1("enter a letter");
        } catch (java.io.IOException ex) {
            System.out.println("iO exception");
            ch = 'M';
        }
        System.out.println("you pressed " + ch);
    }

}
