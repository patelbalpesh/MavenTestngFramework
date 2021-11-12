package test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import base.TestBase;
import pages.HomePage;

public class Switchbetweentab extends TestBase {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {	  
	  switchtab();
  }  
  public void switchtab() throws InterruptedException {
	  logger.info("Inside My Test");
	  Thread.sleep(20000);
	  logger.info("Inside My Test 1 ");
	  HomePage Objaos = new HomePage(getDriver());
	 // public String strValidation ="FOLLOW US";
	  
	  logger.info("Getting window handler");
	  
	 String oldTab = getDriver().getWindowHandle();
	// n = Keys.chord(Keys.CONTROL,Keys.ENTER);
	// getDriver().findElement(By.id("open-tab")).sendKeys(n);
	 
	 String n = Keys.chord(Keys.CONTROL, Keys.ENTER);
	 
	 logger.info("Window handler " + oldTab );
	 
	 logger.info("Open tab 2 using CTRL + t keys." );
	//  //Open tab 2 using CTRL + t keys.
	  getDriver().findElement(By.xpath("/html/body/header/nav/div/a")).sendKeys(n);
	// Thread.sleep(20000);
	  logger.info("Getting new window handler" );
	  ArrayList<String> w = new ArrayList<String>(getDriver().getWindowHandles());
	  Thread.sleep(8000);
	  logger.info("Switching to new window handler" );
	  getDriver().switchTo().window(w.get(1));
	  Thread.sleep(8000);
	  getDriver().switchTo().window(w.get(0));
	  Thread.sleep(8000);
	  
  }
  
  
  
  
  
  
}
