/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;


/**
 *
 * @author tulio
 */
public class TesteConta {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conta c1 = new Conta();
        
        c1.deposita(1000);
       // c1.setCliente("Tulio Dias");
        
        Conta c2= new Conta();
        c2.deposita(1000);
       // c2.setCliente("Pedro Dias");
   
        c1.transfere(c2, 100);
        System.out.println("Saldo de c1: "+c1.getSaldo());
        
        System.out.println("Saldo de c2: "+c2.getSaldo());
       
    }
    
}
