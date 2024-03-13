package Xpath;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.netflix.com/login");
	driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("vaishalisapkal000@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vaishu@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
