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
public class TesteConstrutor {
    public static void main(String[] args) {
        Conta x = new Conta();
        Conta y = new Conta(10000);
        Conta z = new Conta(5000, 1000, 12543);
        System.out.println("Saldo de x:"+x.getSaldo());
        System.out.println("Saldo de y:"+y.getSaldo());
        
        System.out.println("Saldo de z:"+z.getSaldo());
        
        System.out.println("Total de contas: "+Conta.getTotalDeContas());
       // System.out.println("Total de contas: "+y.getTotalDeContas());
       // System.out.println("Total de contas: "+z.getTotalDeContas());
        System.out.println("ID X: "+x.getIdentificador());
        System.out.println("ID Y: "+y.getIdentificador());
        System.out.println("ID Z: "+z.getIdentificador());
        
    }
    
}
