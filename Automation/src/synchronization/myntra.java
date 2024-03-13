package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("jeans",Keys.ENTER);
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//label[text()='Women']")).click();
		driver.findElement(By.xpath("//label[text()='Levis']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='4500.0 TO 7951.0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-colorhex='black']")).click();
	}

}
