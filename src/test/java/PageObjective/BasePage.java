package PageObjective;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public WebDriver driver; 
	
	public HomePage hp; 
	public ProductLIsting pl; 
	public PrudoctDetails pd;
	public Shipping S;
	
	public void openBrowser(){
	System.setProperty("webdriver.chrome.driver", "Driver3/chromedriver3");

	driver=new ChromeDriver();
	
	
	hp = new HomePage(driver); 
	pl = new ProductLIsting(driver);
	pd = new PrudoctDetails(driver);
	S = new Shipping(driver);
	}
	
	public void naviateToWeb() {
		
		driver.get("https://magento.softwaretestingboard.com/") ;
	}
	
	
	
	
	
	public void closeBrowser() {
		
		driver.close();
	}
	

}
