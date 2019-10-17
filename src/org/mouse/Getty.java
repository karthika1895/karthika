package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getty {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		Thread.sleep(3000);
		WebElement btnEdit = driver.findElement(By.xpath("(//a[@href='/editorial-images'])[2]"));
		btnEdit.click();
		Thread.sleep(3000);
		WebElement btnEnter = driver.findElement(By.xpath("(//a[@class='landing-secondary-menu__link landing-secondary-menu__link--unselected text-link--sly'])[3]"));
		btnEnter.click();
	}


	
}
