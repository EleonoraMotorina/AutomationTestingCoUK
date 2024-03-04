package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class AccordionPage {

	public WebDriver driver;

	By accordionElements = By.className("accordion-header");

	public AccordionPage(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getAllaccordionElements() {
		return driver.findElements(accordionElements);
	}
}
