package org.mouse;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Green2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(2000);
		WebElement btnCourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btnCourse);
		Thread.sleep(2000);
		WebElement btnData = driver.findElement(By.xpath("//span[text()='Data Warehousing Training ']"));
		acc.moveToElement(btnData).perform();;
		Thread.sleep(2000);
	    WebElement btnMicro = driver.findElement(By.xpath("//span[text()='Microstrategy Training']"));
		btnMicro.click();
		
	
	}}
