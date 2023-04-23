package com.web.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBookingPage {

	private By fromCity = By.xpath("(//input[@class='select_CTXT'])[1]");
	private By today= By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']");
	private By search = By.xpath("(//input[@type='submit'])[1]");
	private By fromCityList = By.xpath("//div[@id='dropdownGroup1']//li//a");
	
	private By toCityList = By.xpath("(//td[@class='mapbg'])[2]//li//a");

	WebDriver driver = null;


	public void setUP() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void selectCityFrom(String fromCitySelect) {
		driver.findElement(fromCity).click();
		List<WebElement> fromCitys = driver.findElements(fromCityList);
		for (int i = 0; i <= fromCitys.size() - 1; i++) {
			if (fromCitys.get(i).getText().trim().equalsIgnoreCase(fromCitySelect)) {
				fromCitys.get(i).click();
				break;
			}
		}
	}

	public void selectCityTO(String toCitySelect) throws InterruptedException {
		Thread.sleep(2000);
		//driver.findElement(toCity).click();
		List<WebElement> toCitys = driver.findElements(toCityList);
		for (int i = 0; i <= toCitys.size() - 1; i++) {
			if (toCitys.get(i).getText().trim().equalsIgnoreCase(toCitySelect)) {
				toCitys.get(i).click();
				break;
			}
		}
		driver.findElement(today).click();
		
	}
	
	public void search() {
		driver.findElement(search).click();
	}
}
