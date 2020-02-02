package login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_windows1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driverdetails/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String parentwindowhandle = driver.getWindowHandle();
		System.out.println("Parent window handle : " +parentwindowhandle);
		driver.manage().window().maximize();
		/*
		 * Thread.sleep(5000); driver.switchTo().alert().dismiss();
		 */
		WebElement clickElement = driver.findElement(By.id("button1"));
		
		for (int i=0;i <3;i++)
		{
			clickElement.click();
			Thread.sleep(3000);
		}
		Set<String> allwindowhandle=driver.getWindowHandles();
		for(String Handle:allwindowhandle)
		{
			System.out.println("all window handles :" +Handle);
		}
		

	}

}
