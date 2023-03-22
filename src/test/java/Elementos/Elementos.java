package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By campoNome = By.id("user-name");
	private By campoSenha = By.id("password");
	private By btLogin = By.id("login-button");
	private By btAddtocart = By.id("add-to-cart-sauce-labs-backpack");
	private By btCarrinho = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	private By btCheckout = By.name("checkout");
	private By campoPriNome = By.id("first-name");
	private By campoSegNome = By.id("last-name");
	private By campoCep = By.id("postal-code");
	private By btContinue = By.id("continue");
	private By confirmacaoDePreco = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]");
	private By btFinish = By.id("finish");
	private By validarTxtFinal = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

	public By getBtContinue() {
		return btContinue;
	}

	public By getBtFinish() {
		return btFinish;
	}

	public By getValidarTxtFinal() {
		return validarTxtFinal;
	}

	public By getConfirmacaoDePreco() {
		return confirmacaoDePreco;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public void setCampoNome(By campoNome) {
		this.campoNome = campoNome;
	}

	public By getCampoSenha() {
		return campoSenha;
	}

	public void setCampoSenha(By campoSenha) {
		this.campoSenha = campoSenha;
	}

	public By getBtLogin() {
		return btLogin;
	}

	public void setBtLogin(By btLogin) {
		this.btLogin = btLogin;
	}

	public By getBtAddtocart() {
		return btAddtocart;
	}

	public void setBtAddtocart(By btAddtocart) {
		this.btAddtocart = btAddtocart;
	}

	public By getBtCarrinho() {
		return btCarrinho;
	}

	public void setBtCarrinho(By btCarrinho) {
		this.btCarrinho = btCarrinho;
	}

	public By getBtCheckout() {
		return btCheckout;
	}

	public void setBtCheckout(By btCheckout) {
		this.btCheckout = btCheckout;
	}

	public By getCampoPriNome() {
		return campoPriNome;
	}

	public void setCampoPriNome(By campoPriNome) {
		this.campoPriNome = campoPriNome;
	}

	public By getCampoSegNome() {
		return campoSegNome;
	}

	public void setCampoSegNome(By campoSegNome) {
		this.campoSegNome = campoSegNome;
	}

	public By getCampoCep() {
		return campoCep;
	}

	public void setCampoCep(By campoCep) {
		this.campoCep = campoCep;
	}

	public By getCampoContinue() {
		return btContinue;
	}

	public void setCampoContinue(By btContinue) {
		this.btContinue = btContinue;
	}

}
