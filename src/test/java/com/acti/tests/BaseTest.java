package com.acti.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.page.EnterPage;
import com.acti.page.LoginPage;

public class BaseTest extends DriverScript {

	public BaseTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPage lp;
	EnterPage e;
	
	@BeforeMethod
	public void setup() throws Exception {
		initApplication();
		lp = new LoginPage();
		e = new EnterPage();
	}
	@AfterMethod
	public void tearDown() {
		closeApplication();
	}
}
