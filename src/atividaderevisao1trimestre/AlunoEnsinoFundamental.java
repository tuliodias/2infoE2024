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
public class AlunoEnsinoFundamental extends Aluno{
    String serie;
    public AlunoEnsinoFundamental(int nMatricula, Turma objTurma, String nome, String cpf, String rg, String serie) {
        super(nMatricula, objTurma, nome, cpf, rg);
        this.serie = serie;
    }
    
      @Override
      public void visualizarDados(){
        System.out.println("-------Aluno do Ensino Fundamental------");
        super.visualizarDados();
        System.out.println("Série"+this.serie);
    }
    
}
