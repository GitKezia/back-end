// Classe abstrata Pessoa
public abstract class Pessoa {
    private String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void imprimirDados();

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método estático para teste
    public static void main(String[] args) {
        // Criando uma instância de PessoaFisica
        PessoaFisica pessoaFisica = new PessoaFisica("Kezia", "123.456.789-01");

        // Chamando o método imprimirDados da PessoaFisica
        pessoaFisica.imprimirDados();

        System.out.println(); // Adicionando uma linha em branco para separar as saídas

        // Criando uma instância de PessoaJuridica
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa KZ", "12.345.678/0001-90");

        // Chamando o método imprimirDados da PessoaJuridica
        pessoaJuridica.imprimirDados();
    }
}

// Subclasse concreta PessoaFisica
class PessoaFisica extends Pessoa {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    // Implementação do método abstrato da classe mãe
    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + cpf);
    }
}

// Subclasse concreta PessoaJuridica
class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    // Implementação do método abstrato da classe mãe
    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CNPJ: " + cnpj);
    }
}

// Classe com método main para testar as classes
public class Main {
    public static void main(String[] args) {
        // Chama o método main da classe Pessoa para testar suas subclasses
        Pessoa.main(args);
    }
}