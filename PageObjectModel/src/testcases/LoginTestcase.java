package testcases;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginTestcase {


	@Test
	public static void LogintoApplication() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		LoginPage.userName(driver).sendKeys("Admin");
		LoginPage.password(driver).sendKeys("admin123");
		LoginPage.loginButton(driver).click();
		driver.quit();
	}



}
