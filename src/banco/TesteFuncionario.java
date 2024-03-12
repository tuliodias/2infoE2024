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
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        
        funcionario1.setNomeFuncionario("Pedro");
        funcionario1.setDepartamento("RH");
        funcionario1.demite();
        funcionario1.mostra();
         
        funcionario2.setNomeFuncionario("Maria");
        funcionario2.setSalario(10000);
        funcionario2.bonifica(1000);
        funcionario2.mostra();
        
        
    }
    
}
