/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author tulio
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa();
        objPessoa.setIdade(40);
        objPessoa.setNome("João");
        objPessoa.fazAniversario();
        
        System.out.println("Nome: "+objPessoa.getNome());
        System.out.println("Idade: "+objPessoa.getIdade());
        
    }
    
}
