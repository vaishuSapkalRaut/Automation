package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetMethod {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
	   driver.get("https://www.airvistara.com/");
		String actual = driver .getTitle();
		String expected = "Book Flights & Check In Online | Vistara";
		
		if(actual.equals(expected))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}

}
