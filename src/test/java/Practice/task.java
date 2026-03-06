package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class task
{
	WebDriver driver;
@Parameters("browser")
@Test	
public void main(String BROWSER)
{
	BROWSER =System.getProperty("browser");
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		driver =new ChromeDriver();
		System.out.println("Chrome");
	}
	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		driver =new FirefoxDriver();
		System.out.println("firefox");
	}
	
	System.out.println("done the task");
	
}
}
