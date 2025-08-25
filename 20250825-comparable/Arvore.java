/**
 * Interface de uma Árvore Binária de Busca.
 * Define operações básicas como inserção, busca e caminhamentos.
 * @author
 * @version 2025.08.14
 */
public interface Arvore<T extends Comparable<T>> {

    void inserir(T valor);

    boolean buscar(T valor);

    void imprimePreFixado();

    void imprimeEmOrdem();

    void imprimePosFixado();
}
