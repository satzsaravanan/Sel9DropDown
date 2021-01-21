package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task6 {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\eclipse-workspace\\SeleniumDay9\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select s = new Select(country);
		List<WebElement> options = s.getOptions();
		
for (WebElement x : options) {
	System.out.println(x.getAttribute("text"));
}
		
	}
}
