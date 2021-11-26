package org.ibm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qus2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARASU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement click = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		click.click();
		
		
		Thread.sleep(30000);
		WebElement in = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
		Select s = new Select(in);
		s.selectByValue("7");
		
		
		
		boolean pl = s.isMultiple();
		System.out.println(pl);
		
		
		List<WebElement> d = s.getOptions();
		
		int k = d.size();	
		System.out.println(k);
		
		for (int i = 0; i <d.size(); i++) {
			
			WebElement y = d.get(i);
			String tx = y.getText();
			System.out.println(tx);
			
		}
		
	}

}
