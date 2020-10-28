### currying
Tecnica de transformar uma função de n parametros em uma função com apenas um parametro criando novas funçoes
### Hoisting
A engine do Javascript trata todas as variáveis declaradas com var como se fossem declaradas no topo do escopo de uma função (se colocadas dentro de uma), ou no topo do escopo global (se declaradas fora de uma função), independentemente de onde a declaração real ocorrer. Isso essencialmente é “hoisting”.
Então, variáveis podem realmente estar disponíveis antes de sua declaração.
Essa syntax é similar a var, apenas troque var por let para declarar uma variável para que seu escopo fique apenas naquele bloco.
Coloque a declaração do seu let no topo do bloco para que ele esteja disponível para o bloco inteiro.
Observação: Se um identificador já foi definido dentro do escopo com var, usando o mesmo identificador como let dentro desse escopo lançará um erro. Além disso, nenhum erro será mostrado se uma declaração letcriar uma variável com o mesmo nome de uma variável em seu escopo externo. (Este caso é o mesmo ao usar const).
Toda const é tratada como constantes, e, portanto, ela não pode ter seu valore reatribuído após ser definida. Devido a isto, toda constdeve ser inicializada no momento da declaração.
### Imutabilidade
Um objeto após ser declarado não pode ser mudado, é necessário criar uma nova função para retornar o novo valor esperado.