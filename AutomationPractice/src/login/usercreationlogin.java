package login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class usercreationlogin extends Library
{
	/*
	 * public String baseurl= "http://automationpractice.com/index.php"; public
	 * WebDriver driver;
	 */
	@BeforeTest
	public void beforetest()
	{
		System.setProperty("webdriver.chrome.driver", "./driverdetails/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Library.baseurl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
  @Test
  public void usercreationlogin() 
  {
	  //going to sign-in and registering
	  driver.findElement(By.xpath("//a[@class='login']")).click(); //navigating to sign in page
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //Registration page
	  driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);
	  driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	  
	  //form filling
	  driver.findElement(By.id("id_gender1")).click();
	  driver.findElement(By.id("customer_firstname")).sendKeys("");
  }
  
  @AfterTest
  public void aftertest()
  {
	  
  }
}