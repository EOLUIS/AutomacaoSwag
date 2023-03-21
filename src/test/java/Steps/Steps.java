package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("que o usuário acesse a url {string}")
	public void que_o_usuário_acesse_a_url(String url) {
		m.abrirNavegador(url);

	}

	@Given("ele ira escrever um usuario valido")
	public void ele_ira_escrever_um_usuario_valido() {
		m.clicar(e.getCampoNome());
		m.preencher(e.getCampoNome(), "standard_user");

	}

	@Given("ele ira colocar a senha")
	public void ele_ira_colocar_a_senha() {
		m.clicar(e.getCampoSenha());
		m.preencher(e.getCampoSenha(), "secret_sauce");

	}

	@Given("ele ira tocar no botao de Login")
	public void ele_ira_tocar_no_botao_de_login() {
		m.clicar(e.getBtLogin());

	}

	@Given("selecionar o botão Add to cart do Sauce Labs Backpack")
	public void selecionar_o_botão_add_to_cart_do_sauce_labs_backpack() {
		m.clicar(e.getBtAddtocart());

	}

	@Given("tocar no carrinho")
	public void tocar_no_carrinho() {
		m.clicar(e.getBtCarrinho());

	}

	@Given("tocar no botão Chaeckout")
	public void tocar_no_botão_chaeckout() {
		m.clicar(e.getBtCheckout());

	}

	@When("preencher o formulario de dados")
	public void preencher_o_formulario_de_dados() {
		m.clicar(e.getCampoPriNome());
		m.preencher(e.getCampoPriNome(), "Luis");
		m.clicar(e.getCampoSegNome());
		m.preencher(e.getCampoSegNome(), "Felipe");
		m.clicar(e.getCampoCep());
		m.preencher(e.getCampoCep(), "64009-720");

	}

	@When("tocar em continuar")
	public void tocar_em_continuar() {
		m.clicar(e.getCampoContinue());

	}

	@When("validar as informacoes do preco total")
	public void validar_as_informacoes_do_preco_total() {
		m.validarTexto(e.getConfirmacaoDePreco(), "Price Total");

	}

	@When("tocar em Finish")
	public void tocar_em_finish() {
		m.clicar(e.getBtFinish());

	}

	@Then("sera exibido o texto Thank you for your order!")
	public void sera_exibido_o_texto_thank_you_for_your_order() 
			throws InterruptedException {
		m.validarTexto(e.getValidarTxtFinal(), "Thank you for your order!");
        m.pausa(5000);
        m.fecharNavegador();
        
	}

}
