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

public class GoalSubjectBuildings extends TestBase {
	
	WebElement e;

	public GoalSubjectBuildings(){
		super();
	}
		
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
driver.findElement(By.xpath("//a[normalize-space()='OK']")).click();

	
		driver.findElement(By.xpath("//span[@id='mainContentPlaceHolder_GridLeft_lblGroupName2_0']")).click();
		Thread.sleep(2000);
		e = driver.findElement(By.xpath("//span[@id='mainContentPlaceHolder_GridLeft_lblGroupName2_2']"));
		ScrollWindow.scrollIntoView(e, driver);
				e.click();
		Thread.sleep(2000);

	}

	@Test(priority = 1, groups = "Goal Subject Buildings B1-B6")
	public void reportB1() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'B-1')]")).click();
		Thread.sleep(2000);
		WebElement B1 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(B1.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 2, groups = "Goal Subject Buildings B1-B6")
	public void reportB2() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'B-2')]")).click();
		Thread.sleep(2000);
		WebElement B2 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(B2.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 3, groups = "Goal Subject Buildings B1-B6")
	public void reportB3() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'B-3')]")).click();
		Thread.sleep(2000);
		WebElement B3 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(B3.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 4, groups = "Goal Subject Buildings B1-B6")
	public void reportB4() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'B-4')]")).click();
		Thread.sleep(2000);
		WebElement B4 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(B4.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 5, groups = "Goal Subject Buildings B1-B6")
	public void reportB5() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'B-5')]")).click();
		Thread.sleep(2000);
		WebElement B5 = driver.findElement(By.xpath("//a[normalize-space()='Apply']"));
		Assert.assertTrue(B5.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 6, groups = "Goal Subject Buildings B1-B6")
	public void reportB6() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'B-6')]")).click();
		Thread.sleep(2000);
		WebElement B6 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(B6.isDisplayed());
		Thread.sleep(2000);
	}

	@AfterMethod
	public void teardown() {
		
		driver.close();
	}

}
