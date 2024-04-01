package ActionsClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipKart {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		WebElement fashion=driver.findElement(By.className("_27h2j1"));
		Actions act=new Actions(driver);
		act.moveToElement(fashion).perform();
		driver.findElement(By.xpath("//a[text()='Women Footwear']")).click();
		WebElement price=driver.findElement(By.xpath("(//div[@class='_2B099V'])[1]"));
		System.out.println(price.getText());
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		WebElement jobs=driver.findElement(By.xpath("(//b[@class='caret'])[1]"));
		act.moveToElement(jobs).perform();
		driver.findElement(By.xpath("(//a[text()='Jobs @ India'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Candidate Login'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vaishalisapkal000@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vaishu@123");
		//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		driver.findElement(By.id("loginbtn")).click();
		
	}

}
