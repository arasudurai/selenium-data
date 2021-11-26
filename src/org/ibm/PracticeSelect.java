package org.ibm;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.jodah.failsafe.Timeout;

public class PracticeSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARASU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		
	   WebElement k = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		k.click();
		//Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s = new Select(year);
		s.selectByValue("2016");
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> a = s.getOptions();
		int size = a.size();
		System.out.println(size);
		
		for (int i = 0; i <a.size(); i++) {
			WebElement x = a.get(i);
			String text = x.getText();
			System.out.println(text);
			
	}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement d = driver.findElement(By.xpath("//select[@id='day']"));
		Select d1 = new Select(d);
		d1.selectByIndex(10);
		
		boolean m = d1.isMultiple();
		System.out.println(m);
		
		List<WebElement> p = d1.getOptions();
		int t = p.size();
		System.out.println(t);
		
	for (int i = 0; i <p.size(); i++) {
		WebElement y = p.get(i);
		String ty = y.getText();
		System.out.println(ty);
		
	}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
