package br.localiza.app.steps;

import br.localiza.app.page.LoginPage;
import io.cucumber.java.en.Given;

public class AbastercerSteps {

	
	private LoginPage login = new LoginPage();
	



	
	@Given("que realizo a pesquisar de uma placa {string}")
	public void queRealizoAPesquisarDeUmaPlaca(String placapesquisa) {
		
	    login.with("110508", "3487");
	    login.gerarScreenShot();
		
	}
	
	
}
