package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AirVistara {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver() ;
      driver.manage().window().maximize();
      driver.get("https://www.airvistara.com/in/en");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("pune",Keys.ENTER);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("Delhi",Keys.ENTER);
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@monthname='Mar']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[text()='4']")).click();
      Thread.sleep(2000);
      driver .findElement(By.xpath("//span[text()='Return Date']")).click();
      Thread.sleep(2000);
      driver .findElement(By.xpath("//a[text()='8']")).click();
      Thread.sleep(2000);
      driver .findElement(By.xpath("//button[text()='Search Flights']")).click();
    
	}

}