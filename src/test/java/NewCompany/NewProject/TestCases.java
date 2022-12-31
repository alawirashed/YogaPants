package NewCompany.NewProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjective.BasePage;

public class TestCases extends BasePage{

	@BeforeTest 
	public void open() {
		openBrowser(); 
	}
	
	@Test 
	public void test1() {
		naviateToWeb();
	}
	
	@Test 
	public void test2() {
		hp.clickToListing();
	}
	
	@Test
	public void test3() throws InterruptedException {
		
		pl.selectProduct();
	}
	
	@Test
	public void test4() throws InterruptedException
	{
		pd.goToCart();
	}
	
	@Test
	public void test5() throws InterruptedException
	{
		S.shippingInfo();
	}
	
	
	
	
	@AfterTest
	public void close() {
		closeBrowser(); 
	}
}
