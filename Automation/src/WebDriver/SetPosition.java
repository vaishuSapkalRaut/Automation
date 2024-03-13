package WebDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		Point point= new Point(250,500);
		
		driver.manage().window().setPosition(point);
		
		driver.get("https://www.google.com");
	}
}
