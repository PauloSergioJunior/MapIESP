# Métodos Avançados de Programação

## UNIESP Faculdades

### Professora

* Drª Alana Morais ([alanamm.prof@gmail.com](mailto:alanamm.prof@gmail.com))

### Aluno
* Paulo Sergio de Oliveira Santos Junior [paulo.sergio0@outlook.com](mailto:paulo.sergio0@outlook.com)


### Padrão Comportamental: 
> O observer é um padrão de projeto comportamental que define uma dependência um-para-muitos entre objetos, de maneira que quando um objeto muda de estado todos os seus dependentes são notificados e atualizados automaticamente.


## Padrão Observer

### Problema: 
> Usando como base o site da google, o classroom, existe um mural o qual alunos e professores postam assuntos de aulas, exercícios, temas para debates e etc. Essas postagem precisam ser vistas o mais rápido e para isso acontecer o aluno precisa entrar no site e verificar se há algo novo no mural da turma.  

> Portanto os alunos não tem uma notificação dos posts no mural. Abstraindo isso para a linguagem de programação, o objeto a qual as classes observadoras precisam saber o que está acontecendo de novo a ela, e a mesma precisa lançar essas informações para que as classes recebam atualizações dos posts.  


### Solução: 

> Como solução o padrão Observer sugere que você adicione um mecanismo de assinatura (Lista) para a classe mural, para que objetos individuais possam assinar ou desassinar uma corrente de eventos vindo do mural. Esse mecanismo consiste em um vetor para armazenar uma lista de referências aos objetos aluno e professor e alguns métodos públicos que permitem adicionar assinantes e removê-los da lista.

> Com isso os alunos e professores estaram em uma lista esperando que algo de novo aconteça ao objeto mural. Se ouver alterações o método de notificação é desparado, percorrendo toda a sua lista e notificando todos os usuários contidos nela. 

> Portanto os objetos não sabem do estado um do outro, como o que foi alterado ou o que acontece um com o outro.


### Consequências: 

* Permite variar subjects e observadores de forma independente. Você pode reutilizar subjects sem reutilizar seus observadores e vice-versa. Ele permite acrescentar observadores sem modificar o subject ou outros observadores.
* Possibilita baixo acoplamento entre os objetos dependentes (os observers) e o assunto.
* Acoplamento abstrato.
* Facilidade em adicionar novas classes sem que outras sejam afetadas.
* Dificuldade em saber o que foi mudado.
    
    
    



### Exemplo: 
[Observer-Pattern.png](Observer-Pattern.png)

[Source files](src)


