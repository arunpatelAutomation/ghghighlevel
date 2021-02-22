/*
 * Autho=Arun Patel
 */

package com.ghg;

import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class GreenhouseGasEmission extends TestBase {

	public static Logger log =LogManager.getLogger(GreenhouseGasEmission.class.getName());
	
	public GreenhouseGasEmission() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		driver.findElement(By.xpath("//a[normalize-space()='OK']")).click();

		WebElement e = driver.findElement(By.xpath("//span[@id='mainContentPlaceHolder_GridRight_lblGroupName2_0']"));
		Thread.sleep(2000);
		ScrollWindow.scrollIntoView(e, driver);
		
		Thread.sleep(2000);
	}

	@Test(priority = 1, groups = "Greenhouse Gas Emission E1-E3")
	public void ReportE1() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'E-1')]")).click();
		Thread.sleep(2000);
		WebElement E1 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(E1.isDisplayed());
		// Thread.sleep(2000);
		log.info("Report E1 pass");
		log.error("Report E1 Fail");
	}

	@Test(priority = 2, groups = "Greenhouse Gas Emission E1-E3")
	private void ReportE2() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'E-2')]")).click();
		Thread.sleep(2000);
		WebElement E2 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(E2.isDisplayed());
		// Thread.sleep(2000);
		log.info("Report E2 pass");
	}

	@Test(priority = 3, groups = "Greenhouse Gas Emission E1-E3")
	public void ReportE3() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'E-3')]")).click();
		Thread.sleep(2000);
		WebElement E3 = driver.findElement(By.xpath("//span[normalize-space()='Report Filter/Options']"));
		Assert.assertTrue(E3.isDisplayed());
		// Thread.sleep(2000);
		log.info("Report E3 pass");
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
