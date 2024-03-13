package DropDown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("vaishalisapkal000@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vaishu@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Health Book']/ancestor::div[@class='product-item']/descendant::input[@value='Add to cart']")).click();
		driver.findElement(By.linkText("shopping cart")).click();
	WebElement	dropdown=driver.findElement(By.id("CountryId"));
	Select s=new Select(dropdown);
	s.selectByVisibleText("India");
	driver.findElement(By.id("termsofservice")).click();
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.xpath("//div[@id='billing-buttons-container']/descendant::input[@title='Continue']")).click();
	driver.findElement(By.xpath("//div[@id='shipping-buttons-container']/descendant::input[@title='Continue']")).click();
	driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/descendant::input[@value='Continue']")).click();
	driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']/descendant::input[@value='Continue']")).click();
	driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']/descendant::input[@value='Continue']")).click();
	driver.findElement(By.xpath("//input[@value='Confirm']")).click();
	Thread.sleep(2000);
	WebElement message=driver.findElement(By.tagName("strong"));
	 String text =message.getText(); 
	System.out.println(text);
	Thread.sleep(2000);
	driver.findElement(By.linkText("Click here for order details.")).click();
	driver.findElement(By.linkText("PDF Invoice")).click();
	}

}