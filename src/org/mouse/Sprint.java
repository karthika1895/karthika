package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sprint.com/");
		WebElement btnShop = driver.findElement(By.xpath("(//a[@class='sprint-menu__root-link'])[2]"));
		Actions acc = new Actions(driver);
		acc.moveToElement(btnShop).perform();
		WebElement btnUn = driver.findElement(By.xpath("(//a[@class='js-nav-link'])[12]"));
		acc.moveToElement(btnUn).perform();
		
		
		
	}

}
