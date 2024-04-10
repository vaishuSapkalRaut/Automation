package WindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("shoes",Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='Downshifter 13 Running Shoes'])[1]")).click();
		Set<String> allid=driver.getWindowHandles();
		
		for(String id:allid)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Buy Black Sports Shoes for Men by NIKE Online | Ajio.com"));
			{
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='pdp-addtocart-button']")).click();
		
	}

}
