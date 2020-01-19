# language:pt

Funcionalidade: Aprender Cucumber

Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação

Cenário: Deve executar especificação

  Dado que criei o arquivo corretamente
  Quando executá-lo
  Então a especificação deve finalizar com sucesso

Cenario: Deve incrementar contador

  Dado que o valor do contador é 15
  Quando eu incrementar em 3
  Entao o valor do contador será 18

  Dado que o valor do contador é 30
  Quando eu incrementar em 10
  Entao o valor do contador será 40