package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.homedepot.com/");
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='headerSearch']"));
		txtSearch.sendKeys("fan");
		Thread.sleep(2000);
		WebElement btnSearch = driver.findElement(By.xpath("//button[@id='headerSearchButton']"));
		btnSearch.click();
		WebElement btnFan = driver.findElement(By.xpath("(//span[@class='pod-plp__brand-name'])[1]"));
		btnFan.click();
		WebElement btnCart = driver.findElement(By.xpath("(//span[@class='bttn__content'])[5]"));
		btnCart.click();
		WebElement btnFra = driver.findElement(By.xpath("//iframe[@class='thd-overlay-frame']"));
		
		driver.switchTo().frame(btnFra);
		WebElement txt = driver.findElement(By.xpath("//div[@class='u__bold u__text-align--left']"));
		String price = txt.getText();
		System.out.println(price);
		
		
	}

}
