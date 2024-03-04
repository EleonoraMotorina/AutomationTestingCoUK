package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactFormPage {

	public WebDriver driver;

	By firstName = By.name("first_name");
	By lastName = By.name("last_name");
	By emailAddress = By.name("email");
	By comments = By.name("message");
	By submitButton = By.cssSelector("[type='submit']");

	public ContactFormPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}

	public WebElement getLastName() {
		return driver.findElement(lastName);
	}

	public WebElement getEmailAddress() {
		return driver.findElement(emailAddress);
	}

	public WebElement getComments() {
		return driver.findElement(comments);
	}

	public WebElement getSubmitButton() {
		return driver.findElement(submitButton);
	}

}