package com.ghg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CTSlogin {
	//test case for CTS
	
	@Test(invocationCount=10)
	public void ctslogin() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Implicit wait for 10 seconds ---dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// To launch softwaretestingmaterial.com
		driver.get("https://www.eisa-432-cts.eere.energy.gov/EISACTS_MIR/Login.aspx");
		WebElement username = driver.findElement(By.id("ctl00_contentbody_txtEmailAddress"));
				username.clear();
				Thread.sleep(60000);
				username.sendKeys("arunkumar.patel@ee.doe.gov");
				WebElement password = driver.findElement(By.id(
				"ctl00_contentbody_ZMbNOEXnLFIMpoBoGQ1ShzsTJIRKFpxerv2llRbl60uEgvH4PMsjJXQuiLgVMQIhFLDbkx2VRUhlAXK3qDbdhbBWTF5iztPxtvlGQWjN4QpbE0c0w86kFqDZO4T725W"));
				password.clear();
				Thread.sleep(60000);
						password.sendKeys("Actionet8");
						Thread.sleep(60000);
		driver.findElement(By.id("ctl00_contentbody_btnLogin")).click();
		// Wait for 5 seconds
		Thread.sleep(120000);
		driver.findElement(By.id("topNav2")).click();
		Thread.sleep(120000);
		Select agency = new Select(driver.findElement(By.xpath("//select[@id='ctl00_contentbody_ucSearchControl_ucAgencySelectionControl_ddl_TopAgency']")));
		agency.selectByValue("1");
		Thread.sleep(120000);
		Select subagency = new Select(driver.findElement(By.id("ctl00_contentbody_ucSearchControl_ucAgencySelectionControl_lb_SubAgency")));
		subagency.selectByIndex(0);
		Thread.sleep(180000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_contentbody_ucSearchControl_btnApply']")).click();
		
		////span[@id='ctl00_contentbody_gvFacilityList_ctl03_lblFacilityID']
		Thread.sleep(180000);
		driver.findElement(By.xpath("//span[contains(text(),'AZ0318')]/ancestor::tr[1]/td[5]")).click();
				
		Thread.sleep(180000);
		//span[@id='ctl00_contentbody_tabPageControl_ucCoveredFacilityControl_lbl_ReadOnlyAgency']
		String Agency_name=driver.findElement(By.xpath("//span[@id='ctl00_contentbody_tabPageControl_ucCoveredFacilityControl_lbl_ReadOnlyAgency']")).getText();
		
		
		Assert.assertEquals(Agency_name, "DHS/CBP - Customs and Border Protection");
		
		Thread.sleep(120000);
		driver.close();
		
	}
			

}
