package org.mouse;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Green1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(2000);
		WebElement btnCourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btnCourse);
		Thread.sleep(2000);
		WebElement btnOracle = driver.findElement(By.xpath("//span[text()='Oracle Training ']"));
		acc.moveToElement(btnOracle).perform();;
		Thread.sleep(2000);
		WebElement btnSel = driver.findElement(By.xpath("//span[text()='Software Testing Training ']"));
		acc.moveToElement(btnSel).perform();
		WebElement btnSele = driver.findElement(By.xpath("//span[text()='Selenium Training']"));
		btnSele.click();
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'Our')]"));
		String para = txt.getText();
		System.out.println(para);
		driver.quit();
	
	}}
