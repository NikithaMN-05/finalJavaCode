/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que5;

/**
 *
 * @author S541994
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***Narsing rao nikitha madhari***");
        ComparableCircle oneComparableCircle = new ComparableCircle(1);
        ComparableCircle twoComparableCircle = new ComparableCircle(3);

        int value = oneComparableCircle.compareTo(twoComparableCircle);

        if (value > 0) {
            System.out.println("larger circle is " + oneComparableCircle.getRadius());
        } else {
            System.out.println("larger circle is " + twoComparableCircle.getRadius());
        }
    }

}
