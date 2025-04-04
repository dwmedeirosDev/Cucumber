# Feature: Comprar pasagem
#     Escolher e comprar passagens aereas
#     Scnenaio: Comprar com sucesso

# language: pt
Funcionalidade: Comprar Passagem
    Escolher e comprar passagens aereas

  Cenario: Comprar com sucesso
    Dado que acesso o site "https://blazedemo.com/"
    Quando seleciono a origem "São Paolo" e destino "Cairo"
    E clico no botao Find Flights
    Entao visualiza a lista de voos

  Esquema do Cenario: Comprar com sucesso - Data Driven
    Dado que acesso o site "https://blazedemo.com/"
    Quando seleciono a <origem> e <destino>
    E clico no botao Find Flights
    Entao visualiza a lista de voos

    Exemplos:
      | origem      | destino  |
      | "São Paolo" | "Cairo"  |
      | "Boston"    | "London" |

# Testes

  Esquema do Cenario: Login positivo
    Dado que acesso a pagina de login
    Quando preencho o <email> e <senha> corretos
    E clico no botao login
    Então exibe a mensagem de login com sucesso

    Exemplos:
      | email                | senha       |
      | cliente@iterasys.com | iterasys123 |

  Esquema do Cenario: Login negativo
    Dado que acesso a pagina de login
    Quando preencho o <email> e <senha> incorretos
    E clico no botao login
    Então exibe a mensagem de email ou senha incorretos
      | email                    | senha       |
      | cliente@iterasys.com     | iterasys321 |
      | clienteinco@iterasys.com | iterasys123 |
      | clienteinco@iterasys.com | iterasys321 |

###

# Testes (Todos)

  Esquema do Cenario: Login positivo
    Dado que acesso a pagina de login
    Quando preencho o <email> e <senha> corretos
    E clico no botao login
    Então exibe a mensagem de login com sucesso

    Exemplos:
      | email                | senha       |
      | cliente@iterasys.com | iterasys123 |

  Esquema do Cenario: Login negativo
    Dado que acesso a pagina de login
    Quando preencho o <email> e <senha> incorretos
    E clico no botao login
    Então exibe a <mensagem>
      | email                    | senha       | tipo | mensagem                     |
      | cliente@iterasys.com     | iterasys123 | P    | #1 Login com sucesso         |
      | cliente@iterasys.com     | iterasys321 | N    | #2 Email ou senha incorretos |
      | clienteinco@iterasys.com | iterasys123 | N    | #3 Email ou senha incorretos |
      | clienteinco@iterasys.com | iterasys321 | N    | #4 Email ou senha incorretos |