package br.localiza.app.page;

import br.localiza.app.runners.DriverFactory;

public class LoginPage {

	public void with(String matricula, String senha) {
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botao_configuracoes").click();

		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout")
				.click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_senha").sendKeys("111");

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/btn_continuar").click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/layout_input_patrimonio").click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_patrimonio").sendKeys("teste");

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/layout_input_agencia").click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_agencia").sendKeys("aabhz");

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/layout_configuracoes").click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botaoSalvar").click();
		
		
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_matricula").sendKeys(matricula);
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_senha").sendKeys(senha);

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botao_login").click();
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botaoPositivo").click();
	}

	public String  loginInvalido() {
		
		return DriverFactory.getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]").getText();
		 
	}
	
	public void loginSemMatricula(String senha) {
		
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_senha").sendKeys(senha);
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botao_login").click();
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_matricula").click();
	}
	
	public void loginSemSenha(String matricula) {
		
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_matricula").sendKeys(matricula);
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botao_login").click();
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_matricula").click();
	}
}
