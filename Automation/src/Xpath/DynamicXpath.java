package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
	
		 driver.findElement( By.xpath("html/body/div/section[4]/div/div/div/div[2]")).click();
		
		 driver.findElement(By.xpath("//button[@id='flightSearch']")).click();
		
	 WebElement	price= driver.findElement(By.xpath("(//span[text()='IndiGo'])[1]/ancenstor::div[@id='466f02be6b41f11572baf18b9bf8c727']/descendant::(//div[@class='_2MkSl'])[1]"));
	
	 String FlightPrice= price.getText();
	
	 System.out.println("FlightPrice"+ FlightPrice);
	}

}
