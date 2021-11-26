package org.ibm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARASU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/handling-iframes-selenium.html");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String ti = driver.getTitle();
		System.out.println(ti);
		
		List<WebElement> d1 = driver.findElements(By.tagName("iframes"));
		int a1 = d1.size();
		System.out.println(a1);
		WebElement tag = driver.findElement(By.xpath("//frame[@name='login_page']"));
	    driver.switchTo().frame(tag);
		
		
		WebElement name = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		name.sendKeys("123451465",Keys.ENTER);
		
		
		WebElement txt = driver.findElement(By.xpath("//input[@name='fldPassword']"));
		txt.sendKeys("asdrgbxhf",Keys.ENTER);
		
		
		
		
		
		
	}

}
