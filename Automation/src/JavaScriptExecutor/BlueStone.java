package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BlueStone {
public static void main(String[] args) throws IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("confirmBtn")).click();
	 WebElement goldcoin=driver.findElement(By.xpath("//a[text()='Gold Coins ']"));
	 Actions act=new Actions(driver);
	 act.moveToElement(goldcoin).perform();
	 driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-2gms,m']")).click();
	 WebElement gramcoin=driver.findElement(By.id("page-title"));
		File src = gramcoin.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/gramcoin.png");
		Files.copy(src, dest);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./screenshot/image.png");
		Files.copy(src1, dest1);
		WebElement email=driver.findElement(By.name("newsletter_subscriber"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",email );
		driver.findElement(By.name("newsletter_subscriber")).sendKeys("vaishalisapkal000@gamil.com");
		driver.findElement(By.name("Submit")).click();
}
}
