package com.ghg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrl {
	WebDriver driver;
public LaunchUrl(WebDriver driver) {
		this.driver=driver;
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Implicit wait for 10 seconds ---dynamic wait
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://ctsedwweb.ee.doe.gov/Annual/Report/report.aspx");
		driver.findElement(By.xpath("//a[normalize-space()='OK']")).click();
		
	}

}
