package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class task
{
	WebDriver driver;

@Test	
public void main()
{
	System.out.println("Start");
	String BROWSER =System.getProperty("browser", "firefox");
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
