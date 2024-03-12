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
public class TestaPorta {
    public static void main(String[] args) {
        
        Porta objPorta = new Porta();
        objPorta.abre();
        objPorta.fecha();
        objPorta.pinta("azul");
        objPorta.setDimensaoX(80);
        objPorta.setDimensaoY(200);
        objPorta.setDimensaoZ(5);
        if(objPorta.estaAberta()==true){
            System.out.println("Porta aberta");
        }else{
            System.out.println("Porta Fechada");
        }
        
        System.out.println("Cor da porta "+objPorta.getCor());
        System.out.println("Dimensão x: "+objPorta.getDimensaoX());
               
    }
    
}
