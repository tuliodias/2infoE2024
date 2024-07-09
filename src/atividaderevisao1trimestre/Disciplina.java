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
public class Disciplina {
    private String nomeDisciplina;
    private int idDisciplina;
    private double n1,n2,n3,media;
    Professor objProfessor;
    Aluno objAluno;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getMedia() {
        media = (n1 +n2+n3)/3;
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Professor getObjProfessor() {
        return objProfessor;
    }

    public void setObjProfessor(Professor objProfessor) {
        this.objProfessor = objProfessor;
    }

    public Aluno getObjAluno() {
        return objAluno;
    }

    public void setObjAluno(Aluno objAluno) {
        this.objAluno = objAluno;
    }
    
    

    public Disciplina(String nomeDisciplina, int idDisciplina, Professor objProfessor, Aluno objAluno) {
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = idDisciplina;
        this.objProfessor = objProfessor;
        this.objAluno = objAluno;
    }
    
    public void relatorioAlunoDisciplina(){
        System.out.println("Aluno: "+objAluno.getNome()+" Turma: "+objAluno.getObjTurma().getNomeTurma());
        System.out.println("Disciplina: "+this.getNomeDisciplina()+" Professor: "+objProfessor.getNome());
        System.out.println("Nota1: "+this.getN1()+ "Nota2: "+this.getN2()+" Nota3: "+this.getN3());
        if(this.getMedia()<6){
            System.out.println("Aluno reprovado ");
        }else {
            System.out.println("Aluno aprovado ");
        }
        System.out.print("com média: "+this.getMedia());
        System.out.println("----------------------------------------------");
    }
    
    
    
}
