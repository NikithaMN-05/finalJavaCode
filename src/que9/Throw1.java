/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que9;

/**
 *
 * @author S541994
 */
public class Throw1 {

    int a = 12;
    int b = 5;

    void divide() {
        if (b == 5) {
            throw new ArithmeticException("cannot divide by 5");

        } else {
            int res = a / b;
            System.out.println(res);

        }

    }

}
