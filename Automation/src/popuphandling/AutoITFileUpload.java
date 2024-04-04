package popuphandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITFileUpload {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
		driver.findElement(By.xpath("//div[text()='Upload File']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./AutoIT/Vaishu.exe");
		
		
	}
	

}
