package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;

public class Google extends TestBase{
	@Test
	@Parameters({"username", "password"})
	public void test(@Optional("ABC") String username,@Optional("ABC")String password) throws InterruptedException {	
		logger.info("Value of username parameter is " + username);
		logger.info("Value of password parameter is " + password);
		getDriver().navigate().to("https://www.google.com/");
		System.out.println("Browser title is " + getDriver().getTitle());
		WebElement element = getDriver().findElement(By.name("q"));
		element.sendKeys("Selenium WebDriver"); 
		element.submit();
		Thread.sleep(5000);			
	}	
}