package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shop6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement btnMobile = driver.findElement(By.xpath("//li[@id='nav_45']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btnMobile).perform();
		Thread.sleep(3000);
		WebElement btnGrainer = driver.findElement(By.xpath("//a[@href='//www.shopclues.com/weight-gainers.html?sort_by=bestsellers&sort_order=desc']"));
		btnGrainer.click();
		Thread.sleep(3000);
		WebElement btnFirst = driver.findElement(By.xpath("//span[text()='Sap Nutrition Mega Mass 4000 1Kg  Vanilla Flavour']"));
		btnFirst.click();
		WebElement btnCart = driver.findElement(By.xpath("//button[@id='add_cart']"));
		btnCart.click();
		
	}
	

}

