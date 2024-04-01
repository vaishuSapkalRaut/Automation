package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SwagLab {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@name='login-button']")).click();
	driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
	driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
	WebElement title=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	System.out.println(title.getText());
	WebElement price=driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
	System.out.println(price.getText());
	String Actual=price.getText();
	String expected="$29.99";
	if(Actual.equals(expected))
	{
		System.out.println("pass");
		
	}
	else
	{
		System.out.println("fail");
	}	
	
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	driver.findElement(By.id("first-name")).sendKeys("vaishali");
	driver.findElement(By.id("last-name")).sendKeys("Sapkal");
	driver.findElement(By.id("postal-code")).sendKeys("443001");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src1 = ts.getScreenshotAs(OutputType.FILE);
	File dest1 = new File("./screenshot/order.png");
	Files.copy(src1, dest1);
	driver.findElement(By.id("react-burger-menu-btn")).click();
	driver.findElement(By.id("logout_sidebar_link")).click();
	
	
	
}
}
