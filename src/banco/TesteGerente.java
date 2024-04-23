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
public class TesteGerente {
    public static void main(String[] args) {
        Gerente objGerente = new Gerente();
        objGerente.setNomeFuncionario("Pedro");;
        objGerente.setSenha(123);
        System.out.println("Gerente: "+objGerente.getNomeFuncionario());
        objGerente.autentica(134);
        
        Supervisor objSupervisor = new Supervisor();
        objSupervisor.setNomeFuncionario("Maria");
        objSupervisor.mostra();
        
        Funcionario objFuncionario = new Funcionario();
        objFuncionario.setSalario(1000);
        System.out.println("Bonificação Funcionario: "+objFuncionario.getBonificacao());
    
        objGerente.setSalario(1000);
        System.out.println("Bonificação Gerente: "+objGerente.getBonificacao());
    
    }
    
}
