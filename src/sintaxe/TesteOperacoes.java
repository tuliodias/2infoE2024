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
public class TesteOperacoes {

    public static void main(String[] args) {
        Operacoes objOperacoes = new Operacoes();// instaciei a classe Operacoes -> Criei um objeto
        objOperacoes.n1 = 10;
        objOperacoes.n2 = 20;
        objOperacoes.soma();
        System.out.println("Resultado da soma: " + objOperacoes.resultado);
        
        Operacoes objOperacoes2 = new Operacoes();// instaciei a classe Operacoes -> Criei um objeto
        objOperacoes2.n1 = 40;
        objOperacoes2.n2 = 50.50;
        objOperacoes2.soma();
        System.out.println("Resultado da soma2: " + objOperacoes2.resultado);

    }

}
