# Interfaces Funcionais

Em Java, uma interface funcional é uma interface que possui apenas um único método abstrato. Tais interfaces são frequentemente usadas para representar tipos de funções (por exemplo, em expressões lambda ou métodos de referência) e, portanto, são conhecidas como interfaces funcionais.

A partir do Java 8, uma anotação chamada @FunctionalInterface foi introduzida para indicar explicitamente que uma interface deve ser tratada como uma interface funcional. Essa anotação é opcional, mas é uma prática recomendada usá-la para evitar acidentalmente violar a regra de ter apenas um método abstrato.

Aqui está um exemplo de uma interface funcional e sua marcação com a anotação `@FunctionalInterface`:

## Exemplo

@FunctionalInterface
interface MinhaInterfaceFuncional {
    void meuMetodoAbstrato();

    // Outros métodos podem existir, mas apenas um deve ser abstrato para ser funcional.
    default void meuMetodoPadrao() {
        // Implementação padrão
    }
}

public class Exemplo {
    public static void main(String[] args) {
        MinhaInterfaceFuncional minhaInstancia = () -> {
            System.out.println("Implementação do método abstrato.");
        };

        minhaInstancia.meuMetodoAbstrato();
        minhaInstancia.meuMetodoPadrao(); // Métodos padrão podem ser chamados.
    }
}

Neste exemplo, MinhaInterfaceFuncional é marcada com @FunctionalInterface, indicando que deve ter apenas um método abstrato. Se tentarmos adicionar outro método abstrato a essa interface, o compilador gerará um erro.

@FunctionalInterface
interface MinhaInterfaceFuncional {
    void meuMetodoAbstrato();

    // Erro: Interface 'MinhaInterfaceFuncional' should have exactly one abstract method
    void outroMetodoAbstrato();
}

Se você estiver trabalhando com código legado ou não tiver acesso à anotação `@FunctionalInterface`, a maneira de identificar uma interface funcional é verificar se ela possui apenas um método abstrato. O compilador irá tratá-la como funcional, independentemente da presença da anotação.