package com.Smitha.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo001 
{
	public WebDriver myD;
	
	@Test
	public void TS001() throws InterruptedException
	{	

		System.setProperty("webdriver.chrome.driver","C:\\SVN\\Automation\\Automation_Course\\chromedriver_win32\\chromedriver.exe");
		myD=new ChromeDriver();
		myD.get("https://www.amazon.in/");
		String vTitle=myD.getTitle();
		System.out.println("The Title is "+vTitle);
		Thread.sleep(5000);
		myD.close();
		 
	}
	
	@BeforeTest
	public void openBrow()
	{
		System.out.println("Before Test");
	}	
	
	@AfterTest
	public void closeBrow()
	{

		System.out.println("After Test");
	}
}

