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
public class Funcionario {
    
    private String nomeFuncionario, departamento, dataEntrada, RG;
    private double salario;
    private boolean ativo=true;

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario.toUpperCase();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    
    public void bonifica(double aumento){
        this.salario = this.salario+aumento;
    }
    
    public void demite(){
        this.ativo = false;
    }
    
    public void mostra(){
        System.out.println("Relatório Funcionário");
        System.out.println("Nome: "+this.getNomeFuncionario());
        System.out.println("RG: "+this.getRG());
        System.out.println("Departamento: "+this.getDepartamento());
        System.out.println("Data Entrada: "+this.getDataEntrada());
        System.out.println("Ativo: "+(this.isAtivo()==true?"Sim":"Não"));//operador ternário
        System.out.println("------------------------------------------");
    }
    
}
