package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameMethod {
	public static void main(String[] args) {
		
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    WebElement element =driver.findElement(By.id("small-searchterms"));
    element.sendKeys("Books");
	}

}
