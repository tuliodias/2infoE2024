/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import banco.Cliente;

/**
 *
 * @author T
 */
public class Conta {

    private int numero;
    private double saldo;
    private double limite;
    Cliente titular = new Cliente();
    Cliente titular2;

     public  int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

// construtor
Conta(){

}

Conta(Cliente titular2) {
        this.titular2 = titular2;
        }
// ..



    public double getSaldo() {
        return this.saldo;
    }

   

    public void saca(double quantidade) {

        if (quantidade > this.saldo + this.limite) {
            System.out.println("Não posso sacar fora do limite!");
        } else {
            this.saldo = this.saldo - quantidade;
        }
    }

    public void deposita(double quantidade) {
        //if (quantidade<0) throw new IllegalArgumentException("Vc tentou depositar uma valor inválido!");
        if (quantidade<0)  throw new ValorInvalidoException(quantidade);
        else this.saldo += quantidade;

    }

    public void transfere(Conta destino, double valor) {
        saca(valor);
        destino.deposita(valor);
    }

    
}
