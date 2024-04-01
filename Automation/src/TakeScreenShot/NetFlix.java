package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class NetFlix {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.netflix.com/in/");
		WebElement logo = driver.findElement(By.xpath("//span[@data-uia='nmhp-card-header+logo']"));
		Thread.sleep(10000);
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/logo.png");
		Files.copy(src, dest);
		

	}

}
