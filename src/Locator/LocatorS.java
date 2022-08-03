package Locator;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorS {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
 ChromeOptions option=new ChromeOptions();
 option.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver(option);
		//Robot r=new Robot();
	    driver.navigate().to("https://demo.actitime.com/login.do");
//	    driver.findElement(By.id("username")).sendKeys("akashya");
//	    Thread.sleep(2000);
//	    r.keyPress(KeyEvent.VK_CONTROL);
//	    r.keyPress(KeyEvent.VK_A);
//	    r.keyPress(KeyEvent.VK_BACK_SPACE);
//	    r.keyRelease(KeyEvent.VK_CONTROL);
//	    r.keyRelease(KeyEvent.VK_A);
//	    r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		driver.findElement(By.name("username")).sendKeys("fghj");
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//	    r.keyPress(KeyEvent.VK_A);
//	    r.keyPress(KeyEvent.VK_BACK_SPACE);
//	    r.keyRelease(KeyEvent.VK_CONTROL);
//	    r.keyRelease(KeyEvent.VK_A);
//	    r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		driver.findElement(By.className("textField")).sendKeys("asx");
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//	    r.keyPress(KeyEvent.VK_A);
//	    r.keyPress(KeyEvent.VK_BACK_SPACE);
//	    r.keyRelease(KeyEvent.VK_CONTROL);
//	    r.keyRelease(KeyEvent.VK_A);
//	    r.keyRelease(KeyEvent.VK_BACK_SPACE);
		//driver.findElement(By.tagName("//input")).sendKeys("ass");
		//driver.findElement(By.linkText("gfhvj"));
		//driver.findElement(By.partialLinkText("bdn"));
//		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(Keys.CONTROL,"A");
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//	    r.keyPress(KeyEvent.VK_A);
//	    r.keyPress(KeyEvent.VK_BACK_SPACE);
//	    r.keyRelease(KeyEvent.VK_CONTROL);
//	    r.keyRelease(KeyEvent.VK_A);
//	    r.keyRelease(KeyEvent.VK_BACK_SPACE);
//	    System.out.println(driver.getCurrentUrl());
//	    //System.out.println(driver.getPageSource());
//	    System.out.println(driver.getTitle());
	    
//	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
//	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
//	   WebElement ele=driver.findElement(By.xpath("//div[.='Login ']"));
//	    Actions act=new Actions(driver);
//	    act.click(ele).perform();
//	    
//	    Alert alt=driver.switchTo().alert();
//	    alt.accept();
//	    alt.dismiss();
	    driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
	    Thread.sleep(2000);
	    
	    Set<String> s= driver.getWindowHandles();
	    ArrayList<String> a=new ArrayList<>(s);
	    System.out.println(a.size());
	    for(int i=0;i<a.size();i++)
	    {
	      String actual=driver.getTitle();
	      driver.switchTo().window(a.get(i));
	      
	      Thread.sleep(2000);
	      if(actual.contains("Time Tracking"))
	      {
	    	  System.out.println(a.size());
	    	  driver.findElement(By.xpath("//span[.='Resources']")).click();
	      }
	      
	    }
	    
	}

}
