package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class WorkingWithFindElements  {
 public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> iphone =driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(2000);
		List<WebElement> iphonename =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 for(int i=0;i<iphone.size();i++)
		 {
			System.out.println(iphone.get(i).getText()+"_______"+iphonename.get(i).getText());
		 }
		
	}
	

}
