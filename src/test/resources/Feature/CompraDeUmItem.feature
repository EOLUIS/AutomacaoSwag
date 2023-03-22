
@Alll
Feature: Testando Funcionalidades

  @ST1
  Scenario: Fazendo uma compra de um item com standard_user
Given que o usuário acesse a url "https://www.saucedemo.com/"
And ele ira escrever o usuario: standard_user
And ele ira colocar a senha: secret_sauce
And ele ira tocar no botao de Login
When ele ira adicionar um item ao carrinho
And ele ira tocar no icone do carrinho
And ira tocar no botão Chaeckout
When preencher o formulario de com dados validos
And tocar em continuar
And validar as informacoes do preco total
And tocar em Finish
Then sera exibido o texto Thank you for your order!

 @ST2
 Scenario: Fazendo uma compra de um item com problem_user
Given que o usuário acesse a url "https://www.saucedemo.com/"
And ele ira escrever o usuario: problem_user
And ele ira colocar a senha: secret_sauce
And ele ira tocar no botao de Login
When ele ira adicionar um item ao carrinho
And ele ira tocar no icone do carrinho
And ira tocar no botão Chaeckout
When preencher o formulario de com dados validos
And tocar em continuar
And validar as informacoes do preco total
And tocar em Finish
Then sera exibido o texto Thank you for your order!
 
@ST3
 Scenario: Fazendo uma compra de um item com standard_user
Given que o usuário acesse a url "https://www.saucedemo.com/"
And ele ira escrever o usuario: problem_user
And ele ira colocar a senha: secret_sauce
And ele ira tocar no botao de Login
When ele nao vai adicionar um item ao carrinho
And ele ira tocar no icone do carrinho
And ira tocar no botão Chaeckout
When preencher o formulario de com dados validos
And tocar em continuar
And validar as informacoes do preco total
And tocar em Finish
Then sera exibido o texto Thank you for your order!
 