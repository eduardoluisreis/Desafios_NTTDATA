 # Desafio_02



A programação Orientada a Objetos, é um paradigma (Modelo ou Padrão a ser seguido) no Desenvolvimento de Softwares.

De forma resumida, podemos dizer que este paradigma, assemelha-se ao modo como tratamos as coisas fora do **"Mundo Virtual"**ou seja, o **"Mundo Real"**.

As nomeclaturas usadas como: <u>Classes</u>, <u>Objetos</u>, <u>Atributos</u> e <u>Funções</u> podem representar qualquer coisa.

Diferente da programação Procedural, onde o código é lido em sequencia, na **POO** pode-se programar utilizando partes do código em diferentes posições, fazendo uso dos 4 pilares da **POO**.

1. **Herança**

   Em termos básicos, é a capacidade de um objeto ser idealizado baseado em outro, onde os atributos e/ou métodos deste,que chamaos de Objeto Pai, podem ser estendidas ou reutilizadas para o novo objeto que chamamos de Objeto Filho, que pode ainda ter junto seus próprios atributos e funções ou métodos. Por sua vez, o Objeto Pai, também pode ter herdado atributos de outro objeto.

   Fazendo um paralelo com o mundo não virtual, o filho herda diretamente do pai e indiretamente do avô e bisavô; o pai herdou de seu pai, o avô de seu filho, e assim por diante.

2. **Encapsulamento**

   É uma técnica que permite adicionar segurança à aplicação, ocultando as propriedades e funcionalidades da classe.

   Pode ser implantados por propriedades privadas, métodos chamados getters e setters, responsáveis por retornar e setar(configurar) o valor da propriedade respectivamente.Evita-se assim o acesso direto à propriedade da classe/objeto, adicionando uma outra camada de proteção.

   Assim, as propriedades não ficam visiveis, mas como seu uso foi definido, basta instanciar a classe pelo seu nome para a funcionalidade estar presente.

3. **Polimorfismo**

   No Polimorfismo, podemos ter dois objetos de classes diferentes, que possuem a mesma função implementada de maneira diferente.

   Um método possui várias formas, várias implementações diferentes em classes diferentes, mas que possuem o mesmo efeito.Ou seja, muitas formas de fazer a mesma coisa.

4. **Abstração**

   Este pode ser considerado o primeiro conceito, pois ele é o conceito de criação das **Classes** e **Objetos** . Este conceito nos orienta a construir códigos que façam relação com o **Mundo Real**.

   Ele também consiste em esconder informações desnecessarias, mostrando apenas atributos essenciais.

   

   **Vantagens da POO**

   1. Facilidade de compreensão do código
   2. Reutilização de código
   3. Criação de Softwares maiores e complexos
   4. Facilidade de Manutenção (Modificar e Manter)
   5. Segurança do codigo à bugs e ações externas

   

## Exemplificação de Cenário de Abstração:

Carro:

Abstração é processo de generalização de alguma coisa aparentemente complexa, transformando ela em algo mais simples de ser usada, no exemplo do carro o mesmo possui um motor (que é dividido em várias peças), pneus, amortecedores, disco de freio, sistema de direção, etc…, mas para dirigir um carro, acelerar, desacelerar, frear, passar marcha, fazer curvas, não é necessário que eu entenda como um motor funciona, ou qualquer uma de suas peças, toda essa parte complexa foi generalizada, abstraída, tornando-se algo mais simples.

Agora o usuário do carro se preocupará apenas com 3 pedais, sendo eles a embreagem, freio, acelerador, e um volante (que é uma abstração do sistema de direção do carro, que é bastante complexo e pode ser utilizado pelo usuário de forma simples).

## Exemplificação de Cenário de Encapsulamento

Num sistema de pagamento por cartão de crédito por exemplo, não precisamos saber toda a operação que feita de comunicação do momento em que inserimos o cartão na máquina, só precisamos digitar o valor a ser pago, inserir o cartão, inserir a senha, aguardar a confirmação e pronto.

## Exemplificação de Cenário de Polimorfismo

Utilizando o cenário de pagamentos novamente, podemos efetuar um pagamento para um estabelecimento com dinheiro em espécie, e cartão de crédito, já para outro estabelecimento, além destes dois métodos, podemos ainda efetuar pagamento por transferencia bancaria ou cartão por aproximação.

## Exemplificação de Cenário de Herança

Tenho uma caneta que escreve na cor azul, tenho uma outra caneta que herdou da primeira, escrever na cor azul, mas esta segunda, tem uma outra carga de tinta que escreve também em vermelho. Podemos dizer que foi reutilizado o codigo de criação da caneta azul para fazer outra que além de azul, escreve em vermelho.
