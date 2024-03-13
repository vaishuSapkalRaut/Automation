package WebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String Actual=driver.getTitle();
		String expected ="Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
		if(Actual.equals(expected))
		{
			System.out.println("test case pass");
		}	
		else
		{
			System.out.println("test case fail");
		}
		
		String ActualUrl=driver.getCurrentUrl();
		String expectedUrl="https://paytm.com/";
		if(ActualUrl.equals(expectedUrl))
		{
			System.out.println("Url is correct");
		}	
		else
		{
			System.out.println("Url is Incorrect");
		}
	}

}
