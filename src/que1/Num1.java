/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que1;

/**
 *
 * @author S541994
 */
public class Num1 implements Adding {

    int value;

    Num1() {
        value = 0;
    }

    public int number() {

        value = value + 1;
        return value;
    }
}
