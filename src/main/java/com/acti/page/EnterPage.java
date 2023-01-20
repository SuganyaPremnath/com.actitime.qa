package com.acti.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;


/*
 * script:EnterPage
 * Description:home Page Elements and methods
 * Developed by :suganya
 * Verified by:Suganya
*/

public class EnterPage extends DriverScript {

//**************	page elements *********************//
	
	@FindBy(xpath = "//a[@class='userProfileLink username ']")WebElement userprofilelink;
	@FindBy(id = "logoutLink")WebElement logoutlink;
	//**************	page initialisation *********************//	
	
	public EnterPage() throws IOException{
	PageFactory.initElements(driver,this);
	
}
	//**************	page methods *********************//
	
	public String userprofile() {
		return userprofilelink.getText();
	}
	public void logout() {
		logoutlink.click();
	}
	
	

}
