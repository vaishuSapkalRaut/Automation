package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://demowebshop.tricentis.com/");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 driver.findElement(By.xpath("html/body/div/div/div/div/div/ul/li/a")).click();
 
		
	}

}
