package popuphandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
public static void main(String[] args) throws AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_D);
	r.keyPress(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_N);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_D);
	r.keyPress(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_N);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	
	
}
}
