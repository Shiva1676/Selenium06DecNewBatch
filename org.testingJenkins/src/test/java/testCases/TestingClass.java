/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class TestingClass {

	@Test
	public void test(){
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("========Browser executed successfully=============");
		
		driver.get("https://www.seleniumhq.org/");
		
		System.out.println("=======The application is up and running==========");
		
		System.out.println("The title of the page is:"+driver.getTitle());
		
		driver.quit();
		
		System.out.println("============Browser closed===========");
		
		
	}
	
	
}
