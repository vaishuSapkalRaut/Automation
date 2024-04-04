package popuphandling;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoblaze.com/");
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("sapkalvaishu");
		driver.findElement(By.id("loginpassword")).sendKeys("sapkal123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
				alt.accept();
				driver.findElement(By.xpath("//a[text()='Cart']")).click();
				driver.navigate().back();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[text()='Home ']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
				driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
				Thread.sleep(3000);
				Alert alt1=driver.switchTo().alert();
						alt1.accept();
						driver.findElement(By.xpath("//a[text()='Cart']")).click();
						Thread.sleep(3000);
						WebElement Total =driver.findElement(By.xpath("//h3[@id='totalp']"));
						Thread.sleep(3000);
						System.out.println(Total.getText());
						Thread.sleep(3000);
						String Actual=Total.getText();
						String Expected="1180";
						if(Actual.equals(Expected))
						{
							System.out.println("pass");
							
						}
						else
						{
							System.out.println("fail");
						}	
						
				
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		driver.findElement(By.id("name")).sendKeys("Vaishali");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("card")).sendKeys("123546789");
		driver.findElement(By.id("month")).sendKeys("Jan");
		driver.findElement(By.id("year")).sendKeys("2024");
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
	
		
		
		
	}

}
