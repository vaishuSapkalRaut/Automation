package Xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("women tops",Keys.ENTER);
	 List<WebElement> WomenTops=driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
	 
		//  for(int i=0;i< WomenTops.size();i++)
				
		//   {
		//	System.out.println( WomenTops.get(i).getText());
		//	System.out.println("=======================");
		//   }
	 for(WebElement name:WomenTops)
	 {
		 System.out.println(name.getText());
		 System.out.println("=======================");
	 }
	 
		

	}

}
