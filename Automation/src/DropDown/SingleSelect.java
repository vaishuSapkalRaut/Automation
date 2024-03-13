package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("(//div[@title='Learn More'])[1]")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement dropdown=driver.findElement(By.id("select3"));
		Select obj=new Select(dropdown);
		obj.selectByValue("India");
	}

}
