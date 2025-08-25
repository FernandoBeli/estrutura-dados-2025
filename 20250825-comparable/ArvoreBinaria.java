/**
 * Implementação de uma Árvore Binária de Busca.
 * Foco em operações recursivas para inserção, busca e remoção.
 * @author Equipe da Disciplina
 * @version 2025.08.14
 */
public class ArvoreBinaria<T extends Comparable<T>> implements Arvore<T> {

    private NodoArvore<T> raiz;

    /**
     * Construtor da árvore. Inicia uma árvore vazia.
     */
    public ArvoreBinaria() {
        this.raiz = null;
    }

    // --- MÉTODO DE INSERÇÃO ---

    /**
     * Método público para inserir um novo valor na árvore.
     * Ele chama o método auxiliar recursivo para encontrar a posição correta.
     *
     * @param valor O valor a ser inserido.
     */
    @Override
    public void inserir(T valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    /**
     * Método auxiliar recursivo para inserir um novo nó.
     * Se a subárvore atual é nula, o novo nó é inserido aqui.
     *
     * @param noAtual O nó raiz da subárvore atual.
     * @param valor O valor a ser inserido.
     * @return O nó raiz da subárvore modificada.
     */
    private NodoArvore<T> inserirRecursivo(NodoArvore<T> noAtual, T valor) {
        if (noAtual == null) {
            return new NodoArvore<>(valor);
        }

        if (valor.compareTo(noAtual.getValor()) < 0) {
            noAtual.setEsquerda(inserirRecursivo(noAtual.getEsquerda(), valor));
        } else if (valor.compareTo(noAtual.getValor()) > 0) {
            noAtual.setDireita(inserirRecursivo(noAtual.getDireita(), valor));
        }

        return noAtual;
    }

    // --- MÉTODO DE PESQUISA ---

    /**
     * Método público para pesquisar um valor na árvore.
     * @param valor O valor a ser procurado.
     * @return true se encontrar, false caso contrário.
     */
    @Override
    public boolean buscar(T valor) {
        return pesquisaRecursivo(this.raiz, valor);
    }

    /**
     * Método auxiliar recursivo para buscar um valor.
     *
     * @param noAtual O nó raiz da subárvore de busca.
     * @param valor O valor a ser procurado.
     * @return true se encontrar, false caso contrário.
     */
    private boolean pesquisaRecursivo(NodoArvore<T> noAtual, T valor) {
        if (noAtual == null) {
            return false;
        }
        if (valor.equals(noAtual.getValor())) {
            return true;
        }
        return valor.compareTo(noAtual.getValor()) < 0
                ? pesquisaRecursivo(noAtual.getEsquerda(), valor)
                : pesquisaRecursivo(noAtual.getDireita(), valor);
    }

    // --- MÉTODOS DE IMPRESSÃO (CAMINHAMENTO) ---

    /** Pré-fixado: Raiz -> Esquerda -> Direita */
    @Override
    public void imprimePreFixado() {
        imprimePreFixadoRecursivo(this.raiz);
        System.out.println();
    }

    private void imprimePreFixadoRecursivo(NodoArvore<T> no) {
        if (no != null) {
            System.out.print(no.getValor() + " ");
            imprimePreFixadoRecursivo(no.getEsquerda());
            imprimePreFixadoRecursivo(no.getDireita());
        }
    }

    /** Em ordem: Esquerda -> Raiz -> Direita */
    @Override
    public void imprimeEmOrdem() {
        imprimeEmOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void imprimeEmOrdemRecursivo(NodoArvore<T> no) {
        if (no != null) {
            imprimeEmOrdemRecursivo(no.getEsquerda());
            System.out.print(no.getValor() + " ");
            imprimeEmOrdemRecursivo(no.getDireita());
        }
    }

    /** Pós-fixado: Esquerda -> Direita -> Raiz */
    @Override
    public void imprimePosFixado() {
        imprimePosFixadoRecursivo(this.raiz);
        System.out.println();
    }

    private void imprimePosFixadoRecursivo(NodoArvore<T> no) {
        if (no != null) {
            imprimePosFixadoRecursivo(no.getEsquerda());
            imprimePosFixadoRecursivo(no.getDireita());
            System.out.print(no.getValor() + " ");
        }
    }
}
