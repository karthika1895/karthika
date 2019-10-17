package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	    driver.manage().window().maximize();
	    driver.switchTo().frame("login_page");
	    WebElement txtLog = driver.findElement(By.name("fldLoginUserId"));
	    txtLog.sendKeys("karthika");
	    WebElement btnCon = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
	    btnCon.click();
	    WebElement txtPass = driver.findElement(By.xpath("(//input[@class='input_password'])[2]"));
	    txtPass.sendKeys("689902");
	    driver.switchTo().defaultContent();
	}
	

}
