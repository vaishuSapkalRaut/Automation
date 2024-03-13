package synchronization;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naukri {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("register_Layer")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("vaishali");
	driver.findElement(By.xpath("//input[@placeholder='Tell us your Email ID']")).sendKeys("vaishalisapkal345@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vaishu@231");
	driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("9876543210");
	driver.findElement(By.xpath("(//h2[@class='main-3'])[2]")).click();
	driver.findElement(By.xpath("//input[@name='currentCity']"));
	driver.findElement(By.xpath("//span[text()='Pune']")).click();
	driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']")).click();
	driver.findElement(By.xpath("//button[text()='Register now']")).click();
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	driver.findElement(By.id("usernameField")).sendKeys("vaishalisapkal345@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vaishu@231");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
     Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='Search jobs here']")).click();
	//WebElement searchButton=
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//wait.until(ExpectedConditions.elementToBeClickable(searchButton));
	//searchButton.click();
	driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]")).sendKeys("software test",Keys.ENTER);
	
	
	
	
	}

}
