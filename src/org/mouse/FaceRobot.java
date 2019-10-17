package org.mouse;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class FaceRobot {
	public static void main(String[] args) throws InterruptedException, AWTException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(2000);
	   WebElement txtEmail = driver.findElement(By.id("email"));
	   txtEmail.sendKeys("karthika");
	   

}
