package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
private WebDriver driver;

private By username = By.id("user-name");
private By password = By.id("password");
private By loginbutton = By.id("login-button");


public Loginpage(WebDriver driver) {
	this.driver = driver;
}
public String getLoginPageTitle() {
	return driver.getTitle();
}
public void enterUserName(String usname) {
	driver.findElement(username).sendKeys(usname);
}

public void enterPassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);
}

public void clickOnLogin() {
	driver.findElement(loginbutton).click();
}

}

