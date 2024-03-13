package Xpath;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathFlipkart {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	List<WebElement> iphone =driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	 
	   for(int i=0;i<iphone.size();i++)
		
	   {
		System.out.println(iphone.get(i).getText());
		System.out.println("=======================");
	   }
		
	}

}
