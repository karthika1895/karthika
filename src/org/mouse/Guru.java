package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru {
     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions acc = new Actions(driver);
		acc.dragAndDrop(src,des).perform();
		Thread.sleep(2000);
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement des1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		acc.dragAndDrop(src1,des1).perform();
		Thread.sleep(2000);
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement des2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		acc.dragAndDrop(src2,des2).perform();
		Thread.sleep(2000);
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement des3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		acc.dragAndDrop(src3,des3).perform();
		
	}	

}
