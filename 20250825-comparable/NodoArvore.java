/**
 * Classe que representa um nó de uma Árvore Binária.
 * Contém o valor armazenado e referências para os filhos esquerdo e direito.
 * @param <T> Tipo genérico que deve implementar Comparable.
 */
public class NodoArvore<T extends Comparable<T>> {

    private T valor;
    private NodoArvore<T> esquerda;
    private NodoArvore<T> direita;

    public NodoArvore(T valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NodoArvore<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NodoArvore<T> esquerda) {
        this.esquerda = esquerda;
    }

    public NodoArvore<T> getDireita() {
        return direita;
    }

    public void setDireita(NodoArvore<T> direita) {
        this.direita = direita;
    }
}
