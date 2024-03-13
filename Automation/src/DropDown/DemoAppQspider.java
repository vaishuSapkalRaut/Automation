package DropDown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DemoAppQspider {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("(//div[@title='Learn More'])[1]")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.id("phone")).sendKeys("9511758184");
		WebElement gender=driver.findElement(By.id("select2"));
		Select obj=new Select(gender);
		obj.selectByValue("female");
		WebElement country=driver.findElement(By.id("select3"));
		Select s=new Select(country);
		s.selectByValue("India");
		WebElement state=driver.findElement(By.id("select5"));
		Select S=new Select(state);
		S.selectByIndex(23);
		WebElement City=driver.findElement(By.xpath("(//select[contains(@class,'border-0 ')])[5]"));
		Select S1=new Select(City);
		S1.selectByVisibleText("Pune");
		WebElement quantity=driver.findElement(By.id("select7"));
		Select S2=new Select(quantity);
		S2.selectByVisibleText("2");
		driver.findElement(By.id("continuebtn")).click();
	     WebElement price=driver.findElement(By.xpath("(//p[text()='Total']/ancenstor::section[@class='flex justify-between pt-8']/decendant::p[text()='200'])[2]"));
		String shoes_price =price.getText();
		System.out.println(shoes_price);
	}

}
