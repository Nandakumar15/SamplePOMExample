package testcases;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.LoginPageObjectWithFindBy;

public class LoginTestcaseUsingPageFactory {


	@Test
	public static void LogintoApplication() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, LoginPageObjectWithFindBy.class);
		
		LoginPageObjectWithFindBy.userName.sendKeys("Admin");
		
		LoginPageObjectWithFindBy.password.sendKeys("admin123");
		
		LoginPageObjectWithFindBy.loginButton.click();
	
		driver.quit();
	}



}
