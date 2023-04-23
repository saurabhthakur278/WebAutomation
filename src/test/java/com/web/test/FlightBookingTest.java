package com.web.test;

import org.testng.annotations.Test;

import com.web.pages.FlightBookingPage;

public class FlightBookingTest {

	FlightBookingPage fl = new FlightBookingPage();

	@Test(priority = 1)
	public void openApplication() {
		fl.setUP();
	}

	@Test(priority = 2)
	public void selectFromCity() {
		fl.selectCityFrom("Adampur (AIP)");
	}

	@Test(priority = 3)
	public void selectToCity() throws InterruptedException {
		fl.selectCityTO("Delhi (DEL)");
	}

	@Test(priority = 4)
	public void searchFlight() {
		fl.search();
	}

}
