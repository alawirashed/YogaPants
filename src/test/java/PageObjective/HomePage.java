package PageObjective;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	
	HomePage (WebDriver driver){
		this.driver = driver; 
	}

	public void clickToListing() {
		
		driver.findElement(By.xpath("//span[text()='Shop New Yoga']")).click();
	}
	
}
