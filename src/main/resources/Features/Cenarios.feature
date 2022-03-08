# language: pt

@AllTests
  Funcionalidade: Validacao produto para o desafio VIVO

    @CN001
    Cenario: CN001 - Validar especificacoes do produto
      Dado que tenha que acessar o site
      Quando realizar a pesquisa do SPECIAL OFFER
      Entao valido que as especificacoes do produto esta de acordo com as informacoes

    @CN002
    Cenario: CN002 - Validar alteracao de cor do produto no carrinho
      Dado que tenha que acessar o site
      Quando realizar a pesquisa do SPECIAL OFFER
      E adiciono no carrinho o produto com a cor desejada
      Entao valido que produto foi adicionado ao carrinho com a cor selecionada

    @CN003
    Cenario: CN003 - Validar pagina de checkout
      Dado que tenha que acessar o site
      Quando pesquiso o produto selecionando uma cor diferente do banco
      E altero a quantidade de comprar adicionando no carrinho
      Quando acesso a pagina check out
      Entao valido que a soma dos precos corresponde ao total apresentado na pagina de checkout

    @CN004
    Cenario: CN004 - Remover produto do carrinho de compras
      Dado que tenha que acessar o site
      Quando realizar a pesquisa do SPECIAL OFFER
      E adiciono no carrinho o produto com a cor desejada
      Entao acesso o carrinho e removo o produto
      E valido que o carrinho esta vazio
