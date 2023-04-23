package com.web.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ligft
{
	
	private By fromList =By.xpath("//div[@class=\"dropdownDiv\"]//ul//li");
	private By clickarrow=By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']");
	private By citilist=By.xpath("//div[@id=\"dropdownGroup1\"]//ul//li");
	
	
	WebDriver driver=null;
	public void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	
	public void selectCityFrom(String fromCitySelect) {
		driver.findElement(clickarrow).click();
		List<WebElement> list = driver.findElements(citilist);
		for(int i=0;i<=list.size();i++) {
			if(list.get(i).getText().trim().equalsIgnoreCase(fromCitySelect));
			list.get(i).click();
		}
		
		
	}
	
	
		
		
		
	}


