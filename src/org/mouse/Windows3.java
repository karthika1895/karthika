package org.mouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows3 {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/\r\n");
		WebElement btnCon = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions ac = new Actions(driver);
		ac.contextClick(btnCon).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String pwid = driver.getWindowHandle();
		Set<String> chwid = driver.getWindowHandles();
		for(String v:chwid) {
			if(!v.equals(pwid)) {
				driver.switchTo().window(v);
			}
		}
		WebElement btnCou = driver.findElement(By.xpath("//p[@class='text-left-contact']"));
		TakesScreenshot tk =(TakesScreenshot)driver;
		 File src = tk.getScreenshotAs(OutputType.FILE);
		 System.out.println(src);
		 File des = new File("C:\\Java\\win.png");
		 FileUtils.copyFile(src, des);
		 
				 
	}

}
