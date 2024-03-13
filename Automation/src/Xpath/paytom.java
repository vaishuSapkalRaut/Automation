package Xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytom {
	
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://paytm.com/");
	 driver.findElement( By.xpath("html/body/div/section[4]/div/div/div/div[2]")).click();
	 
	 driver.findElement(By.xpath("//span[@class='_3xDDz']")).click();
	 
	 driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	
	driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("PNQ",Keys.ENTER);
	
	 driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
	
	 driver.findElement(By.xpath("(//span[@class='_3xDDz'])[2]")).click();
	
	 driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	 
	 driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("DEL",Keys.ENTER);
	
	 driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();

	 driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
	
	 driver.findElement(By.xpath("(//div[text()='15'])[1]")).click();
	
	 driver.findElement(By.xpath("//button[@id='flightSearch']")).click();
	
	WebElement price= driver.findElement(By.xpath("(//span[text()='View Fare'])[1]/ancestor::div[@class='_3VUCr']/descendant::div[@class='_2MkSl']"));
	 String FlightPrice= price.getText(); 
	 System.out.println( FlightPrice);
	 
 List<WebElement> flight =driver.findElements(By.className("_1gMv6"));
 
   for(int i=0;i<flight.size();i++)
	
   {
	System.out.println(flight.get(i).getText());
	System.out.println("===============================================");
   }
	
	
}
	 
}
