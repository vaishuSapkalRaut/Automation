package WindowHandle;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.zomato.com/india");
	WebElement privacy=driver.findElement(By.xpath("//p[text()='Privacy']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",privacy );
	
	driver.findElement(By.xpath("//a[@href='https://www.instagram.com/zomato/']")).click();
	
	driver.findElement(By.xpath("//a[@href='https://twitter.com/zomato']")).click();
	
	driver.findElement(By.xpath("//a[@href='https://www.facebook.com/zomato']")).click();
	
	driver.findElement(By.xpath("//a[@href='https://www.youtube.com/zomato']")).click();
	
	driver.findElement(By.xpath("//a[@href='https://in.linkedin.com/company/zomato']")).click();
	Set<String> allwindowId =driver.getWindowHandles();
	
	for(String id:allwindowId)
	{
		driver.switchTo().window(id);
		
		if(driver.getTitle().contains("Zomato | LinkedIn"))
		{
			
		}
		else 
		{
			driver.close();
		}
		
	}
	
}
}
