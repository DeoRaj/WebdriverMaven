import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
@BeforeSuite
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
			
	}
@Test
	public void doLogin (){
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("devraj.gemini");
		driver.findElement(By.xpath("//*[@id='next']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("apple");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	
		if
(driver.findElement(By.xpath("//*[@id='errormsg_0_Passwd']")).isDisplayed())
		//{
System.out.println("");
}
		//else

{ System.out.println("Valid login");

}
			
			
@AfterSuite
	public void tearDown(){
		driver.quit();
	}
	
}
