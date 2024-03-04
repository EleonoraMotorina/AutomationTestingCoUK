import browserSettings.BrowserSettings;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ActionsPage;
import pageObjects.NavigationPage;
import java.io.IOException;


public class ActionsTest extends BrowserSettings {

    public ActionsTest() throws IOException {
        super();
    }

    Actions actions;

    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
        actions = new Actions(driver);
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        driver.close();
        driver = null;
    }

    @Test
    public void ActionsTest() throws InterruptedException {

        //switch to the Actions page
        NavigationPage navigation = new NavigationPage(driver);
        navigation.getActionsLink().click();
        Thread.sleep(2000);

        //interaction with elements on the page
        ActionsPage actionableElements = new ActionsPage(driver);

        //object relocation
        WebElement dragElementFromRight = actionableElements.getDragElementRight();
        WebElement dragElementToLeft = actionableElements.getDragElementLeft();
        actions.dragAndDrop(dragElementFromRight, dragElementToLeft).perform();

        //double-click an item
        actions.doubleClick(actionableElements.getDoubClick()).perform();

        //Pressing and holding on an element
        actions.clickAndHold(actionableElements.getHoldDownElement()).perform();
        Thread.sleep(1000);

        //Pressing with SHIFT
        actions.keyDown(Keys.SHIFT).click(actionableElements.getClickAndShift()).keyUp(Keys.SHIFT).perform();
    }
}
