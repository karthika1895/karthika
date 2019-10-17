package org.mouse;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    String pwid = driver.getWindowHandle();
	    driver.manage().window().maximize();
	    WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    txtSearch.sendKeys("iphone");
	    WebElement btnSearch = driver.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
	    btnSearch.click();
	    Thread.sleep(2000);
	    WebElement btnPhno = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
	    btnPhno.click();
	    Set<String> chid = driver.getWindowHandles();
	    for(String v:chid) {
	    	if(!v.equals(pwid)) {
	    		driver.switchTo().window(v);
	    	}
	    }
      WebElement btnCart = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
      btnCart.click();
	  WebElement btnCar = driver.findElement(By.xpath("//a[@id='nav-cart']"));
	  btnCar.click();
	  WebElement txt = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold']"));
	  String price = txt.getText();
	  System.out.println(price);
	}

}
