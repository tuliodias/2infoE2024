/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.util.Scanner;

/**
 *
 * @author tulio
 */
public class TesteOperacoes3 {
    public static void main(String[] args) {
        Operacoes x = new Operacoes();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Digite o valor 2: ");
        double numero2 = entrada.nextDouble();
        
        double resultado = x.soma3(numero1, numero2);
       
        System.out.println("Resultado: "+x.soma3(30, 100));
        System.out.println("Resultado da variavel: "+resultado);
    }
    
}
