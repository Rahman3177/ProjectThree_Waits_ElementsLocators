package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {
	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	}
	@Test
	public void testVasiousConcepts() {
//Using Absolute Xpath
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[1]/a/strong")).click();
		
//Using Relative Xpath
/*Syntax:
		 - //Tag[@AttributeNode ='Value']......eg: //input[@id='username']
		 - //Tag[@AttributeNode = 'Value' and @AttributeNode = 'Value']..e.g: //input[@type ='submit' and @value='login']
		 - //Tag[text() = 'Value'] or //Tag[contains(text(), 'Value')]....e.g: //input[test()= 'new page']  or
		 															  ....e.g: //input[contains(test(),'new page')] 
*/
//		- //Tag[@AttributeNode ='Value']......eg: //input[@id='username']
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Luthfor");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rahman");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("abc123");
		
//	 - //Tag[]AttributeNode = 'Value' and @AttributeNode = 'Value']..e.g: //input[@type ='submit' and @value='login']		
		driver.findElement(By.xpath("//input[@id='tool-2' and @value='Selenium Webdriver']")).click();
		
//		 - //Tag[text() = 'Value'] or ....e.g: //input[test()= 'new page']		
		driver.findElement(By.xpath("//a[text()='API Documentations']")).click();
							//OR...this is preffered
//	 -//Tag[contains(text(), 'Value')].....e.g: //input[contains(test(),'new page')]	
		driver.findElement(By.xpath("//a[contains(text(), 'API Documentations' )]")).click();
		
		}
	
	
//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}
	

	
	

}
