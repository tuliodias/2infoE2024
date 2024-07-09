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
public class AlunoEnsinoMedio extends Aluno{
    String curso;
    
    public AlunoEnsinoMedio(int nMatricula, Turma objTurma, String nome, String cpf, String rg, String curso) {
        super(nMatricula, objTurma, nome, cpf, rg);
        this.curso=curso;
    }
    
       @Override
      public void visualizarDados(){
        System.out.println("-------Aluno do Ensino Médio------");
        super.visualizarDados();
        System.out.println("Curso"+this.curso);
    }
    
}
