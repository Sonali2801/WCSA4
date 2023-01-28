package keyWordDrivenFrameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidLogin extends BaseTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();

		Flib flib = new Flib();

		String username = flib.readPropertyData(PROP_PATH, "username");
		String password = flib.readPropertyData(PROP_PATH, "password");

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		bt.closeBrowser();

	}
}
