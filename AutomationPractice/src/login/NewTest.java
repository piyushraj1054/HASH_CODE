package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest
{
	public String baseurl= "http://automationpractice.com/index.php";
	public WebDriver  driver;
@BeforeTest
public void beforetest()
{
	System.setProperty("webdriver.chrome.driver", "./driverdetails/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
  @Test
  public void f() 
  {
  }
  
  @AfterTest
  public void aftertest()
  {
	  
  }
}
