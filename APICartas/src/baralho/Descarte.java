/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

import java.util.Stack;

/**
 *
 * @author thiago
 */
public class Descarte {
    
    /**
     * Uma pilha de cartas
     */
    private Stack<Carta> baralho;

    /**
     * Metodo construtor da classe Descarte.
     */
    public Descarte() {
        this.baralho = new Stack<Carta>();
    }
    /**
     * Metodo para adicionar uma carta
     * @param carta Carta a ser adicionada ao descarte
     * @return true se a carta foi colocada no descarte, false se a carta não 
     * foi colocada no descarte
     */
    public boolean addCarta(Carta carta) {
        Carta verifica = this.baralho.push(carta);
        if (verifica != null) {
            return true;
        }
        return false;
    }
    /**
     * Metodo que retorna uma carta do descarte, sem removê-la do descarte.
     * @param posicao posição da carta no descarte
     * @return carta.
     */
    public Carta verCarta(int posicao) {
        return this.baralho.get(posicao);
    }
}
