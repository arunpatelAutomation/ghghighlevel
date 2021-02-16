/*
Author name - Arun Patel
*/

package com.ghg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WaterUseF13 extends TestBase {

	public WaterUseF13() {
		super();
	}

	WebElement e;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		driver.findElement(By.xpath("//a[normalize-space()='OK']")).click();

		WebElement e = driver.findElement(By.xpath("//span[@id='mainContentPlaceHolder_GridRight_lblGroupName2_0']"));
		Thread.sleep(2000);
		e = driver.findElement(By.xpath("//span[@id='mainContentPlaceHolder_GridRight_lblGroupName2_1']"));
		ScrollWindow.scrollIntoView(e, driver);
		e.click();
		Thread.sleep(2000);
	}

	@Test(priority = 1, groups = "Water Use F1-3")
	public void ReportF1() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'F-1')]")).click();
		Thread.sleep(2000);
		WebElement F1 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(F1.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 2, groups = "Water Use F1-3")
	public void ReportF2() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'F-2')]")).click();
		Thread.sleep(2000);
		WebElement F2 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(F2.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 3, groups = "Water Use F1-3")
	public void ReportF3() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'F-3')]")).click();
		Thread.sleep(2000);
		WebElement F3 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(F3.isDisplayed());
		Thread.sleep(2000);
	}

	@AfterMethod
	public void teardown() {

		driver.close();
	}

}
