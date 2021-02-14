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

public class VehiclesandEquipmentD14 {
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
		e = driver.findElement(By.xpath("//span[@id='mainContentPlaceHolder_GridLeft_lblGroupName2_4']"));
		ScrollWindow.scrollIntoView(e, driver);
				e.click();
		Thread.sleep(2000);

	}

	@Test(priority = 1, groups = "Vehicles and Equipment D1-D3")
	public void ReportD1() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'D-1')]")).click();
		Thread.sleep(2000);
		WebElement D1 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(D1.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 2, groups = "Vehicles and Equipment D1-D3")
	public void ReportD2() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'D-2')]")).click();
		Thread.sleep(2000);
		WebElement D2 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(D2.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 3, groups = "Vehicles and Equipment D1-D3")
	public void ReportD3() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'D-3')]")).click();
		Thread.sleep(2000);
		WebElement D3 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(D3.isDisplayed());
		Thread.sleep(2000);
		String year = driver.findElement(By.xpath("//div[contains(text(),'Constant FY 2019')]")).getText();
		System.out.println(year);
		Assert.assertEquals(year,"Government-Wide Energy Use and Costs in Vehicle and Equipment by Energy Type, FY 2019 (in Adjusted Constant FY 2019 Dollars)" , "Year not matching for Report D3");
	}

		
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}

}
