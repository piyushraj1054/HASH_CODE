package edureka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signup extends Library
{

		@BeforeTest
		public void property()
		{
		System.setProperty("webdriver.chrome.driver", "./driverdetails/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();

	}
		
		@Test
		public void formfill() {
			
		}
		
		@AfterTest
		public void aftertest()
		{
			
		}

}
