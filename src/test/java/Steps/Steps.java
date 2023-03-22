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

	@Given("ele ira escrever o usuario: standard_user")
	public void ele_ira_escrever_o_usuario_standard_user() {
		m.clicar(e.getCampoNome());
		m.preencher(e.getCampoNome(), "standard_user");

	}

	@Given("ele ira colocar a senha: secret_sauce")
	public void ele_ira_colocar_a_senha_secret_sauce() {
		m.clicar(e.getCampoSenha());
		m.preencher(e.getCampoSenha(), "secret_sauce");

	}

	@Given("ele ira tocar no botao de Login")
	public void ele_ira_tocar_no_botao_de_login() {
		m.clicar(e.getBtLogin());

	}

	@When("ele ira adicionar um item ao carrinho")
	public void ele_ira_adicionar_um_item_ao_carrinho() {
		m.clicar(e.getBtAddtocart());

	}

	@When("ele ira tocar no icone do carrinho")
	public void ele_ira_tocar_no_icone_do_carrinho() {
		m.clicar(e.getBtCarrinho());

	}

	@When("ira tocar no botão Chaeckout")
	public void ira_tocar_no_botão_chaeckout() {
		m.clicar(e.getBtCheckout());

	}

	@When("preencher o formulario de com dados validos")
	public void preencher_o_formulario_de_com_dados_validos() {
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
	public void sera_exibido_o_texto_thank_you_for_your_order() throws InterruptedException {
		m.validarTexto(e.getValidarTxtFinal(), "Thank you for your order!");
		m.pausa(5000);
		m.fecharNavegador();

	}

	@Given("ele ira escrever o usuario: problem_user")
	public void ele_ira_escrever_o_usuario_problem_user() {
		m.clicar(e.getCampoNome());
		m.preencher(e.getCampoNome(), "problem_user");

	}

	@When("ele nao vai adicionar um item ao carrinho")
	public void ele_nao_vai_adicionar_um_item_ao_carrinho() {
		m.clicar(e.getBtCarrinho());

	}

}
