package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LearnIdentifiers {
	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver = new InternetExplorerDriver();
		
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS); //Using Implicitly Wait
	}
	
	@Test
	public void testVariousIdentifiers () {
	
		driver.findElement(By.name("firstname")).sendKeys("Luthfor");
		driver.findElement(By.name("lastname")).sendKeys("Rahman");
		driver.findElement(By.name("Password")).sendKeys("abc123");	
		driver.findElement(By.id("sex-0")).click(); //Radio Button for MALE
//		driver.findElement(By.id("sex-1")).click();//Radio Button for FEMALE
//		driver.findElement(By.className("input-file")).click();
//		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.findElement(By.partialLinkText("Product Backend")).click();
		driver.findElement(By.cssSelector(""));
		
	

		
		
	}

//	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.close();	
		driver.quit();
		
	}

}
