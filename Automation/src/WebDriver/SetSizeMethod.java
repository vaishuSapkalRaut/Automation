package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		Dimension diamension = new Dimension(1000,2000);
		
		driver.manage().window().setSize(diamension);
		
		driver.get("https://www.google.com");
		
	}

}
