package br.localiza.app.page;

import br.localiza.app.runners.DriverFactory;

public class ConfigurarPage {

	public void configracaoApp() {
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
	}
	
	
}
