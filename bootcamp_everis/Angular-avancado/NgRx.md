# NgRx

## Reducer: 
- o reducer é quem definirá a forma como será armazenado o estado dentro da store.
- Dentro dele deve ser definido uma interface que é o que vai definir como será salvo a informação dentro da store, um estado inicial (que vai definir o primeiro valor que deve ser inserido dentro da store), uma constante com a criação do reducer em sí(recebe o estado inicial e o que o reducer deve fazer quando receber um valor) e uma função que exporta o reducer para a aplicação ( que possui como parâmetros um state e uma action)

## Actions: 
- A action deve ser exportada por uma constante e criada com a função createAction(), que recebe como parâmetros um nome com o contexto entre chaves e uma breve explicação e props com o objeto que deve ser salvo na store: '[Contexto] faz a ação', props<{propriedades: Propriedades}>()
- A ação deve ser despachada de dentro do componente, onde deve ser importada a store dentro do construtor e depois passada dentro da função com o argumento .dispatch passando dentro dele qual arquivo de action e qual os valores que devem ser enviados pela action para a store.
## Effects:
- Deve receber um injectable como todo serviço
- Recebe um observable do tipo Actions no construtor.
- Um Effect pode ou não retornar uma action.
- Effects usam fluxos de dasdos para rpover novas fontes de ações e reduzir o estado baseado em interações externas, por exemplo, requisições HTTP, mensagens de websockets e eventos baseados em tempo.

