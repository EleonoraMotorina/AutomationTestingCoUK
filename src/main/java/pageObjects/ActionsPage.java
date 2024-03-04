package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ActionsPage {

	public WebDriver driver;

	By dragElementRight = By.cssSelector("#main [class] [ondrop='drop\\(event\\)']:nth-child(2)");
	By dragElementLeft = By.cssSelector("#main [class] [ondrop='drop\\(event\\)']:nth-child(3)");
	By doubClick = By.id("doubClickStartText");
	By holdDownElement = By.id("click-box");
	By clickAndShift = By.cssSelector("[onmousedown] #doubClickStartText");

	public ActionsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDragElementRight() {
		return driver.findElement(dragElementRight);
	}

	public WebElement getDragElementLeft() {
		return driver.findElement(dragElementLeft);
	}

	public WebElement getDoubClick() {
		return driver.findElement(doubClick);
	}

	public WebElement getHoldDownElement() {
		return driver.findElement(holdDownElement);
	}

	public WebElement getClickAndShift() {
		return driver.findElement(clickAndShift);
	}

}