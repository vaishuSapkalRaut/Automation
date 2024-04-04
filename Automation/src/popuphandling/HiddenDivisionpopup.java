package popuphandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionpopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("vaishali",Keys.TAB,"vaishalisapkal07@gmail.com",Keys.TAB,"lipstick",Keys.TAB,"I want to purches it");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

}
