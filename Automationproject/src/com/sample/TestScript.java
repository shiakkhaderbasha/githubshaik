package com.sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript 
{
	public static void main(String [] args)
	{
		System.getProperty("webdriver.chrome.driver","C://drivers//chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("www.google.com");
		driver. manage().window().maximize();
		driver.navigate().refresh();
		driver.close();
		
		
	}

}
