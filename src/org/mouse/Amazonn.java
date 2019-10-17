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

public class Amazonn {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthi\\karthika\\MouseOver\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(3000);
		
		WebElement txt = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		txt.sendKeys("hp laptop");
		Thread.sleep(2000);
		WebElement btnLap = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
		btnLap.click();
		driver.get("https://www.snapdeal.com/search?keyword=hp%20laptop&santizedKeyword=&catId=&categoryId=0&suggested=false&vertical=&noOfResults=20&searchState=&clickSrc=go_header&lastKeyword=&prodCatId=&changeBackToAll=false&foundInAll=false&categoryIdSearched=&cityPageUrl=&categoryUrl=&url=&utmContent=&dealDetail=&sort=rlvncy");
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File des = new File("C:\\Java\\price.png");
		FileUtils.copyFile(src,des);
		
	
		
		
	}

}

