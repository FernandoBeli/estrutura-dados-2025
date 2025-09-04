public class Cliente implements Comparable<Cliente> {
    String nome;
    String sobrenome;
    String cpf;
    String telefone;
    String email;
    String endereco;

    @Override
    public int compareTo(Cliente outro) {
        // Aqui usamos nome e CPF como critério de comparação, por exemplo:
        String valorAtual = this.nome + '-' + this.sobrenome + '-' + this.cpf;
        String valorOutro = outro.nome + '-' + outro.sobrenome + '-' + outro.cpf;
        // Retorna:
        // -1 se esse é menor do que outro
        // 1 se esse é maior do que outro
        // 0 se são iguais
        return valorAtual.compareTo(valorOutro);
    }

    public Cliente(String nome, String sobrenome, String cpf, String telefone, String email, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public String toString() {  
        return "Cliente: " + this.nome + ' ' + this.sobrenome + " - CPF: " + this.cpf + "\n";
    }
}
