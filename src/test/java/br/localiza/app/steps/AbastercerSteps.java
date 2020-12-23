package br.localiza.app.steps;

import org.junit.Assert;

import br.localiza.app.page.AbastecimentoPage;
import br.localiza.app.page.LoginPage;
import br.localiza.app.page.PlacaPage;
import br.localiza.app.page.Sidebar;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AbastercerSteps {

	private LoginPage login = new LoginPage();

	private Sidebar sidebar = new Sidebar();

	private PlacaPage placa = new PlacaPage();

	private AbastecimentoPage abastecimento = new AbastecimentoPage();

	@Given("que realizo a pesquisar de uma placa {string}")
	public void queRealizoAPesquisarDeUmaPlaca(String placapesquisar) {

		login.with("110508", "3487");
		// Assert.assertEquals("ANDRE", sidebar.usuario());
		sidebar.menuCombustivel();

		placa.pesquisarPlaca(placapesquisar);
		placa.btnBuscar();

	}

	@Given("solicito o abastecimento do veiculo")
	public void solicitoOAbastecimentoDoVeiculo() {
		abastecimento.btnVouAbastecer();
		
	}

	@Given("informo o tipo de combustivel e quantidade de litros")
	public void informoOTipoDeCombustivelEQuantidadeDeLitros() {
		abastecimento.informarTanque("8");
	}

	@When("confirmo o abastecimento")
	public void confirmoOAbastecimento() {
		abastecimento.btnConfirmarAbastecimento();
		abastecimento.confirmarAbastecimento();
	}

}
