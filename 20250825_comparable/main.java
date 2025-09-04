public class Main {
    public static void main(String[] args) {
        // criando clientes (dados fictícios)
        Cliente cliente1 = new Cliente("João", "Silva", "11111111111", "11999999999", "joao@email.com", "Rua A, 123");
        Cliente cliente2 = new Cliente("Maria", "Oliveira", "22222222222", "11988888888", "maria@email.com", "Rua B, 456");
        Cliente cliente3 = new Cliente("Carlos", "Souza", "33333333333", "11977777777", "carlos@email.com", "Rua C, 789");
        Cliente cliente4 = new Cliente("Ana", "Lima", "44444444444", "11966666666", "ana@email.com", "Rua D, 321");
        Cliente cliente5 = new Cliente("Pedro", "Santos", "55555555555", "11955555555", "pedro@email.com", "Rua E, 654");
        Cliente cliente6 = new Cliente("Paula", "Ferreira", "66666666666", "11944444444", "paula@email.com", "Rua F, 987");

        // cria árvore binária de clientes
        ArvoreBinaria<Cliente> arvore = new ArvoreBinaria<>();

        // insere clientes
        arvore.inserir(cliente1);
        arvore.inserir(cliente4);
        arvore.inserir(cliente6);
        arvore.inserir(cliente3);
        arvore.inserir(cliente5);
        arvore.inserir(cliente2);

        // imprime clientes
        arvore.imprimeEmOrdem();
        arvore.imprimePreFixado();
    }
}
