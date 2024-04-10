package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//a[@href='https://www.google.co.in/intl/en/about/products']")).click();
		driver.switchTo().frame("app");
		driver.findElement(By.xpath("//a[@href='https://maps.google.com/']")).click();
	
	}
}
