package Xpath;

import java.time.Duration;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blinkit {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.zomato.com/india");
	
	driver.findElement(By.xpath("//p[text()='Blinkit']")).click();
	
	 WebElement location=driver.findElement(By.xpath("//input[@placeholder='search delivery location']"));
	
	location.sendKeys("Pune, Maharashtra, India");
	
	 location.clear();
	 
	 location.sendKeys("Pune, Maharashtra, India");
	
	driver.findElement(By.xpath("(//div[text()='Pune, Maharashtra, India'])[1]")).click();
	
	 driver.findElement(By.xpath("//a[@href='/s/']")).click();
	 
	 driver.findElement(By.xpath("//input[@class='SearchBarContainer__Input-sc-hl8pft-3 irVxjq']")).sendKeys("sugar",Keys.ENTER);
	
	 driver.findElement(By.xpath("(//div[text()='ADD'])[1]")).click();
	 
	 
	 for(int i=1; i<3; i++)
	 { 
		driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']")).click();
	 }
	 
	 
   }
   
	}


