package org.mouse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		btn.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		WebElement btnSec = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		btnSec.click();
		WebElement btnCan = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btnCan.click();
		al.dismiss();
		WebElement btnTh = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		btnTh.click();
		WebElement btnPro = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnPro.click();
		al.sendKeys("Selenium Alert");
		al.accept();
		
	}

}