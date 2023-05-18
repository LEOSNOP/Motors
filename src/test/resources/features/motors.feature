#language: pt


Funcionalidade: testar a busca

  como usuario na pagina da webMotor
  quero fazer uma pesquisa por um produto
  e validar o retorno dessa busca



  @tp1
  Esquema do Cenário: busca por marca
  Dado que o usuario acessa a pagina da webMotors
  Quando o usuario faz a busca por <marca_carro>
  Entao verifica o resultado da busca pela marca

    Exemplos: lista de marcas
      |marca_carro|
      |"Honda"	|
      |"Ford"		|
      |"Toyota"	|

  @tp2
  Esquema do Cenário: Cenario: busca por Modelo
  Dado que o usuario acessa a pagina da webMotors
  Quando o usuario faz a busca por <modelo_carro>
  Entao verifica o resultado da busca pelo modelo

    Exemplos: lista de modelos
      |modelo_carro	 |
      |"Honda City"	 |
      |"Toyota Supra"	|
      |"Porche 911"	 |

  @tp3
  Esquema do Cenário: Cenario: Busca por versão
  Dado que o usuario acessa a pagina da webMotors
  Quando o usuario faz a busca por <versao_carro>
  Entao verifica o resultado da busca pela versao

    Exemplos: lista de versoes
      |versao_carro  	 |
      |"Toyota Corolla"|
      |"Honda Civic"   |
      |"BMW 116I"	   	 |

  @tp4
  Esquema do Cenário: Cenario: busca vazia
  Dado que o usuario acessa a pagina da webMotors
  Quando o usuario faz busca <vazio>
  Entao o sistema permanece na pagina

    Exemplos:
      |vazio|
      |" "  |