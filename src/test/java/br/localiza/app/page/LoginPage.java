package br.localiza.app.page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.localiza.app.runners.DriverFactory;

public class LoginPage {
	
	@Rule
	public static TestName testName = new TestName();

	public void with(String matricula, String senha) {
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botao_configuracoes").click();

		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout")
				.click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_senha").sendKeys("111");

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/btn_continuar").click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_patrimonio").sendKeys("teste");

		
	}

	public static void gerarScreenShot() {

		try {
			File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("surefire-reports" + testName.getMethodName() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
