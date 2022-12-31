package PageObjective;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrudoctDetails extends BasePage{

	PrudoctDetails (WebDriver driver){
		this.driver = driver; 
	}
	

	public void goToCart() throws InterruptedException {
		
		Thread.sleep(3000) ;
		driver.findElement(By.id("option-label-size-143-item-172")).click();
		
		//Thread.sleep(3000) ;
		driver.findElement(By.id("option-label-color-93-item-49")).click();
		
		Thread.sleep(3000) ;
		driver.findElement(By.id("product-addtocart-button")).click();
		
		
		Thread.sleep(3000) ;
		driver.findElement(By.xpath("(//span[@class='counter qty'])[1]")).click();
		
		Thread.sleep(3000) ;
		driver.findElement(By.id("top-cart-btn-checkout")).click();
	}
	
	
	
}
