# Como são desenvolvidos os app´s modernos com JSP?

JSP é o acrônimo para Java Server Pages, uma linguagem criada pela SUN gratuita, JSP é uma linguagem de script com especificação aberta que tem como objetivo primário a geração de conteúdo dinâmico para páginas da Internet. Podemos ao invés de utilizar HTML para desenvolver páginas Web estáticas e sem funcionalidade, utilizar o JSP para criar dinamismo. É possível escrever HTML com códigos JSP embutidos. Como o HTML é uma linguagem estática, o JSP será o responsável por criar dinamismo. Por ser gratuita e possuir especificação aberta possui diversos servidores que suportam a linguagem, entre eles temos: Tomcat, GlassFish, JBoss, entre outros. O JSP necessita de servidor para funcionar por ser uma linguagem Server-side script, o usuário não consegue ver a codificação JSP, pois esta é convertida diretamente pelo servidor, sendo apresentado ao usuário apenas codificação HTML.

Uma pagina JSP possui extensão .jsp e consiste em uma página com codificação HTML e com codificação Java, inserida entre as tag´s <% e %>, denominada scriptlets e funcionando da seguinte forma: o servidor recebe uma requisição para uma página JSP, interpreta esta página gerando a codificação HTML e retorna ao cliente o resultado de sua solicitação. A página JSP que foi interpretada pelo servidor não precisa ser compilada como aconteceria com um servlet java por exemplo, esta tarefa é realizada em tempo real pelo servidor. É necessário apenas desenvolver as páginas JSP e disponibilizá-las no Servlet Container (Tomcat, por exemplo). O trabalho restante será realizado pelo servidor que faz a compilação em tempo de uso transformando o jsp em bytecode.

Assim, pode-se definir o JSP como uma tecnologia que provê uma maneira simples e prática de desenvolver aplicações dinâmicas baseadas em web, sendo independente de Plataforma de Sistema Operacional.

# Desenvolvimento de app´s com Angular

O Angular é um framework baseado em JavaScript utilizado para criação de Single Page Applications (SPA). Além da web, os projetos desse framework também se adaptam ao mobile e desktop. Lançado em 2016, o Angular utiliza Typescript para a construção de interfaces, de modo simples e otimizado.

O Angular funciona a partir de módulos. Os módulos são blocos de códigos utilizados para construir sua estrutura. Além dos que já vem por padrão, o framework também permite a adição de módulos de terceiros, que estendem as funcionalidades do Angular e permitem criar projetos mais complexos.

Para a escrita de seus códigos, essa tecnologia usa a linguagem de programação Typescript. Quando o código Typescript é compilado, é gerado um código JavaScript, para que a aplicação possa ser executada em navegadores sem problemas de compatibilidade.

# O que é IDE?

Integrated Development Environment

É um software que auxilia no desenvolvimento de aplicações, muito utilizado por desenvolvedores, com o objetivo de facilitar diversos processos (ligados ao desenvolvimento), que combinam ferramentas comuns em uma única interface gráfica do usuário GUI "Graphical User Interface" (interface Gráfica do Usuário).

Para o desenvolvedor, é uma forma de criar aplicações de maneira mais rápida, uma vez que estas IDEs auxiliam em todo o processo de desenvolvimento de ua aplicação, provendo diversos benefícios, como análise de todo o código a ser escrito para identificar bugs causados por um erro de digitação, autocompletam trechos de códigos, etc.

## Características

- Editor de código-fonte: utilizado para escrever comandos suportados por uma determinada linguagem de programação;

- Preenchimento inteligente: é um recurso da IDE que permite o preenchimento de trechos de código com a finalidade de agilizar o desenvolvimento; 

- Compilador ou interpretador: Toda IDE possui um compilador (ou um interpretador) integrado, que transformará todo o código-fonte escrito em linguagem de máquina;

- Geração automática de código: é um recurso que permite a criação de trechos de códigos predefinidos, trazendo agilidade ao processo de desenvolvimento;

- Refatoração: é uma ferramente que, em conjunto com testes automatizados, garantem a melhoria constante do código-fonte e erradicação de bugs;

- Debbuger: utilizado para encontrar e corrigir erros no código-fonte;

## Vantagens 

- Aumento da produtividade: por possuir diversas ferramentas que auxiliam na criação de aplicações, o desenvolvedor só utilizará esta ferramenta, aumentando assim a produtividade.

- Diminuição de gastos: por ser uma solução completa, muitas vzes esta é a única ferramente que o desenvolvedor precisa adquirir para construção de suas aplicações;

- Medir desempenho: diversas IDEs possuem também ferramentas para medição de desempenho da execução de aplicações;

- Geração automática de códigos: como dito acima, é o recurso que permite a criação de trechos de códigos predefinidos.

## Desvantagens

- facilidade no desenvolvimento: aqui podemos analisar por duas vertentes, por prover diversas facilidades na hora do desenvolvimento (como a geração automática de códigos, por exemplo), mas podem também contribuir para que muitos desenvolvedores se tornem "mal acostumados" na hora de desenvolvee e, assim, se tornando dependentes da IDE;

- Ambiente lento: apesar de ser uma solução completa, isso tem um custo. A maioria da IDEs consomem muito mais recursos de hardware do computador que um simples editor de texto.

EXEMPLO: IJ, Java EE, NetBeans, Eclipse, Spring Tools, Visual Studio Code.
