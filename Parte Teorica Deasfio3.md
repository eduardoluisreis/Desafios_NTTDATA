***O QUE É E COMO FUNCIONA O PROTOCOLO DE COMUNICAÇÃO HTTP.***

 

O HTTP é um protocolo de comunicação de transferência, utilizado para sistemas de informação de hipermídia, distribuídos e colaborativo.

HTTP significa, Hipertext Transfer Protocol (Protocolo de Transferência de Hipertexto).

Ele é a base da comunicação de dados na internet.

Hipertexto é o texto estruturado que utiliza ligações entre nós contendo texto.

HTTP é um protocolo baseado em texto sem conexão. Isso significa que as pessoas que acessam o site da sua empresa enviam solicitações a servidores que as exibem na forma do seu site em formato de texto, imagens, e outros tipos de mídia. Depois que a solicitação é atendida por um servidor, a conexão entre o usuário e o servidor é desconectada.

Uma nova conexão deve ser feita para cada solicitação, isto é, cada vez que alguém acessa o seu site. Em suma, quando alguém digita a URL do seu site em um navegador, é isto que acontece:

\1.    se a URL pertencer a um domínio próprio, o navegador primeiro se conecta a um servidor e recuperará o endereço IP correspondente ao servidor;

\2.    o navegador se conecta ao servidor e envia uma solicitação HTTP para a página da web desejada (que, neste exemplo, é o seu site);

\3.    o servidor recebe a solicitação e verifica a página desejada. Se a página existir, o servidor a mostrará. Se o servidor não conseguir encontrar a página solicitada, ele enviará uma mensagem de erro HTTP 404, ou seja, página não encontrada;

\4.    o navegador, então, recebe a página de volta e a conexão é fechada;

\5.    caso a página exista (e é isso que se espera), o navegador a analisa e procura outros elementos necessários para concluir a sua exibição, o que inclui seus textos, imagens e afins;

\6.    para cada um desses elementos, o navegador faz conexões adicionais e solicitações HTTP para o servidor para cada elemento;

\7.    quando o navegador terminar de carregar todos os elementos, a página será carregada na janela do navegador.

 

 

**O que é REST, e qual é a sua relação com o protocolo HTTP**

 

**Rest API** é o conjunto de boas práticas utilizadas nas requisições HTTP realizadas por uma **API** em uma aplicação web.

**Rest**, que é a abreviatura de Representational State Transfer, é um conjunto de restrições utilizadas para que as requisições HTTP atendam as diretrizes definidas na arquitetura. Basicamente, as restrições determinadas pela arquitetura Rest são:

- cliente-servidor: as     aplicações existentes no servidor e no cliente devem ser separadas;
- sem estado: as requisições     são feitas de forma independente, ou seja, cada uma executa apenas uma     determinada ação;
- cache: a API deve utilizar     o cache para evitar chamadas recorrentes ao servidor;
- interface uniforme: agrupa     outros quatro conceitos em que determina que os recursos devem ser     identificados, a manipulação dos recursos deve ser por meio de     representação, com mensagens autodescritivas e utilizar links para navegar     pelo aplicativo.

Portanto, quando se fala em Rest API, significa utilizar uma API para acessar aplicações back-end, de modo que essa comunicação seja feita com os padrões definidos pelo estilo de arquitetura Rest.

REST e RESTful são a mesma coisa, ambos representando os mesmos princípios, existe apenas uma diferença gramatical. Sistemas que utilizam REST são chamados de RESTful.

REST: Conjunto de princípios de arquitetura.

RESTful: Capacidade de determinado sistema aplicar os princípios de REST.

 

 [**API**](https://rockcontent.com/o-que-e-api/) — Application Programming Interface. Trata-se de um conjunto de requisições que permite a comunicação de dados entre aplicações. Para isso, a API utiliza requisições [HTTP](https://rockcontent.com/br/blog/http/) responsáveis pelas operações básicas necessárias para a manipulação dos dados. É um conjunto de regras que permite que diferentes programas se comuniquem. Ele descreve a maneira apropriada de um desenvolvedor de software compor um programa em um servidor que se comunica com vários aplicativos clientes.

**Liste todos os métodos de solicitações HTTP utilizados pelo padrão REST e suas respectivas finalidades**

 

 As principais requisições são:

- POST: criar dados no servidor;
- GET: leitura de dados     no [host](https://rockcontent.com/br/blog/host/);
- DELETE: excluir as     informações;
- PUT: atualizações dos     registros;
- PATCH: altera parte dos     dados.

 

**O que é Web API, e qual é a sua relação com REST**

 

Web API é um framework para construir serviços HTTP sobre o Framework [.Net ](https://www.devmedia.com.br/curso/curso-de-introducao-ao-net-framework/373)É uma Interface de Programação de Aplicações tanto para um servidor quanto um navegador. É utilizada para se conseguir recuperar somente o valor necessitado num banco de dados.

**O que é Swagger?**

Swagger é uma linguagem de descrição de interface para descrever APIs RESTful usando JSON. O Swagger é usado junto com um conjunto de ferramentas de software de código aberto que auxilia os desenvolvedores a projetar, construir, documentar e usar serviços da Web RESTful.

 