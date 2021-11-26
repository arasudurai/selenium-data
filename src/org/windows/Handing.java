package org.windows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handing {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARASU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);



		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("ipad",Keys.ENTER);
		WebElement ipad = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		ipad.click();
		WebElement search2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search2.sendKeys("iphone13",Keys.ENTER);
		WebElement iphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		iphone.click();
		WebElement search3 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search3.sendKeys("samsung tv",Keys.ENTER);
		WebElement samsung = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		samsung.click();


		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		List <String> a = new ArrayList<>();
		a.addAll(all);
		driver.switchTo().window(a.get(2));
		WebElement text = driver.findElement(By.xpath("//span[@id='productTitle']"));
		String text2 = text.getText();
		System.out.println(text2);

	}








}





