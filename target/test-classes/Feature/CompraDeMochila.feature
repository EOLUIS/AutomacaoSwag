
@tag
Feature: Compra de uma mochila

  @tag1
  Scenario: Compra de uma mochila Sauce Labs Backpack
Given que o usuário acesse a url "https://www.saucedemo.com/"
And ele ira escrever um usuario valido
And ele ira colocar a senha
And ele ira tocar no botao de Login
And selecionar o botão Add to cart do Sauce Labs Backpack
And tocar no carrinho 
And tocar no botão Chaeckout
When preencher o formulario de dados
And tocar em continuar
And validar as informacoes do preco total
And tocar em Finish
Then sera exibido o texto Thank you for your order!
