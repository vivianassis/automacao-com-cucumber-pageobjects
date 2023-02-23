# language: pt
Funcionalidade: Login

  Contexto:
    Dado que estou na página de login

  Cenario: Login válido
    Quando realizo login com dados válidos
    Então valido que acesso a Homepage

  Esquema do Cenário: Mensagens de erro no Login
    Quando insiro dados e realizo login: <login> e <senha>
    Então valido <mensagem_de_erro> esperada
    Exemplos:
      | login             | senha          | mensagem_de_erro                                                                   |
      | ""                | "secret_sauce" | "Epic sadface: Username is required"                                        |
      | "standard_user"   | ""             | "Epic sadface: Password is required"                                        |
      | "locked_out_user" | "secret_sauce" | "Epic sadface: Sorry, this user has been locked out."                       |
      | "ABC"             | "123"          | "Epic sadface: Username and password do not match any user in this service" |

#O erro tinha ocorrido na nomenclatura do arquivo da feature (".Feature" ao invés de ".feature")

  #Ao rodar a funcionalidade, temos os passos que foram inseridos no stepdefinitions > LoginSteps

#Na próxima iremos concluir a criação de steps e disponibilizar o projeto completo \obrigada!