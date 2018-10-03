package assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;

public class Assign1 {

	static WebDriver driver;
	public void browser()
	{
		System.setProperty("webdriver.gecko.driver", "C:/ShuchiAutomation/geckodriver.exe");
		driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:/ShuchiAutomation/chromedriver.exe");
		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		driver.get("http://qatechhub.com");
		
	}
	
	public boolean result()
	{
		boolean ans;
		String st = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		String title = driver.getTitle();
		if (title.equals(st))
		{ 	ans = true;
			System.out.println("Pass");
			return ans;
		}
		else
		{ 	ans = false;
			System.out.println("Fail");
			return false;
		}
	}
	
	public void navigation()
	{
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		String cururl = driver.getCurrentUrl();
		System.out.println(" \n Current URL is : " +cururl);
		driver.navigate().forward();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		cururl = driver.getCurrentUrl();
		System.out.println("\n Current URL is : " +cururl);
	}
	
	public static void main(String[] args) {
		Assign1 obj = new Assign1();
		obj.browser();
		obj.result();
		obj.navigation();
		driver.close();
	}

}


