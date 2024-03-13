package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://twitter.com/?lang=en");
		driver.findElement(By.xpath("(//div[@dir='ltr'])[6]")).click();
		driver.findElement(By.xpath("//input[@autocomplete='name']")).sendKeys("vaishali");
		driver.findElement(By.xpath("//input[@autocomplete='tel']")).sendKeys("9511758184");
		driver.findElement(By.xpath("(//select[@aria-invalid='false'])[1]")).click();
		driver.findElement(By.xpath("(//div[@dir='ltr'])[9]")).click();
		
	
	}
}
