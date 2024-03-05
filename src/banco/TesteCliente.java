/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author tulio
 */
public class TesteCliente {
    public static void main(String[] args) {
       Conta minhaConta = new Conta();
      // Cliente cli1 = new Cliente();
       minhaConta.deposita(1000);
       //cli1.setNome("Denise");
      // minhaConta.objCliente = cli1;
       minhaConta.objCliente.setNome("Denise");
        
       System.out.println("Cliente: "+minhaConta.objCliente.getNome());
        System.out.println("Saldo: "+minhaConta.getSaldo());
    
    
    }
    
}
