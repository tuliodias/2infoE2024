/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author tulio
 */
public class Casa {

    private String cor;
    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();

    public void pinta(String cor) {
        this.cor = cor;
    }

    public int quantasPortasEstaoAbertas() {
        int cont = 0;
        if (porta1.estaAberta()) {
            cont = cont + 1;
        }
        if (porta2.estaAberta()) {
            cont = cont + 1;
        }
        if (porta3.estaAberta()) {
            cont = cont + 1;
        }
        return cont;
    }
}
