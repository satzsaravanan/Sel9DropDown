package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {

public static void main(String[] args) throws Throwable {
	

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\eclipse-workspace\\SeleniumDay9\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.facebook.com/");
		
		WebElement createacc = driver.findElement(By.id("u_0_2"));
		createacc.click();
		
		Thread.sleep(5000);

		WebElement year= driver.findElement(By.id("year"));
			Select s = new Select(year);
			
	List<WebElement> option = s.getOptions();
	
	for (int i = 0; i < option.size(); i++) {
		WebElement eachOption = option.get(i);
		String text = eachOption .getAttribute("text");
		System.out.println(text);
	}
			
			
		}
}
