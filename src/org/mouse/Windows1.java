package org.mouse;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		txtSearch.sendKeys("Iphones 7");
		Thread.sleep(2000);
		WebElement btnSearch =driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		btnSearch.click();
		WebElement btnPhno = driver.findElement(By.xpath("(//p[@class='product-title '])[1]"));
		btnPhno.click();
		String pwid = driver.getWindowHandle();
		Set<String> chwid = driver.getWindowHandles();
		for(String v:chwid) {
			if(!v.equals(pwid)) {
				driver.switchTo().window(v);
			}
		}
		WebElement btnCart = driver.findElement(By.xpath("//div[@class='mmm col-xs-6 btn btn-xl btn-theme-secondary rippleWhite buyLink']"));
		btnCart.click();
		WebElement txt = driver.findElement(By.xpath("(//span[@class='price'])[1]"));
		String pri = txt.getText();
		System.out.println(pri);

	}

}
