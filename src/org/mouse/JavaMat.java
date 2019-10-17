package org.mouse;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaMat {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement btnX = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		btnX.click();
		WebElement txt = driver.findElement(By.xpath("//input[@name='q']"));
		txt.sendKeys("iphone");
		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		btnSearch.click();
		Thread.sleep(2000);
		WebElement btnI = driver.findElement(By.xpath("//div[text()='Apple iPhone 7 (Gold, 32 GB)']"));
		btnI.click();
		Thread.sleep(5000);
		TakesScreenshot tk = (TakesScreenshot)btnI;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File des = new File("C:\\Java\\phone.png");
		FileUtils.copyFile(src,des);
		
		
	}

}
