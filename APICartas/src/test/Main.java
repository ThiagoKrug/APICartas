/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import baralho.Baralho;
import baralho.Carta;
import baralho.Descarte;
import baralho.Naipe;

/**
 *
 * @author thiago
 */
public class Main {

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println(baralho.size()+"\n"+baralho.toString());
        baralho.cortar(30);
        System.out.println(baralho.size()+"\n"+baralho.toString());
        Descarte descarte = new Descarte();
        descarte.addCarta(new Carta(1, Naipe.COPAS));
        
    }
}
