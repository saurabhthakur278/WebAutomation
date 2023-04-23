package com.web.test;

import org.testng.annotations.Test;

import com.web.pages.Ligft;

public class qqq {

	Ligft l1=new Ligft();
	
	@Test(priority = 1)
	public void openApplication() {
		l1.setup();
	}
	@Test(priority = 2)
	public void mw()
	{
		l1.selectCityFrom("Delhi (DEL)");
	}
}
