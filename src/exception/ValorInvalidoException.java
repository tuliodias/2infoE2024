/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author T
 */
public class ValorInvalidoException extends RuntimeException {
//class ValorInvalidoException extends Exception {

    ValorInvalidoException(double quantidade) {
        super("Valor inválido: "+quantidade);
    }

    
}
