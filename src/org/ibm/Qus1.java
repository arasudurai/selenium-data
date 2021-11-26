package org.ibm;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Qus1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARASU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		//Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(3)).pollingEvery(Duration.ofSeconds(5)).ignoring(Throwable.class);
		
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String ti = driver.getTitle();
		System.out.println(ti);
		
	
		WebElement a1 = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		a1.sendKeys("iphone7",Keys.ENTER);
		
		
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(10)).ignoring(Throwable.class);
	    //Thread.sleep(3000);
		WebElement clk = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		clk.click();
		
		
		String ha = driver.getWindowHandle();
		System.out.println(ha);
		
		
		Set<String> ha2 = driver.getWindowHandles();
		System.out.println(ha2);
		
		
		for (String a : ha2) {
			
			if (!a.equals(ha)) {
				driver.switchTo().window(a);
				
			}	
			
		}
		
		Thread.sleep(3000);
		
		WebElement kl = driver.findElement(By.xpath("(//span[@class='intialtext'])[2]"));
		kl.click();
		
		
		
		
		WebElement text = driver.findElement(By.xpath("(//span[@class='price'])[2]"));
		String text2 = text.getText();
		System.out.println(text2);
		
	}
}
