package com.ghg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacilityInvestmentGrossSquareFtOtherMetricsG13 extends TestBase {

	public FacilityInvestmentGrossSquareFtOtherMetricsG13() {
		super();
	}

	WebElement e;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		driver.findElement(By.xpath("//a[normalize-space()='OK']")).click();

		WebElement e = driver.findElement(By.xpath("//span[@id='mainContentPlaceHolder_GridRight_lblGroupName2_0']"));
		Thread.sleep(2000);
		e = driver.findElement(By.xpath("//span[@id='mainContentPlaceHolder_GridRight_lblGroupName2_2']"));
		ScrollWindow.scrollIntoView(e, driver);
		e.click();
		Thread.sleep(2000);
	}

	@Test(priority = 1, groups = "Water Use G1-3")
	public void ReportG1() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'G-1')]")).click();
		Thread.sleep(2000);
		WebElement G1 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(G1.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 2, groups = "Water Use G1-3")
	public void ReportG2() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'G-2')]")).click();
		Thread.sleep(2000);
		WebElement G2 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(G2.isDisplayed());
		Thread.sleep(2000);
	}

	@Test(priority = 3, groups = "Water Use G1-3")
	public void ReportG3() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'G-3')]")).click();
		Thread.sleep(2000);
		WebElement G3 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(G3.isDisplayed());
		Thread.sleep(2000);
	}

	@AfterMethod
	public void teardown() {

		driver.close();
	}

}
