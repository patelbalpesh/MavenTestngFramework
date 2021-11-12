
package test;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddtocartPage;
import pages.CategoryPage;
import pages.HeadphonePage;
import pages.HomePage;
import pages.PaymentPage;
import utils.Reporter;

public class SampleTest extends TestBase{		
	public boolean blnStatus;	
	
	@Test	
	public void mytest() throws Throwable {	 
		logger.info("Inside My Test");		
		HomePage Objaos = new HomePage(getDriver());		
		blnStatus=Objaos.fn_UserMenuClick();
		try {
			Assert.assertTrue( blnStatus, "Unable to to click on MenuUser");			
			Reporter.ReportEvent("Click on UserMenu", "User should be able to click on UserMenu", "User successfully clicked on UserMenu", "PASS");
		}
		catch(Throwable e) {			
			Reporter.ReportEvent("Click on UserMenu", "User should be able to click on UserMenu", "Unable to to click on MenuUser", "FAIL");
			throw new RuntimeException("Unable to to click on MenuUser");			
		}
				
		blnStatus = Objaos.fn_UserLogin();
		try {
			Assert.assertTrue( blnStatus, "User not able to logged into AOS Signin failed");			
			Reporter.ReportEvent("Login into AOS","User should be able to Login into AOS","User successfully logged into AOS","PASS");
		}
		catch(Throwable e) {			
			Reporter.ReportEvent("Login into AOS","User should be able to Login into AOS","User not able to log into AOS, Signin failed","FAIL");
			throw new RuntimeException("User not able to logged into AOS, Signin failed");			
		}
		
		CategoryPage ObjCategoryPage	= new CategoryPage(getDriver());		
		blnStatus = ObjCategoryPage.fn_Validation();
		try {
			Assert.assertTrue( blnStatus, "Unable to pass validation string FOLLOW US");
			logger.info("validation passed found string FOLLOW US");
		}
		catch(Throwable e) {
			logger.info("validation failed on FOLLOW US");	
			throw new RuntimeException("Unable to validation string FOLLOW US");			
		}
		
		blnStatus= ObjCategoryPage.fn_HeadPhoneCat();
		try {
			Assert.assertTrue( blnStatus, "Unable select HeadPhone Category");			
			Reporter.ReportEvent("Select HeadPhone Category", "User should be able to select headphone category", "User selected headphone category", "PASS");
		}
		catch(Throwable e) {			
			Reporter.ReportEvent("Select HeadPhone Category", "User should be able to select headphone category", "User unable to select headphone category", "FAIL");
			throw new RuntimeException("Unable to select headphone category");			
		}
		HeadphonePage ObjHeadphonePage	= new HeadphonePage(getDriver());
		blnStatus = ObjHeadphonePage.fn_Validation();
		try {
			Assert.assertTrue( blnStatus, "Unable to pass validation string FOLLOW US");
			logger.info("validation passed found string FOLLOW US");
		}
		catch(Throwable e) {
			logger.info("validation failed on FOLLOW US");	
			throw new RuntimeException("Unable to validation string FOLLOW US");			
		}
		
		blnStatus = ObjHeadphonePage.fn_SelectHeadPhone();
		try {
			Assert.assertTrue( blnStatus, "User unable to selected headphone");			
			Reporter.ReportEvent("Select headphone", "User should be able to select headphone", "User successfully selected headphone", "PASS");
		}
		catch(Throwable e) {			
			Reporter.ReportEvent("Select headphone", "User should be able to select headphone", "User unable to selected headphone", "FAIL");
			throw new RuntimeException("User unable to selected headphone");			
		}
	
		AddtocartPage ObjAddtocartPage = new AddtocartPage(getDriver());
		blnStatus = ObjAddtocartPage.fn_Validation();
		try {
			Assert.assertTrue( blnStatus, "Unable to pass validation string FOLLOW US");
			logger.info("validation passed found string FOLLOW US");
		}
		catch(Throwable e) {
			logger.info("validation failed on FOLLOW US");	
			throw new RuntimeException("Unable to validation string FOLLOW US");			
		}
		
		blnStatus =ObjAddtocartPage.fn_AddToCart();
		try {
			Assert.assertTrue( blnStatus, "User not able to add product to cart and checkout");			
			Reporter.ReportEvent("Add product to cart and checkout", "User should be able to add product to cart and checkout", "User added product to cart and checkout from cart", "PASS");
		}
		catch(Throwable e) {			
			Reporter.ReportEvent("Add product to cart and checkout", "User should be able to add product to cart and checkout", "User not able to add product to cart and checkout", "FAIL");
			throw new RuntimeException("User not able to add product to cart and checkout");			
		}
		
		PaymentPage ObjPaymentPage = new PaymentPage(getDriver());
		blnStatus = ObjPaymentPage.fn_Validation();
		try {
			Assert.assertTrue( blnStatus, "Unable to pass validation string FOLLOW US");
			logger.info("validation passed found string FOLLOW US");
		}
		catch(Throwable e) {
			logger.info("validation failed on FOLLOW US");	
			throw new RuntimeException("Unable to validation string FOLLOW US");			
		}
		
		blnStatus = ObjPaymentPage.fn_PaymentMentodMasCard();
		try {
			Assert.assertTrue( blnStatus, "User unable to made payment order not completed");			
			Reporter.ReportEvent("Make payment and complete order", "User should be able to make payment and complete order", "User made payment and complete order", "PASS");
		}
		catch(Throwable e) {			
			Reporter.ReportEvent("Make payment and complete order", "User should be able to make payment and complete order", "User unable to made payment and order not completed", "FAIL");
			throw new RuntimeException("User unable to made payment and order not completed");			
		}		
		ObjPaymentPage.fn_OrderDetails();
		
	}	
}
