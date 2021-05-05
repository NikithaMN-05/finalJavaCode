/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que11;

import java.util.ArrayList;

/**
 *
 * @author S541994
 */
public class Icecreamdriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***Narsing Rao Nikitha Madhari***");
        /*creating four objects for icecream and passing parameters*/
        Icecream IC1 = new Icecream("Pistha", "green", 20);
        Icecream IC2 = new Icecream("chocolate", "brown", 50);
        Icecream IC3 = new Icecream("mango", "green", 60);
        Icecream IC4 = new Icecream("vinalla", "white", 14);
        System.out.println("-------------------equals---------------");
        /*object IC2 equals to IC4*/
        System.out.println(IC2.equals(IC4));
        /*object IC1 equals to IC3*/
        System.out.println(IC1.equals(IC3));
        /*object IC4 equals to IC2*/
        System.out.println(IC4.equals(IC2));
        /*object IC3 equals to IC1*/
        System.out.println(IC3.equals(IC1));
        System.out.println("-------------------HashCode--------------");
        /*here we are printing the   hashcode for each object*/
        System.out.println(IC1.hashCode());
        System.out.println(IC2.hashCode());
        System.out.println(IC3.hashCode());
        System.out.println(IC4.hashCode());

    }

}
