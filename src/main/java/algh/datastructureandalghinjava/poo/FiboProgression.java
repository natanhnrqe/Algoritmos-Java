package algh.datastructureandalghinjava.poo;

/**
 * Progressao Fibonacci
 */
public class FiboProgression extends Progression{

    // Valor anterior
    long prev;

    // Herda as variaveis first e cur

    /** Construtor Default inicializa os dois primeiros valores
     *  como sendo 0 e 1
     */
    public FiboProgression() {
        this.first = 0;
        this.prev = 1;
    }

    /** Construtor parametrico fornece o primeiro e o segundo valor
     *
     * @param value1 eh o primeiro valor
     * @param value2 eh o segundo valor
     */
    public FiboProgression(long value1, long value2) {
        this.first = value1;
        this.prev = value2 - value1; // Valor ficticio que antecede o primeiro
    }

    /** Avanca a progressao somando o valor anterior no valor atual
     *
     * @return proximo valor da progressao
     */
    protected long nextValue() {
        long temp = prev;
        prev = cur;
        cur += temp;
        return cur;
    }
    // Herda os metodos firstValue() e printProgression(int)
}
