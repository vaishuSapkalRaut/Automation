package popuphandling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\DELL\\Desktop\\New Doc 02-07-2023 17.42.pdf");
	
}
}
