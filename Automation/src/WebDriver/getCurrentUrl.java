package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class getCurrentUrl {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl="https://www.airvistara.com/in/en";
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Url is correct");
		}
		else
		{
			System.out.println("Url is Incorrect");
		}
	
	}

}
