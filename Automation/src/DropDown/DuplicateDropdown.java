package DropDown;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateDropdown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/DELL/Desktop/Dupicate.html");
		
		Select S=new Select(driver.findElement(By.id("dropdown")));
		
	List<WebElement> DuplicateOptions=S.getOptions();
	TreeSet<String> Set=new TreeSet<String>();
	for(int i=0;i<DuplicateOptions.size();i++)
	{
		String duplicate=DuplicateOptions.get(i).getText();
		Set.add(duplicate);
		
		
	}
	
	for(String Option :Set)
	{
		System.out.println(Option);
	}
		
	}
}
