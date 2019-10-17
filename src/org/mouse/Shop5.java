package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shop5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement btnMobile = driver.findElement(By.xpath("//li[@id='nav_44']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btnMobile).perform();
		Thread.sleep(3000);
		WebElement btnRange = driver.findElement(By.xpath("//a[@href='//www.shopclues.com/mobiles-smartphones.html?sort_by=bestsellers&sort_order=desc&sort_price[]=5000.00-6999.00&sort_price[]=7000.00-9999.00&fsrc=sort_price']"));
		btnRange.click();
		
	}

}
