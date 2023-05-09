package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	WebDriver driver;

//TestCase Scenario:Users will be able to add deposit		
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();

//TestCaseStep#01 : Open Browser and go to site:		
		driver.get("http://www.techfios.com/billing/?ng=admin/ ");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.MILLISECONDS);
	}

	@Test
	public void assignment() {
//TestCaseStep#02: Enter userName demo@techfios.com 
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//TestCaseStep#03: Enter password (abc123)		
		driver.findElement(By.name("password")).sendKeys("abc123");
//TestCaseStep#04: Click on Login Button		
		driver.findElement(By.name("login")).click();
//TestCaseStep#05: Click on Transaction Button		
		driver.findElement(By.linkText("Transactions")).click();
//TestCaseStep#06: Click on New Deposit Button		
		driver.findElement(By.xpath("html/body/section/div/nav/div/ul/li[5]/ul/li[1]/a")).click();
//TestCaseStep#07: Click on 'Open AN Account' DropDown to expand it		
		driver.findElement(By.id("select2-account-container")).click();
//TestCaseStep#08: Click on any account name
		driver.findElement(By.className("select2-results__option select2-results__option--highlighted")).click();
//TestCaseStep#09: Type any description 
		driver.findElement(By.className("form-control")).sendKeys("Luthfor_Test");
//TestCaseStep#10: Type any amount
		driver.findElement(By.id("amount")).sendKeys("125000");
//TestCaseStep#11: Click on Submit Button
		driver.findElement(By.id("submit")).click();
//Visually check to make sure the deposit posted	
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
//		driver.close();
		driver.quit();
	}

}
