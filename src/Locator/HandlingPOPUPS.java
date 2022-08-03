package Locator;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPOPUPS {

	public static void main(String[] args) throws InterruptedException {
 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		 Set<String> window= driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(window);
		for(int i=0;i<al.size();i++)
		{
			driver.switchTo().window(al.get(i));
			String title=driver.getTitle();
			if(title.contains("Time"))
			{
				driver.findElement(By.xpath("//span[.='Resources']")).click();
			}
		}
		driver.close();
		
		
		}

}
