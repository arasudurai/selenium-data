package org.ibm;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.netty.util.Timeout;

public class Waits {
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARASU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		String ur = driver.getCurrentUrl(); 
		System.out.println(ur);
		
		//driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);//
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(3)).pollingEvery(Duration.ofSeconds(5)).ignoring(Throwable.class);
		
		
		WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
		name.sendKeys("bug for me");
		String na = name.getAttribute("value");
		System.out.println(na);
		
	
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(" asfdgf1113",Keys.ENTER);
		String pa = pass.getAttribute("value");
		System.out.println(pa);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
