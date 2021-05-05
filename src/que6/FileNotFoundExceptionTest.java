/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author S541994
 *
 */
public class FileNotFoundExceptionTest {

    public static void main(String[] args) throws IOException {
        System.out.println("***Narsing rao nikitha madhari***");
        File file = new File("Java.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            while (fis.read() != -1) {
                System.out.println(fis.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
