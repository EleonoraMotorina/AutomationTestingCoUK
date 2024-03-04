import browserSettings.BrowserSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ContactFormPage;
import pageObjects.DropdownCheckboxesPage;
import pageObjects.NavigationPage;

import java.io.IOException;

public class DropdownCheckboxesTest extends BrowserSettings {

    public DropdownCheckboxesTest() throws IOException {
        super();
    }

    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        driver.close();
        driver = null;
    }

    @Test
    public void dataEntryForm() throws InterruptedException {

        //switch to the Contact form page
        NavigationPage navigation = new NavigationPage(driver);
        navigation.getDropdownLink().click();
        Thread.sleep(3000);

        //Interaction with Radio Buttons and Checkboxes
        DropdownCheckboxesPage userInteractions  = new DropdownCheckboxesPage(driver);
        userInteractions.getLowButton().click();
        userInteractions.getHighButton().click();
        userInteractions.getCheckboxBlue().click();
        userInteractions.getCheckboxGreen().click();

        //interaction with dropdown  menu
        userInteractions.getAnimalsLink().click();
        userInteractions.getAnimalSelest().click();
        Thread.sleep(2000);
    }
}
