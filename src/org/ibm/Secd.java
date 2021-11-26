package org.ibm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Secd {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARASU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		WebElement a = driver.findElement(By.xpath("(//select[@type='text'])[3]"));	
		Select s = new Select(a);
	   // s.selectByIndex(6);
	    s.selectByValue("1993");
		
	    List<WebElement> si = s.getOptions();
	    int size = si.size();
	    System.out.println(size);
	    
	    for (int i = 0; i < si.size(); i++) {
	    	
	    	WebElement webElement = si.get(i);
	    	String text = webElement.getText();
	    	System.out.println(text);
			
		}
		
		
	}
	
	
	
	
	

}
