package Locator;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.navigate().to("https://demo.actitime.com/login.do");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
	    Thread.sleep(2000);
	    Set<String> window=driver.getWindowHandles();
	    ArrayList<String> al=new ArrayList<String>(window);
	    for(int i=0;i<al.size();i++)
	    {
	    	driver.switchTo().window(al.get(i));
	    	String actual=driver.getTitle();
	    	if(actual.contains("Time Tracking Software"))
	    	{
	    	    driver.findElement(By.xpath("//span[.='Resources']")).click();
	    		Thread.sleep(3000);
	    		driver.close();
	    	}
	    }
	}
}
