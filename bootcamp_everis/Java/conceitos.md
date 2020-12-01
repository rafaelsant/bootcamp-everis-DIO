## O que é java:
Linguagem criada em 95 pela sun microsystems,o java é compilado para um bytecode e interpretado por uma maquina virtual
## compilador:
É um programa que transforma um código fonte em um código objeto
bytecode: É o programa originado da compilação do java
## jvm:
Máquina virtual do Java, simula uma máquina física e consegue executar vários programas, gerenciar processos, memórias e arquivos.Ela lê o bytecode compilado do java
## jre:
Java Runtime Enviroment, ambiente de Execução do Java, composto pela JVM, bibliotecas e APIs da linguágem Java e outros componentes de suporte. Representa a parte responsável pela execução do software Java.
## jdk:
Kit de Desenvolvimento Java, é um conjunto de utilitários que permitem criar software para a plataforma Java. Composto pelo javac (compilador), bibliotecas, ferramentas e o JRE
## Java SE: 
é a distribuição mínima da plataforma de desenvolvimento de aplicações Java. OpenJDK é a implementação de referência opensource da plataforma Java, Java SE, que ainda é mantida pela Oracle.
## Java EE (Enterprise Edition): 
É uma extensão do JavaSE que possui suporte a desenvolvimento de sistemas corporativos. Além do mínimo da plataforma, o JavaEE possui diversas especificações de partes de infra-estrutura de aplicações, como acesso à banco de dados, mensageria, serviços Web, parser de arquivos e outras.
Servidores de aplicações Java EE, sabem seguir essas especificações e implementar os recursos para os usuários.
## Jakarta EE: 
Com a falta de investimentos da Oracle no Java, ela cedeu todo o código, implementações e especificações do Java EE para a Eclipse Foundation, mas como o nomo Java EE é uma marca registrada da Oracle, foi escolhido o nome Jakarta EE.
Agora a evolução das especificações e padrões do Java será feiro sob o nome Jakarta EE e com compatibilidade com o Java EE.

## Tipos primitivos, wrappers, não primitivos e tipagem forte e estática
### Byte:
	Pode receber valores de até 8 bits, ou seja, inteiros de -128 até 127.
### Char:
	Pode receber até 16 bits e somente um caractere alfanumérico por vez.
### Short:
	Pode receber até 16 bits também, mas não caracteres alfanuméricos como o char.
### Int:
	Pode receber até 32 bits de números inteiros, variando de -2147483648 á 2147483647.
### Long:
	Pode receber até 64 bits, é necessário colocar um L no final do número.
### Float:
	Recebe números de ponto flutuante, possui 32 bits, é necessário colocar um f no final do número.
### double:
	Recebe números de ponto flutuante, possui 64 bits.
### Boolean:
	Recebe true ou false.
### Void:
	Void não é um tipo, ela indica que a função não retorna nada.
## Valores Default:

|Data Type	|	Default Value (for fields)	|
|--------------|--------------------------------------|
|byte	  	|	0				|
|short		|	0				|
|int		|	0				|
|long		|	0L				|
|float		|	0.0f				|
|double	|	0.0d				|
|char		|	'\u0000'			|
|String 	|  	null				|
|boolean	|	false				|

## Wrappers:
São Objetos que representam os primitivos.
* Autoboxing: Geralmente possuem os mesmos nomes dos tipos de variáveis, mas iniciam com a letra maiúscula.
* Unboxing: É construido como uma classe java, mas o seu valor pode ser atribuído à uma variável.
## Não primitivos:
* String
* Number
* Object
* Qualquer outros objetos
## Tipagem:
* Forte e estática.
* var -Inferência de tipo
## Modificadores de acesso:
* public: Pode ser acessado de qualquer lugar por qualquer entidade que possa visualizar a classe a que ela pertence.
* private: Os métodos e atributos da classe definido como privados não podem ser acessados ou usados por nenhuma outra classe. Esses atributos e métodos também não podem ser visualizados pelas classes herdadads.
* protected: Torna o membro acessível às classes do mesmo pacote ou através de herança, seus membros herdados não são acessíveis à outras classes fora do pacote em qua foram declaradas.
* default: A classe e/ou seus membros são acessíveis à classes do mesmo pacote, na sua declaração não é definido nenhum tipo de modificador, sendo este identificado pelo compilador. 
* abstract: Esse modificador não é aplicado nas variáveis, apenas em classes e métodos. Uma classe abstrata não pode ser instanciada. Se houver alguma declaração de um método com abstract, a classe também deve ser marcada com abstract.
* static: É usado para a criação de uma variável que poderá ser acessada por todas as instâncias de objetos dessa classe como uma variável comum, ou seja, a variável criada será a mesma em todas as instâncias, a modificação ocorre em toas as demais. E nas declarações de métodos ajudam no acesso direto à classe, portanto não é necessário instanciar um objeto para acessar o método.
* final: Quando é aplicado na classe, não pemite estender, nos métodos impede que o mesmo seja sobrescrito, e nos valores de variáveis não pode ser alterado depois que já tenha sido atribuido um valor.
