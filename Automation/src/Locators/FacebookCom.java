package Locators;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCom {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement EmailTextField=driver.findElement(By.id("email"));
		 EmailTextField.sendKeys("rpawan143@gmail.com");
		 
	  WebElement	PasswordTextField=driver.findElement(By.id("pass"));
	   PasswordTextField.sendKeys("Rpawan143@");
	
    WebElement Loginbutton=driver.findElement(By.name("login"));
     Loginbutton.click();
	}

}
