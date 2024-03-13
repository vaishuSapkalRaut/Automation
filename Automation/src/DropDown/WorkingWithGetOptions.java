package DropDown;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("(//div[@title='Learn More'])[1]")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement multiSelect=driver.findElement(By.id("select-multiple-native"));
		Select S=new Select(multiSelect);
		List<WebElement> option=S.getOptions();
		for (int i=0;i<option.size();i++)
		{
			System.out.println(option.get(i).getText());
		}
		
		//for(WebElement opt:option)
		//{
		//	System.out.println(opt.getText());
		//}
	}

}
