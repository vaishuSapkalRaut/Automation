package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShotOfParticularWebElement {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("confirmBtn")).click();
 WebElement goldcoin=driver.findElement(By.xpath("//a[text()='Gold Coins ']"));
 Actions act=new Actions(driver);
 act.moveToElement(goldcoin).perform();
 goldcoin.click();
	WebElement coin = driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));
	JavascriptExecutor Js=(JavascriptExecutor) driver;
	Js.executeScript("window.scrollBy(0,1000);");
	Thread.sleep(10000);
	File src = coin.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/coin.png");
	Files.copy(src, dest);
} 


}
