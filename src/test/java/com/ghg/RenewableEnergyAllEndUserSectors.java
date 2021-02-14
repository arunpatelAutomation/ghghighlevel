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

public class RenewableEnergyAllEndUserSectors {
	WebDriver driver;
	WebElement e;

	@BeforeMethod()
	public void Launchurl() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Implicit wait for 10 seconds ---dynamic wait
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://ctsedwweb.ee.doe.gov/Annual/Report/report.aspx");
		driver.findElement(By.xpath("//a[normalize-space()='OK']")).click();

	
		driver.findElement(By.xpath("//span[@id='mainContentPlaceHolder_GridLeft_lblGroupName2_0']")).click();
		Thread.sleep(2000);
		e = driver.findElement(By.xpath("//span[@id='mainContentPlaceHolder_GridLeft_lblGroupName2_1']"));
		ScrollWindow.scrollIntoView(e, driver);
				e.click();
		Thread.sleep(2000);

	}

	@Test(priority = 1, groups = "Renewable Energy All End User sectors A9-A14")
	public void reportA9() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'A-9')]")).click();
		Thread.sleep(2000);
		WebElement A9 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A9.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 2, groups = "Renewable Energy All End User sectors A9-A14")
	public void reportA10() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'A-10')]")).click();
		Thread.sleep(2000);
		WebElement A10 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A10.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 3, groups = "Renewable Energy All End User sectors A9-A14")
	public void reportA11() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'A-11')]")).click();
		Thread.sleep(2000);
		WebElement A11 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A11.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 4, groups = "Renewable Energy All End User sectors A9-A14")
	public void reportA12() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'A-12')]")).click();
		Thread.sleep(2000);
		WebElement A12 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A12.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 5, groups = "Renewable Energy All End User sectors A9-A14")
	public void reportA13() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'A-13')]")).click();
		Thread.sleep(2000);
		WebElement A13 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A13.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 6, groups = "Renewable Energy All End User sectors A9-A14")
	public void reportA14() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'A-14')]")).click();
		Thread.sleep(2000);
		WebElement A14 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(A14.isDisplayed());
		Thread.sleep(2000);
	}

	@AfterMethod
	public void teardown()  {
			
		driver.close();
	}

}
