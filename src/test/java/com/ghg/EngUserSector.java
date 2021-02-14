package com.ghg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EngUserSector {
	
	WebDriver driver;
	
	@BeforeMethod
	public void LaunchURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Implicit wait for 10 seconds ---dynamic wait
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://ctsedwweb.ee.doe.gov/Annual/Report/report.aspx");
		driver.findElement(By.xpath("//a[normalize-space()='OK']")).click();
		
		WebElement e=driver.findElement(By.xpath("//span[@id='mainContentPlaceHolder_GridLeft_lblGroupName2_0']"));
		Thread.sleep(2000);
		ScrollWindow.scrollIntoView(e, driver);
			
		Thread.sleep(2000);
	}
	
	
	@Test
	public void ReportA1() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'A-1')]")).click();
		Thread.sleep(2000);
		WebElement A1 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A1.isDisplayed());
		//Thread.sleep(2000);
		System.out.println("Report A1 pass");
	}
	@Test
	public void ReportA2() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'A-2')]")).click();
		Thread.sleep(2000);
		WebElement A2 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A2.isDisplayed());
		//Thread.sleep(2000);
		System.out.println("Report A2 pass");
	}
	
	@Test
	public void ReportA3() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'A-3')]")).click();
		Thread.sleep(2000);
		WebElement A3 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A3.isDisplayed());
		//Thread.sleep(2000);
		System.out.println("Report A3 pass");
	}
	
	@Test
	public void ReportA4() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'A-4')]")).click();
		Thread.sleep(2000);
		WebElement A4 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A4.isDisplayed());
		//Thread.sleep(2000);
		System.out.println("Report A4 pass");
	}
	
	@Test
	public void ReportA5() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'A-5')]")).click();
		Thread.sleep(2000);
		WebElement A5 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A5.isDisplayed());
		//Thread.sleep(2000);
		System.out.println("Report A5 pass");
	}
	
	@Test
	public void ReportA6() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'A-6')]")).click();
		Thread.sleep(2000);
		WebElement A6 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A6.isDisplayed());
		//Thread.sleep(2000);
		System.out.println("Report A6 pass");
	}
	
	
	@Test
	public void ReportA7() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'A-7')]")).click();
		Thread.sleep(2000);
		WebElement A7 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A7.isDisplayed());
		//Thread.sleep(2000);
		System.out.println("Report A7 pass");
	}
	
	@Test
	public void ReportA8() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'A-8')]")).click();
		Thread.sleep(2000);
		WebElement A8 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A8.isDisplayed());
		//Thread.sleep(2000);
		System.out.println("Report A8 pass");
	}
	
	@Test
	public void ReportA15() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'A-15')]")).click();
		Thread.sleep(2000);
		WebElement A15 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A15.isDisplayed());
		//Thread.sleep(2000);
		System.out.println("Report A15 pass");
	}
	
			
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
