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
public  abstract class  Aluno extends Pessoa{
    
    private int nMatricula;
    private String senha;
    private Turma objTurma;

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Turma getObjTurma() {
        return objTurma;
    }

    public void setObjTurma(Turma objTurma) {
        this.objTurma = objTurma;
    }

    
    
    public Aluno(int nMatricula, Turma objTurma, String nome, String cpf, String rg) {
        super(nome, cpf, rg);
        this.nMatricula = nMatricula;
        this.objTurma = objTurma;
    }
    
    @Override
      public void visualizarDados(){
        System.out.println("-------Dados Aluno------");
        super.visualizarDados();
        System.out.println("Matricula: "+this.getnMatricula());
        System.out.println("Turma: "+this.getObjTurma().getNomeTurma());
    }
      
         @Override
    public void login(String senha) {
        if(this.senha.equals(senha)){
            System.out.println("Aluno logado com sucesso!");
        }else{
            System.out.println("Senha inválida!");
        }
    }
    
   
    
}
