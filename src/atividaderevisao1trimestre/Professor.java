/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividaderevisao1trimestre;

/**
 *
 * @author tulio
 */
public class Professor extends Pessoa{
    private String codigo, senha;
    Disciplina objDiscipla;
    Aluno objAluno;

    public Professor(String nome, String cpf, String rg, String codigo) {
        super(nome, cpf, rg);
        this.codigo = codigo;
    }
    
     @Override
      public void visualizarDados(){
        System.out.println("-------Dados Professor------");
        super.visualizarDados();
        System.out.println("Código: "+this.codigo);
      
    }
      
      public void publicarNota(Disciplina objDisciplina, Aluno objAluno, double n1, double n2, double n3){
          this.objAluno = objAluno;
          this.objDiscipla = objDisciplina;
          this.objDiscipla.setN1(n1);
          this.objDiscipla.setN2(n2);
          this.objDiscipla.setN3(n3);
          
      }

    @Override
    public void login(String senha) {
        if(this.senha.equals(senha)){
            System.out.println("Professor logado com sucesso!");
        }else{
            System.out.println("Senha inválida!");
        }
    }
    
}
