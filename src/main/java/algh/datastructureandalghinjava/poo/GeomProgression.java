package algh.datastructureandalghinjava.poo;

/**
 * Progressao geometrica
 */
public class GeomProgression extends Progression{

    // Base
    protected long base;

    // Herda as variaveis first e cur

    // Construtor default inicializa o valor com base 2

    public GeomProgression() {
        this.base = 2;
        this.first = 1;
        this.cur = first;
    }

    /** Construtor parametrico fornece o valor base
     *
     * @param base eh o valor base da progressao
     */
    public GeomProgression(long base) {
        this.base = base;
        this.first = 1;
        this.cur = first;
    }

    /** Avanca a progressao multiplicando a base pelo valor corrente
     *
     * @return proximo valor da progressao
     */
    protected long nextValue(){
        cur *= base;
        return cur;
    }
    // Herda os metodos firstValue() e printProgression(int)
}
