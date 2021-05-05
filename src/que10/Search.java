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
public class Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***Narsing Rao Nikitha Madhari***");

        int arr1[] = new int[11];

        int length = arr1.length;
        int count = 0;
        while (count < length) {
            arr1[count] = count * 3;
            count++;
        }

        for (int j = 0; j < arr1.length - 1; j++) {
            System.out.println(arr1[j]);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to be searched ");

        int n1 = sc.nextInt();
        int result = Search(arr1, 0, arr1.length - 1, n1);
        if (result == 0) {
            System.out.println("Element is not there in the list ");
        } else {
            System.out.println("Element is found at position " + result);
        }
    }

    public static int Search(int[] arr1, int first, int end, int n1) {
        if (first > end) {
            return 0;
        }
        if (arr1[first] == n1) {
            return first;
        }
        return Search(arr1, first + 1, end, n1);
    }
}
