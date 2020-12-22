package br.localiza.app.steps;

import org.junit.Assert;

import br.localiza.app.page.LoginPage;
import br.localiza.app.page.Sidebar;

import io.cucumber.java.en.Given;

public class AbastercerSteps {

	
	private LoginPage login = new LoginPage();
	

	private Sidebar sidebar = new Sidebar();

	
	@Given("que realizo a pesquisar de uma placa {string}")
	public void queRealizoAPesquisarDeUmaPlaca(String placapesquisa) {
		
	    login.with("110508", "3487");
	   //login.tapLogin(505, 1576);
	    Assert.assertEquals("ANDRE", sidebar.usuario());
	    
		
	}
	
	
}
