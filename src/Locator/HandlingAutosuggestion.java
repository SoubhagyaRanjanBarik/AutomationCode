package Locator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("headless");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.id("input")).sendKeys("Virat");
		Thread.sleep(3000);
	    List<WebElement> autosuggestion=driver.findElements(By.xpath("//span[.='Virat']"));
	    for(int i=0;i<autosuggestion.size();i++)
	    {
	    	String title=autosuggestion.get(i).getText();
	    	if(title.equalsIgnoreCase("Virat kohli Age"))
	    	{
	    		autosuggestion.get(i).click();
	    	}
	    }
		
	}

}
