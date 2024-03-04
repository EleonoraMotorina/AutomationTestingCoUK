import browserSettings.BrowserSettings;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.AccordionPage;
import pageObjects.NavigationPage;

import java.io.IOException;
import java.util.List;

public class AccordionTest extends BrowserSettings {

    public AccordionTest() throws IOException {
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
    public void testAccordionFunctionality() throws InterruptedException {

        //switch to the Accordion page
        NavigationPage navigation = new NavigationPage(driver);
        navigation.getAccordionLink().click();
        Thread.sleep(1000);

        //interaction with Accordions elements
        AccordionPage accordion = new AccordionPage(driver);
        List<WebElement> accordionElements = accordion.getAllaccordionElements();
        for(WebElement element : accordionElements) {
            element.click();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
