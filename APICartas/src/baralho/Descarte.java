/**
 * <copyright>
 * 
 * Copyright 2012 Mateus Henrique Dal Forno <mateush.dalforno@gmail.com>
 * Copyright 2012 Thiago Cassio Krug <thiagockrug@gmail.com>
 * 
 * Este programa e todos os materiais que o acompanham estão disponibilizados
 * sob a licença GPL versão 3, que acompanha esta distribuição e está disponível
 * em http://www.gnu.org/licenses/gpl.html
 * </copyright>
 */
package baralho;

import java.util.Stack;

/**
 * Classe que representa o descarte
 * 
 * @author Mateus Dal Forno
 * @author Thiago Krug
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
