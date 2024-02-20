/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

/**
 *
 * @author tulio
 */
public class TesteOperacoes2 {
    public static void main(String[] args) {
        Operacoes x = new Operacoes();
        x.n1=20;
        x.n2 = 90;
        double resultado = x.soma2();
        System.out.println("Resultado: "+x.soma2());
        System.out.println("Resultado: "+resultado);
    }
    
}
