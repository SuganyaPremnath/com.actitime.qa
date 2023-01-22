package com.acti.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TasksPage extends DriverScript  {
	//**************	page elements *********************//

	
	@FindBy(xpath="//div[@class='title ellipsis']")WebElement addcustomer;
	@FindBy(xpath="//div[@class='item createNewCustomer']")WebElement createcustomer;
	@FindBy(xpath = "( //input[@placeholder='Enter Customer Name'])[2]")WebElement entercustomer;
	@FindBy(xpath= "//textarea[@class='textarea' and @placeholder='Enter Customer Description']")WebElement textarea;
	@FindBy(xpath = "//div[@class='components_button_label' and text()='Create Customer']")WebElement newcustomer;
	@FindBy(xpath="//span[@class='innerHtml']")WebElement confirmation;
	//**************	page initialization *********************//		
public TasksPage() throws Exception{
	PageFactory.initElements(driver,this);
	
}
//**************	page methods *********************//
public void newcustomer() {
	addcustomer.click();
}
public void customercreation() {
	createcustomer.click();
}
public void entercustomername(String name) {
	entercustomer.sendKeys(name);
}
public void textareatext(String description) {
	textarea.sendKeys(description);
}
public void newcustomercreated() {
	newcustomer.click();
}
public String creationconfirmation() {
	return confirmation.getText();
	
}

}
