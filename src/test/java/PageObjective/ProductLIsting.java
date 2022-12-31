package PageObjective;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductLIsting extends BasePage{
	
	ProductLIsting (WebDriver driver){
		this.driver = driver; 
	}

public void selectProduct() throws InterruptedException {
	Thread.sleep(3000) ;
	driver.findElement(By.xpath("(//img[@class='product-image-photo'])[1]")).click();
}
	
}
