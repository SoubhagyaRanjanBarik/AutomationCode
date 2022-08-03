package Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingDropdownlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("headless");
		
		System.setProperty("webdriver.chrome.silentOutput", "true");
		
		System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver=new  ChromeDriver(options);
		
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}

}
