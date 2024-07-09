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
public class Teste {
    public static void main(String[] args) {
        Turma objTurmaE = new Turma("Turma E");
        Turma objTurmaA = new Turma("Turma A");
        Aluno objAlunojoao = new AlunoEnsinoFundamental(1234645, objTurmaE, "João", "0342525255", "mg121234","5ª");
        Aluno objAlunopedro = new AlunoEnsinoMedio(5656565, objTurmaA, "Pedro", "34343", "34343","Técnico em Informática");
        Professor profTulio = new Professor("Tulio", "0080980809", "mg9979987", "098080");
        Professor profJoao = new Professor("João", "0989090980","m65664646", "325568");
        Disciplina programacao = new Disciplina("Linguagem de Programação", 0, profTulio, objAlunojoao);
        Disciplina portugues = new Disciplina("Portugues", 0, profJoao, objAlunopedro);
      
        profTulio.publicarNota(programacao, objAlunojoao, 6, 2, 0);
        profJoao.publicarNota(portugues, objAlunopedro, 10, 6, 2);
        
        objAlunopedro.visualizarDados();
        programacao.relatorioAlunoDisciplina();
        profTulio.visualizarDados();
        
        objAlunojoao.visualizarDados();
        portugues.relatorioAlunoDisciplina();
        profJoao.visualizarDados();
        
        
        System.out.println("\n\n----------------------Mostrando o polimorfismo-----------------------");
        relatorio(profTulio);
        relatorio(objAlunojoao);
        
        
    }
    public static void relatorio(Pessoa objPessoa){
        objPessoa.visualizarDados();
    }
    
}
