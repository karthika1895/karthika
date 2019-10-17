package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snap1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement btnWomen = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btnWomen).perform();	
		WebElement btnFoot = driver.findElement(By.xpath("//span[text()='Footwear']"));
		btnFoot.click();
		WebElement btnHeel = driver.findElement(By.xpath("//span[text()='Heels']"));
		btnHeel.click();
	}

}
