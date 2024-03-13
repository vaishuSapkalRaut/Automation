package Locators;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 WebElement UsernameTextField=driver.findElement(By.name("username"));
	 UsernameTextField.sendKeys("vaishalisapkal000");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 WebElement PasswordTextField=driver.findElement(By.name("password"));
	 PasswordTextField.sendKeys("Vaishu@123");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 WebElement Loginbutton=driver.findElement(By.className("_acap"));
	 Loginbutton.click();
	 
	}

}
