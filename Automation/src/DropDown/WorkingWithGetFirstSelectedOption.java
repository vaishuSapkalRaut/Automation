package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetFirstSelectedOption {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("(//div[@title='Learn More'])[1]")).click();
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	driver.findElement(By.linkText("Multi Select")).click();
	WebElement multiSelect=driver.findElement(By.id("select-multiple-native"));
	Select S=new Select(multiSelect);
	for(int i=0;i<5;i++)
	{
		S.selectByIndex(i);
	}
	
	WebElement FirstSelection=S.getFirstSelectedOption();
	System.out.println(FirstSelection.getText());
	
	}

}
