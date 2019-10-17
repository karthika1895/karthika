package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement btnX = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		btnX.click();
		WebElement btnHome = driver.findElement(By.xpath("//span[text()='Women']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btnHome).perform();
		Thread.sleep(3000);
		WebElement btnFoot = driver.findElement(By.xpath("(//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy'])[52]"));
		btnFoot.click();
		Thread.sleep(3000);
		WebElement btnHeel = driver.findElement(By.xpath("(//a[@class='_2SvCnW'])[1]"));
		btnHeel.click();
		
		
	}

}
