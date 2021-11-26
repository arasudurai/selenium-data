package org.ibm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExambles {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARASU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		WebElement kk = driver.findElement(By.xpath("//select[@id='fruits']"));
		
		Select s = new Select(kk);
		s.selectByIndex(0);
		s.selectByValue("apple");
		Thread.sleep(3000);
		s.selectByVisibleText("orange");
		
		
		
		
	}

}
