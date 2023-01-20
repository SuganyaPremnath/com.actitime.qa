package com.acti.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
/*
 * script:LoginPage
 * Description:Login Page Elements and methods
 * Developed by :suganya
 * Verified by:Suganya
*/
public class LoginpageTest extends BaseTest {

	
public LoginpageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
@Test(priority = 1,enabled = true)
	public void testloginpage() throws Exception {
		
		String t = lp.returntitle();
		System.out.println(t);
		Assert.assertTrue(t.contains("Login"));
		
	}
@Test(priority = 2,enabled = true)
public void display() throws Exception {
	
	boolean l = lp.displaylogopic();
	System.out.println(l);
	Assert.assertTrue(l);
	
	
}
@Test(priority = 3,enabled = true)
public void loginmethod() throws Exception {
	
	lp.enterusername("admin");
	lp.enterpassword("manager");
	lp.loginclickbutton();
	
	String actual="John Doe";
	String expected = e.userprofile();
	System.out.println(expected);
	Assert.assertEquals(actual, expected);
	e.logout();
	
}

}
