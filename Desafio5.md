# Defina com suas palavras qual é a responsabilidade das camadas vistas até agora:

## Entity, Controller, Repository e Service.

<u>*As camadas Entity, Controller, Repository e Service, fazem parte do padrão de arquitetura de software MVC.*</u>

## *Entity*
É a camada que fará o Mapeamento Objeto-Relacional com o banco de dados.
Cria uma representação para adequação entre a classe Java com o padrão do banco de dados.

A anotação @Entity é utilizada para informar que uma classe também é uma entidade. A partir disso, a API JPA estabelecerá a ligação entre a entidade e uma tabela de mesmo nome no banco de dados, onde os dados de objetos desse tipo poderão ser persistidos.

Uma entidade representa, na Orientação a Objetos, uma tabela do banco de dados, e cada instância dessa entidade representa uma linha dessa tabela.

## *Controller*
Esta camada tem a função de ser intermediária entre as demais camadas. As requisições criadas pelos usuários passa por esta camada e esta por sua vez, se comunica com as demais repassando as chamadas.

## *Repository*
Nossa camada de persistência, responsavel por persistir e recuperar os dados do banco de dados.

## *Service*
Camada responsavel pela intermediação de comunicação entre a Controller e Repository. Nesta camada, contém as lógicas de negócios e validação.