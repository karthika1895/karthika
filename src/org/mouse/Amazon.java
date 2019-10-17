package org.mouse;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		Thread.sleep(3000);
		WebElement btnacc = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btnacc).perform();
		Thread.sleep(3000);
		WebElement btnStart = driver.findElement(By.xpath("//a[@class='nav-a']"));
		btnStart.click();
		Thread.sleep(3000);
		
		WebElement btnSign = driver.findElement(By.xpath("//a[@class='a-link-emphasis']"));
		btnSign.click();
		WebElement btnAcc = driver.findElement(By.id("ap_email"));
		btnAcc.sendKeys("9080235247");
		WebElement btnCon = driver.findElement(By.id("continue"));
		btnCon.click();
		
		
		
	}
}