package PageObjective;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Shipping  extends BasePage{
	
		Shipping (WebDriver driver){
			this.driver=driver;
		}
		
	
	public void shippingInfo() throws InterruptedException{
		Thread.sleep(3000) ;
		driver.findElement(By.id("customer-email")).sendKeys("rtfghjfghi@gmail.com");
		
		
		Thread.sleep(3000) ;
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ali");
		
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rash");
		
		driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("123 street");
		
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Brooklyn");
		
		Select city = new Select (driver.findElement(By.xpath("//select[@name='region_id']"))); 
		
		city.selectByVisibleText("New York"); 
		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("(347)377-8372");
	
		((JavascriptExecutor) driver).executeScript("scroll(0,800)");
		
		
		driver.findElement(By.id("label_method_flatrate_flatrate")).click();
		
		driver.findElement(By.xpath("//button[@data-role='opc-continue']")).click();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
		
		
	}

}
