/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que7;

/**
 *
 * @author S541994
 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {

    public static void main(String[] args) {

        System.out.println("***Narsing rao nikitha madhari***");

        Random randomValues = new Random();

        int[] centuryArray = new int[100];
        for (int i = 0; i < centuryArray.length; i++) {
            centuryArray[i] = randomValues.nextInt();

            System.out.println(i + " " + centuryArray[i]);
        }

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the index number");

        try {
            int givenIndex = scanner.nextInt();

            if (givenIndex >= centuryArray.length) {
                System.out
                        .println("at Index : " + givenIndex + " " + " Element value is : " + centuryArray[givenIndex]);
            }
        } catch (InputMismatchException | NumberFormatException nmfe) {
            System.out.println("Please enter the valid format");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }

    }

}
