package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://127.0.0.1/login.do");

	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
	driver.findElement(By.xpath("//a[@class='content users']")).click();
	
	driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Manager");
	
	driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("vaishu@123");
	
	driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("vaishu@123");
	
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Vaishu");
	
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("sapkal");
	
	driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	
	}

}
