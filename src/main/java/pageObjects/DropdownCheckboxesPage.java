package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownCheckboxesPage {

	public WebDriver driver;

	By lowButton = By.cssSelector("[for='demo-priority-low']");
	By highButton = By.cssSelector("[for='demo-priority-high']");
	By checkboxBlue = By.cssSelector("[for='cb_blue']");
	By checkboxGreen = By.cssSelector("[for='cb_green']");
	By animalsLink = By.linkText("Animals");
	By animalSelest = By.cssSelector("[onclick='menuClick2\\(\\)']");

	public DropdownCheckboxesPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLowButton() {
		return driver.findElement(lowButton);
	}

	public WebElement getHighButton() {
		return driver.findElement(highButton);
	}

	public WebElement getCheckboxBlue() {
		return driver.findElement(checkboxBlue);
	}

	public WebElement getCheckboxGreen() {
		return driver.findElement(checkboxGreen);
	}

	public WebElement getAnimalsLink() {
		return driver.findElement(animalsLink);
	}

	public WebElement getAnimalSelest() {
		return driver.findElement(animalSelest);
	}



}