/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que6;

/**
 *
 * @author S541994
 */
public class Unchecked1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("***Narsing rao nikitha madhari***");
        try {

            String arr[] = {"hello", "world"};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("array index out of bound");
        }

    }

}
