package org.mouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement btnacc = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btnacc).perform();
		Thread.sleep(2000);
		WebElement btnSign = driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
		btnSign.click();
		Thread.sleep(2000);
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='ap_email']"));
		txtEmail.sendKeys("karthikasivam95@gmail.com");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		WebElement btnCon = driver.findElement(By.xpath("//input[@id='continue']"));
		btnCon.click();
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='ap_password']"));
		acc.contextClick(txtPass).perform();
		for(int i=0;i<=3;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		}

}
