package org.ibm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableExamble {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARASU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		System.out.println("head");
		System.out.println("******");
		List<WebElement> head = driver.findElements(By.tagName("th"));
		int size = head.size();
		System.out.println(size);
		System.out.println("row");
		System.out.println("******");
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int size2 = rows.size();
		System.out.println(size2);
		System.out.println("data");
		System.out.println("******");
		List<WebElement> data = driver.findElements(By.tagName("td"));
		int size3 = data.size();
		System.out.println(size3);
		System.out.println("foot");
		System.out.println("******");
		List<WebElement> foot = driver.findElements(By.tagName("tfoot"));
		int size4 = foot.size();
		System.out.println(size4);
		System.out.println("data text");
		System.out.println("******");
		for (WebElement a : data) {
			String text = a.getText();
			System.out.println(text);
			
		}
		System.out.println("head text");
		System.out.println("******");
		for (WebElement b : head) {
			String text1 = b.getText();
			System.out.println(text1);
			
		}
		System.out.println("row text");
		System.out.println("******");
		for (WebElement c : rows) {
			String text3 = c.getText();
			System.out.println(text3);
		}
		
		System.out.println("foot text");
		System.out.println("******");
		for (WebElement d : foot) {
			String text4 = d.getText();
			System.out.println(text4);
			
		}
		System.out.println("HEAD USING FOR");
		System.out.println("***************");
		for (int i = 0; i < head.size(); i++) {
		WebElement x = head.get(i);	
		String text5 = x.getText();
			System.out.println(text5);
		}
		System.out.println("row");
		System.out.println("******");
		List<WebElement> data1 = driver.findElements(By.xpath("//th[@scope='row']"));
		int size5 = data1.size();
		System.out.println(size5);
		

		for (int i = 0; i <data1.size(); i++) {
			for (int j = 0; j < i; j++) {
				WebElement column = data1.get(i);
				String text8 = column.getText();
				System.out.println(text8);
			System.out.print(j);
			}
			System.out.println(i);
		}
			
		
		

		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
