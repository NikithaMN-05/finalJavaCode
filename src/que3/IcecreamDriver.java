/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que3;

/**
 *
 * @author S541994
 */
public class IcecreamDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("***Narsing rao nikitha madhari***");
        Icecream IC = new Browniee("Chocolate", "brown ", 50);
        ((Browniee) (IC)).chocolate();
        Icecream ice = (Icecream) IC;
        System.out.println("Upcasting: " + ice.toString());
        Icecream ic = new Browniee("mango", "yellow", 70);
        Browniee brown = (Browniee) ic;
        System.out.println("downcast: " + brown.getCost());
    }

}
