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

/**
 * A classe Carta contém o número da carta e o Naipe que
 * ela representa.
 *
 * @see Naipe
 * @author Mateus Dal Forno
 * @author Thiago Krug
 */
public class Carta {
    
    /**
     * Número da carta
     */
    private int numero;
    
    /**
     * Naipe da carta
     * @see Naipe
     */
    private Naipe naipe;

    /**
     * Construtor da classe Carta. Deve ser passado o número da
     * carta e o Naipe que ela representa.
     * 
     * @see Naipe
     * @param numero da Carta.
     * @param naipe da Carta.
     */
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    /**
     * Método que retorna o número em int da Carta.
     * 
     * @return O número em int da Carta
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método que retorna o Naipe da Carta
     * 
     * @see Naipe
     * @return O Naipe da Carta
     */
    public Naipe getNaipe() {
        return naipe;
    }
    
    /**
     * Método que retorna uma String com o número e o Naipe da Carta
     * 
     * @return O número e o Naipe da Carta
     */
    @Override
    public String toString() {
        return this.getNumero() + ", " + this.getNaipe();
    }
}
