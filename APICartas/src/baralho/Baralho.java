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

import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Representa um baralho, sendo este uma pilha formada por
 * objetos Carta.
 *
 * @see Carta
 * @author Mateus Dal Forno
 * @author Thiago Krug
 */
public class Baralho {

    /**
     * Pilha de cartas chamada baralho
     */
    private Stack<Carta> baralho;

    /**
     * Constrói um Baralho de acordo com a pilha de Cartas
     * passada por parâmetro
     * 
     * @see Carta
     * @param baralho - pilha de Cartas
     */
    public Baralho(Stack<Carta> baralho) {
        this.baralho = baralho;
    }

    /**
     * Cria um Baralho com 52 Cartas. 13 Cartas de cada Naipe, sendo os naipes
     * copas, espadas, ouros e paus.
     * 
     * @see Carta
     * @see Naipe
     */
    public Baralho() {
        this.baralho = new Stack<Carta>();
        for (int i = 1; i < 14; i++) {
            Carta carta1 = new Carta(i, Naipe.COPAS);
            this.addCarta(carta1);
            Carta carta2 = new Carta(i, Naipe.ESPADAS);
            this.addCarta(carta2);
            Carta carta3 = new Carta(i, Naipe.OUROS);
            this.addCarta(carta3);
            Carta carta4 = new Carta(i, Naipe.PAUS);
            this.addCarta(carta4);
        }
    }

    /**
     * Adiciona uma Carta no final da pilha.
     * 
     * @see Carta
     * @param carta a ser adicionada
     * @return true caso a Carta tenha sido adicionada com sucesso
     */
    protected boolean addCarta(Carta carta) {
        return this.baralho.add(carta);
    }

    /**
     * Embaralha o baralho
     */
    public void embaralhar() {
        Collections.shuffle(this.baralho);
    }

    /**
     * Corta o baralho, a partir de uma posição informada
     * @param corte posição para cortar o baralho
     * @return true se o baralho for cortado certo, false caso contrário;
     * 
     */
    public boolean cortar(int corte) {
        boolean retorno = false;
        List corteAbaixo = this.baralho.subList(0, corte);
        List corteAcima = this.baralho.subList(corte, baralho.size());
        this.baralho = null;
        this.baralho = new Stack<Carta>();
        retorno = this.baralho.addAll(corteAcima);
        if (retorno) {
            retorno = this.baralho.addAll(corteAbaixo);
        } else {
            this.baralho.addAll(corteAbaixo);
        }
        return retorno;
    }

    /**
     * Metodo que retorna a primeira carta do baralho
     * @return a primeira carta do baralho
     */
    public Carta getPrimeiraCarta() {
        return this.baralho.pop(); 
    }

    /**
     * Retorna a ultima carta do baralho
     * @return a ultima carta do baralho
     */
    public Carta getUltimaCarta() {
        return this.baralho.remove(0);
    }

    /**
     * Metodo que passa a primeira carta do baralho para a ultima posição
     */
    public void passarPrimeiraCartaParaUltimaPosicao() {
        Carta carta = this.getPrimeiraCarta();
        this.baralho.insertElementAt(carta, 0);
    }

    /**
     * Metodo que converte o baralho em uma String
     * @return saida String com o baralho
     */
    @Override
    public String toString() {
        String saida = "";
        for (Carta carta : baralho) {
            saida += "[" + carta.toString() + "], ";
        }
        return saida;
    }
}
