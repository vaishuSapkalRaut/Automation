package Xpath;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("html/body/div/div/div/div/div/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("html/body/div/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/input")).sendKeys("vaishalisapkal000@gmail.com");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[3]/input")).sendKeys("Vaishu@123");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/input")).click();
		
	
	}

}
