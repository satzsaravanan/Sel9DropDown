package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\eclipse-workspace\\SeleniumDay9\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.facebook.com/");
		
		WebElement createacc = driver.findElement(By.id("u_0_2"));
		createacc.click();
		
		Thread.sleep(5000);
		
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		
		Select s = new Select( day);
		List<WebElement> option = s.getOptions();
		
		for (int i = 0; i < option.size(); i++) {
			if (i%2!=0) {
				WebElement eachoption= option.get(i);
				String text = eachoption.getText();
				System.out.println(text);
				
			}
		}
	}
}
