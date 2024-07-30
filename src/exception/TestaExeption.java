/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author T
 */
public class TestaExeption {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));

        try {
            FileInputStream arquivo = new FileInputStream("arquivo.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado" + ex);
        }

    }
}
