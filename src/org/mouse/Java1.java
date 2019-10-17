package org.mouse;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.flipkart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement txt = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
	    js.executeScript("arguments[0].setAttribute('value','karthika@gmail.com')", txt);
	    WebElement pass = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
	    js.executeScript("arguments[0].setAttribute('value','karthika')", pass);
	    WebElement btn = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
	    js.executeScript("arguments[0].click()",btn); 
	    
	}
}
