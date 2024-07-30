/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Exception;




/**
 *
 * @author T
 */
public class ContaPoupanca extends Conta{

  
  void atualiza(double taxa){
      super.deposita(getSaldo()*taxa*3);

    }

}
