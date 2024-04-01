package JavaScriptExecutor;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("document.getElementById('name').value='vaishali';");
	  Js.executeScript("document.getElementById('email').value='vaishalisapkal000@gmail.com';");
	  Js.executeScript("document.getElementById('password').value='vaishu@123';");
	}

}
