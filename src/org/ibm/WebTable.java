package org.ibm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARASU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
	
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int s1 = row.size();
		System.out.println(s1);
		
		
		List<WebElement> col = driver.findElements(By.tagName("td"));
		int s2 = col.size();
		System.out.println(s2);
		
		
		for (int i = 0; i <row.size(); i++) {
			WebElement d = row.get(i);
			String text = d.getText();
	        System.out.println(text);					}
		
		
		for (int i = 0; i < col.size(); i++) {
			WebElement d1 = col.get(i);
			String text1 = d1.getText();
			System.out.println(text1);
			
		
			if (text1.equals("second cell")) {
				System.out.println(text1);
				System.out.println("Add number of the table:"+(i+2) );
				
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
