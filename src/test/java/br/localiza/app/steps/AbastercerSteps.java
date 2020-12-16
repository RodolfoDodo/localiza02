package br.localiza.app.steps;

import br.localiza.app.page.ConfigurarPage;
import br.localiza.app.page.LoginPage;
import br.localiza.app.page.PlacaPage;
import br.localiza.app.page.Sidebar;
import io.cucumber.java.en.Given;

public class AbastercerSteps {

	private ConfigurarPage configurar = new ConfigurarPage();
	
	private LoginPage login = new LoginPage();
	
	private Sidebar sidebar = new Sidebar();
	
	private PlacaPage placa = new PlacaPage();


	
	@Given("que realizo a pesquisar de uma placa {string}")
	public void queRealizoAPesquisarDeUmaPlaca(String placapesquisa) {
		configurar.configracaoApp();
	    login.with("110508", "3487");
		sidebar.menuCombustivel();
		placa.pesquisarPlaca(placapesquisa);
		placa.btnBuscar();
	}
	
	
}
