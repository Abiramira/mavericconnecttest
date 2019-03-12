package com.maveric.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MavericHomePage {
	
	
	By qmsCheckEle = By.xpath("//a[text()='QMS']");
	WebDriver driver;
	WebDriverWait wait;
	
	
	public MavericHomePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public String waitForQmsDisplayAndGetTitle()
	{
		
		wait.until(ExpectedConditions.presenceOfElementLocated(qmsCheckEle));
		return driver.getTitle();
	}

}
