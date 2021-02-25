# Injeção de dependencia

- Padrão de design
- Dependências sao serviços ou objetos que uma classe precisa para executar alguma ação.
- Com DI, a classe pede a dependência de um provedor externo ao invés de instanciar manualmente.
## Injetores:
- Fonte responsável por armazenar a estrutura chave/valor dos providers
- Instancia classes e injeta a instÂncia nos componentes que pedem por ela.
- Funcionam de forma hierárquica.
## Providers:
- Determina o valor de um dado token
- Normalmente instanciando uma classe
