import browserSettings.BrowserSettings;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ActionsPage;
import pageObjects.ContactFormPage;
import pageObjects.NavigationPage;

import java.io.IOException;

public class ContactFormTest extends BrowserSettings {

    public ContactFormTest() throws IOException {
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
        navigation.getContactUsLink().click();

        //form filling and submission
        ContactFormPage contactForm = new ContactFormPage(driver);
        contactForm.getFirstName().sendKeys("Joana");
        contactForm.getLastName().sendKeys("Smith");
        contactForm.getEmailAddress().sendKeys("joana@gmail.com");
        contactForm.getComments().sendKeys("Empty comments");
        contactForm.getSubmitButton().click();
    }
}
