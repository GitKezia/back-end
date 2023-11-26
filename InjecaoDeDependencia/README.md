# Injeção de Depedência

Em Java, a injeção de dependência é um padrão de projeto que visa melhorar a modularidade e a testabilidade de um sistema. O principal objetivo é reduzir o acoplamento entre componentes, tornando o código mais flexível e fácil de manter. Existem várias maneiras de implementar a injeção de dependência em Java, e uma das abordagens mais comuns é usar um contêiner de injeção de dependência. Vou mostrar um exemplo simples usando o Spring Framework, que é uma estrutura popular para desenvolvimento Java.

## Exemplo

### Defina a Interface
public interface ServicoNotificacao {
    void notificar(String mensagem);
}

### Implmente uma Classe Concreta

public class ServicoEmail implements ServicoNotificacao {
    @Override
    public void notificar(String mensagem) {
        // Lógica de notificação por e-mail
        System.out.println("Enviando e-mail: " + mensagem);
    }
}

### Crie uma classe que receberá a injeção

public class ClienteServico {
    private final ServicoNotificacao servicoNotificacao;

    // Injeção de dependência através do construtor
    public ClienteServico(ServicoNotificacao servicoNotificacao) {
        this.servicoNotificacao = servicoNotificacao;
    }

    public void executar() {
        // Lógica do cliente
        System.out.println("Realizando alguma ação...");

        // Utilizando o serviço de notificação
        servicoNotificacao.notificar("Ação concluída!");
    }
}

### Configure o contêiner de Injeção de Dependência (String)

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoSpring {

    @Bean
    public ServicoNotificacao servicoEmail() {
        return new ServicoEmail();
    }

    @Bean
    public ClienteServico clienteServico(ServicoNotificacao servicoNotificacao) {
        return new ClienteServico(servicoNotificacao);
    }
}

### Utilizar o Contêiner na Aplicação

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacao {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext contexto =
                new AnnotationConfigApplicationContext(ConfiguracaoSpring.class)) {

            ClienteServico clienteServico = contexto.getBean(ClienteServico.class);
            clienteServico.executar();
        }
    }
}

Neste exemplo, o Spring gerenciará a criação e a injeção de dependência dos objetos. Através da anotação @Autowired ou pelo construtor (como exemplificado), o Spring cuidará da resolução das dependências, fornecendo uma instância apropriada do serviço de notificação.

Lembrando e que existem outras abordagens e estruturas para implementar a injeção de dependência em Java, como Guice, CDI, Dagger, entre outras. A escolha depende das necessidades específicas do projeto e das preferências da equipe de desenvolvimento.