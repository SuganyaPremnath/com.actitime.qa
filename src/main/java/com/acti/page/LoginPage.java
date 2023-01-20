package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * script:LoginPage
 * Description:Login Page Elements and methods
 * Developed by :suganya
 * Verified by:Suganya
*/

public class LoginPage extends DriverScript {

	
	

	@FindBy(id="username")WebElement textboxUsername;
	@FindBy(name="pwd")WebElement textboxPasssword;
	@FindBy(id="keepLoggedInCheckBox")WebElement radiobutton;
	@FindBy(xpath="//div[text()='Login ']")WebElement loginclick;
	@FindBy(xpath="//div[@class='atLogoImg']")WebElement displaylogo;
	

	
public LoginPage() throws Exception{
	PageFactory.initElements(driver,this);
	
}
public void enterusername(String username) {
	textboxUsername.sendKeys(username);
	
}
public void enterpassword(String password) {
	textboxPasssword.sendKeys(password);
}
public void clickradiobutton() {
	
	radiobutton.click();
}
public void loginclickbutton() {
	loginclick.click();
}
public boolean displaylogopic() {
	return displaylogo.isDisplayed();
}
public String returntitle() {
	return driver.getTitle();
}
	
	
}


