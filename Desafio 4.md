# Desafio 4 

**Entender o papel da camada de persistência, a abstração da linguagem dos bancos de dados criada pelas ferramentas de ORM.**



**O que é JDBC.**

O JDBC - Java DataBase Connectivity é uma API (Application Programming Interface) do JAVA.

Contém um conjunto de Classes e Interfaces, que fazem o envio de instruções SQL para qualquer banco de dados relacional.

É uma API de baixo nivel base para API's de alto nivel. Possibilitando o uso de bancos de dados já instalados.

Em resumo, o JDBC é um conjunto de especificações onde, para cada banco de dados há um driver JDBC que pode ser de uma das 4 categorias de especificação abaixo:



### *Tipo 1: Ponte JDBC-ODBC*

*É o tipo mais simples mas restrito à plataforma Windows. Utiliza CBDO para conectar-se com o [banco de dados](https://pt.wikipedia.org/wiki/Banco_de_dados), convertendo métodos JDBC em chamadas às funções do ODBC. Esta ponte é normalmente usada quando não há um driver puro-Java (tipo 4) para determinado [banco de dados](https://pt.wikipedia.org/wiki/Banco_de_dados), pois seu uso é desencorajado devido à dependência de plataforma.*

### *Tipo 2: Driver API-Nativo*

*O driver API-Nativo traduz as chamadas JDBC para as chamadas da API cliente do banco de dados usado. Como a Ponte JDBC-ODBC, pode precisar de software extra instalado na máquina cliente.*

### *Tipo 3: Driver Nativo*

*Traduz a chamada JDBC para um [protocolo](https://pt.wikipedia.org/wiki/Protocolo) de rede independente do banco de dados utilizado, que é traduzido para o protocolo do banco de dados por um servidor. Por utilizar um protocolo independente, pode conectar as aplicações clientes Java a vários bancos de dados diferentes. É o modelo mais flexível e pode ser visto como um driver intermediário, pois também atua como [Middleware](https://pt.wikipedia.org/wiki/Middleware_(programação)). É mais utilizado para banco de dados antigos como estatais de governos.*

### *Tipo 4: Driver de Protocolo de Rede*

*Converte as chamadas JDBC diretamente no protocolo do banco de dados utilizado. Implementado em Java, normalmente é independente de plataforma e escrito pelos próprios desenvolvedores. É o tipo mais recomendado para ser usado.*

###### Fonte: Alura, Wikipedia



O que é ORM? Cite 3 Exemplos:



**ORM  - Object-Relational Mapping**

Em português, Mapeamento Objeto-Relacional, é uma técnica para aproximar o paradigma de desenvolvimento de aplicações orientadas a objetos ao paradigma do banco de dados relacional. O uso da técnica de mapeamento objeto-relacional é realizado através de um mapeador objeto-relacional que geralmente é a Biblioteca ou Framework que ajuda no mapeamento e uso do banco de dados.

Consiste em fazer uma relação dos objetos com os dados que os mesmos representam,é a representação de uma tabela de um banco de dados relacional através de classes Java.

Independente da linguagem de programação que o ORM é implementado, geralmente ele segue um padrão bem definido. Existem dois padrões que são amplamente utilizados:

* Data Mapper

* Active Record 



3 Exemplos de ORM's são:

**Para Java**

* Hibernate
* Active JPA

**Para C#**

* Entity Framework



### O que é JPA?

**Java Persistence API**  - JPA, é uma API (Application Programming Interface) padrão da linguagem Java que descreve uma interface comum para frameworks de persistência de dados. A JPA  define um meio de mapeamento objeto-relacional para objetos Java simples e comuns (POJO - *Plain Old Java Objects* ), denominados *beans* de entidades.

A JPA é uma especificação oficial que descreve como deve ser o comportamento dos frameworks de persistência Java que desejarem implementa-lá.

Ser uma especificação significa que a JPA não possui código que possa ser executado.

Por analogia, você pode pensar na especificação JPA como uma interface que possui algumas assinaturas, mas que precisa que alguém a implemente.

Apesar de não ter nada executável, a especificação possui algumas classes, interfaces e anotações que ajudam o desenvolvedor a abstrair o código.

São artefatos do pacote *javax.persistence* que ajudam a manter o código independente das implementações da especificação.

Assim não precisamos importar classes de terceiros em nosso código.

Implementação é quem dá vida para a especificação. É o código que podemos executar, que chamamos de framework.

Enfim, para persistir dados com JPA, é preciso escolher uma implementação que é quem, de fato, vai fazer todo o trabalho.

A grande ideia da especificação JPA é que a aplicação possa trocar de implementação sem que precise de mudanças no código. Apenas um pouco de configuração.

###### Fonte: [Tutorial definitivo: Tudo o que você precisa para começar bem com JPA (algaworks.com)](https://blog.algaworks.com/tutorial-jpa/)



 ### Qual é a sua relação com os ORM’s?

**JPA** é uma especificação ,ORM é a Técnica/Conceito e algumas ferramentas que atendem ao conceito para uso com a especificação JPA são: (Hibernate, Entity, etc).

No contexto das aplicações Java, para facilitar o processo de transformação dos dados que trafegam entre as aplicações e os bancos de dados, podemos utilizar algumas ferramentas de persistência como o **Hibernate** ou o **EclipseLink**.

Essas ferramentas funcionam como intermediários entre as aplicações e os bancos de dados, automatizando diversos processos importantes relacionados à persistência dos dados. Elas são chamadas de ferramentas **ORM (Object Relational Mapping)**.

Com o intuito de facilitar a utilização dessas ferramentas e torná-las compatíveis com os outros recursos da plataforma Java, elas são padronizadas pela especificação **Java Persistence API (JPA)**.

###### Fonte: Stackoverflow



### O que é SpringData?



O SpringData é um projeto da SpringSource com proposta de unificar e facilitar o acesso a diferentes tecnologias de armazenamento de dados, como bancos de dados relacionais e os NoSQL.

Independente da solução de armazenamento, as classes de "repositório"( Também conhecidas como Data Access Obejcts ou DAOs) normalmente disponibilizam operações CRUD ( Create-Read-Update-Delete) para um determinado objeto de dominio, além de métodos de pesquisa e funcionalidades de ordenação e paginação. O SprindData disponibiliza interfaces genéricas para esses aspectos ( CrudRepository e PagingAndRepository), além de implementações especificas para cada banco de dados.

Abaixo, segue uma visão geral da arquitetura do Spring Data.

<img src="https://imgopt.infoq.com/fit-in/1200x2400/filters:quality(80)/filters:no_upscale()/articles/spring-data-intro/pt/resources/101.jpg" alt="img"  />

Como dito anteriormente o Spring Data é um projeto Open Source que engloba outros projetos.

Alguns destes outros projetos são:

* Spring Data Commons
* Spring Data Gemfire
* Spring Data JPA
* Spring Data LDAP
* Sping Data MongoDB
* Spring Data REST



### O que caracteriza um projeto “CRUD básico”? 

Um CRUD ( Create, Read, Update e Delet), consite nas 4 operações básicas que uma aplicação faz a um banco de dados relacional.

Pode - se criar projetos como sistema de cadastro, onde se faz necessário o uso de tais operações.



### Teste

