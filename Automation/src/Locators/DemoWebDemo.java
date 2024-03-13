package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebDemo {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	WebElement Registorbutton=driver.findElement(By.className("ico-register"));
	Registorbutton.click();
	
	WebElement GenderRadioButton=driver.findElement(By.className("forcheckbox"));
	GenderRadioButton.click();
	
	WebElement FirstName=driver.findElement(By.id("FirstName"));
	FirstName.sendKeys("Vaishali");
	
	WebElement LastName=driver.findElement(By.id("LastName"));
	LastName.sendKeys("Sapkal");
	
	WebElement email_name =driver.findElement(By.id("Email"));
	email_name.sendKeys("vaishalisapkal07@gmail.com");

	WebElement pass =driver.findElement(By.id("Password"));
	pass.sendKeys("Vaishu@123");
	
	WebElement conf_pass =driver.findElement(By.id("ConfirmPassword"));
	conf_pass.sendKeys("Vaishu@123");
	
	WebElement reg_button =driver.findElement(By.id("register-button"));
	reg_button.click();
	
	}

}
