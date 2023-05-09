package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCSS {
	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver = new InternetExplorerDriver();

		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS); // Using Implicitly Wait
	}

	@Test
	public void testVariousIdentifiers() {
/* CSS Syntax:
		-TagName#Value (This '#' represent 'ID')
		-TagName.Value (This '.' dot represent 'CLASS')
		-TagName[Attribute = 'Value]
		-TagName.Class[Attribute = 'Value]
*/
		driver.findElement(By.cssSelector("input#exp-4")).click(); //CSS Selector : ID
//		driver.findElement(By.cssSelector("input.input-file")).click(); //CSS Selector : CLASS
// These 3 are same but can do different ways
//		driver.findElement(By.cssSelector("input[value ='Automation Tester']")).click();
//		driver.findElement(By.cssSelector("input[id='profession-1']")).click();
		driver.findElement(By.cssSelector("input[name='profession'][id='profession-1']")).click();
		
	}

//	@After
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
