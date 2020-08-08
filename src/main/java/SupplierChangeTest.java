import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.*;

import java.util.logging.Logger;

public class SupplierChangeTest extends SeleniumTest {


    private final static Logger LOGGER = Logger.getLogger(Logger.class.getName());

    @FindBy(id = "EnergyType-ElectricityType")
    private WebElement electricityRadio;

    @FindBy(id = "FirstName")
    private WebElement name;

    @FindBy(id = "LastName")
    private WebElement surname;

    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(name = "Telephone")
    private WebElement phone;

    @FindBy(name = "AcceptDataProcessing")
    private WebElement acceptDataProcessing;

    @FindBy(xpath = "//*[@id=\"type1\"]")
    private WebElement fillTheForm;

    @FindBy(css = "submit")
    private WebElement submit;


    public boolean isInitialized() {
        return name.isDisplayed();
    }

    @Test
    public void test_00() throws Exception {

        try {
            setUp();
        } catch (Exception ex) {
            ex.fillInStackTrace();
        }


        if (!isInitialized()) {
            LOGGER.info("Unable to login using specified credentials! Tests won't be executed.");
            driver.close();
            System.exit(1);
        }
    }

    @Test
    public void test_01() throws Exception {


    }

}
