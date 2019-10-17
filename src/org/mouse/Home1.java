package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		
		WebElement btnAll = driver.findElement(By.xpath("//a[@data-id='departmentsFlyout']"));
		Thread.sleep(3000);
		Actions acc = new Actions(driver);
		acc.moveToElement(btnAll).perform();
		WebElement btnPaint = driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		acc.moveToElement(btnPaint).perform();
		WebElement btnInt = driver.findElement(By.xpath("(//a[text()='Interior Paint'])[1]"));
		acc.moveToElement(btnInt).perform();
		WebElement btnCel = driver.findElement(By.xpath("(//a[text()='Ceiling Paint'])[1]"));
		btnCel.click();
		
		
	}

}
