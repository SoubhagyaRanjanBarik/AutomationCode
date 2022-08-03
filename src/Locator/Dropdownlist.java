package Locator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		//options.addArguments("headless");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.html-code-generator.com/html/drop-down/state-name");
		WebElement  dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select sc=new Select(dropdown);
		sc.selectByVisibleText("Italy");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	WebElement state=driver.findElement(By.xpath("//select[@id='user-state']"));
	
	int x=state.getLocation().getX();
	int y=state.getLocation().getY();
	js.executeScript("window.scrollBy("+x+","+y+")");
	
	Select s=new Select(state);
	s.selectByIndex(8);
	Thread.sleep(5000);
		
	WebElement element=driver.findElement(By.xpath("//div[.='Calculator']"));
	int x1=element.getLocation().getX();
	int y1=element.getLocation().getY();
	js.executeScript("window.scrollBy("+x1+","+y1+")");
	}

}
