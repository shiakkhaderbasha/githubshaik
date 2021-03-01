package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToGitHub 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://github.com/");
	driver.manage().window().maximize();
	driver.findElement(By.className("octicon octicon-three-bars color-text-white")).click();
	driver.findElement(By.linkText("/login")).click();
	driver.findElement(By.id("login_field")).sendKeys("Khada786r@gmail.com"+Keys.TAB+"Khader01@"+Keys.ENTER);
	Dimension d=new Dimension(500,500);
	driver.manage().window().setSize(d);
	driver.quit();
	
			
}
}
