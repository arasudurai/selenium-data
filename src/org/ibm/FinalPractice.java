package org.ibm;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinalPractice {
	
	//MUTIPLE SCREENSHOT//
	static WebDriver driver;
	public static void screenshot(String name) throws IOException {
		
		TakesScreenshot p = (TakesScreenshot)driver;
		File s = p.getScreenshotAs(OutputType.FILE);
		File d = new File ("F:\\durai\\bin\\org"+name+".png");
		FileUtils.copyFile(s,d);

	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		//BASIC FUNCTIONS//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARASU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		screenshot("webpage");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String ti = driver.getTitle();
		System.out.println(ti);
		
		
		//WAITS//
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement name1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		name1.sendKeys("ARASU");
		screenshot ("first name");
		
		WebElement name2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		name2.sendKeys("N");
		screenshot("second name");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("5/163,periyakottai & (p.o),Dindugal -624614");
		screenshot("address");
	
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("systeminccbe@gmail.com");
		screenshot("email");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9876742321");
		screenshot("phone no");
		
		WebElement button = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		button.click();
		screenshot("genser");
		
		WebElement hp = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		hp.click();
		screenshot("hobbies");
		
//		Thread.sleep(3000);
//		WebElement age = driver.findElement(By.xpath("msdd"));
//		age.click();
//		
//		WebElement lang = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
//		lang.click();
		
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s = new Select(element);
		s.selectByIndex(3);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> options = s.getOptions(); 
		int size = options.size();
		System.out.println(size);
		
		
		WebElement element1 = driver.findElement(By.xpath("//select[@id='countries']"));
		element1.sendKeys("India");
		
		
//		WebElement element3 = driver.findElement(By.xpath("//span[@role='combobox']"));
//		Select s3 = new Select(element3);
//		s3.selectByIndex(3);
//		boolean multiple3 = s3.isMultiple();
//		System.out.println(multiple3);
//		List<WebElement> options3 = s3.getOptions(); 
//		int size3 = options3.size();
//		System.out.println(size3);
//		
//		
//		
//		WebElement element2 = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
//		Select s2 = new Select(element2);
//		s2.selectByIndex(3);
//		boolean multiple2 = s2.isMultiple();
//		System.out.println(multiple2);
//		List<WebElement> options2 = s2.getOptions(); 
//		int size2 = options2.size();
//		System.out.println(size2);
//		
//		
//		
//		
//		WebElement element4 = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
//		Select s4 = new Select(element4);
//		s2.selectByIndex(3);
//		boolean multiple4 = s4.isMultiple();
//		System.out.println(multiple4);
//		List<WebElement> options4 = s4.getOptions(); 
//		int size4 = options4.size();
//		System.out.println(size4);
//		
//		
//		WebElement element5 = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
//		Select s5 = new Select(element5);
//		s5.selectByIndex(3);
//		boolean multiple5 = s5.isMultiple();
//		System.out.println(multiple5);
//		List<WebElement> options5 = s5.getOptions(); 
//		int size5 = options5.size();
//		System.out.println(size5);
//		
//		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}
	

}
