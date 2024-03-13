package Locators;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegister {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/login.php/");
	
	driver.findElement(By.className("_97w5")).click();
	
 WebElement	FirstName=driver.findElement(By.name("firstname"));
 FirstName.sendKeys("Vaishali");
	
	WebElement Surname=driver.findElement(By.name("lastname"));
	 Surname.sendKeys("Sapkal");
	
	 WebElement Pno=driver.findElement(By.name("reg_email__"));
	Pno.sendKeys("9876543210");
	
	WebElement Password=driver.findElement(By.name("reg_passwd__"));
	Password.sendKeys("Vaishu@123");
	
	driver.findElement(By.className("_58mt")).click();
	
	driver.findElement(By.name("websubmit")).click();
	driver.findElement(By.linkText("Already have an account?")).click();
	
	WebElement EmailTextField=driver.findElement(By.id("email"));
	 EmailTextField.sendKeys("rpawan143@gmail.com");
	 
 WebElement	PasswordTextField=driver.findElement(By.id("pass"));
  PasswordTextField.sendKeys("Rpawan143@");

WebElement Loginbutton=driver.findElement(By.name("login"));
Loginbutton.click();
	
	}

}
