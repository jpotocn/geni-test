import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.*;

import java.util.logging.Logger;

public class SupplierChangeTest extends SeleniumTest {


    private final static Logger LOGGER = Logger.getLogger(Logger.class.getName());

    private String electricityRadio = "EnergyType-ElectricityType";
    private String surname = "LastName";
    private String name = "FirstName";
    private String email = "Email";
    private String phone = "Telephone";
    private String acceptDataProcessing = "AcceptDataProcessing";
    private String fillTheForm = "type1";
    private String submit = "#page > div > section > article > form > div.buttons > div > button";
    private String errorSign = "#page > div > section > article > form > div:nth-child(7) > div > div > div.cs-types-error-row > div > div > img";


    public boolean isInitialized() {
        return !driver.getCurrentUrl().contains("change-supplier.xhtml");
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
        driver.findElement(By.id(electricityRadio)).click();
        driver.findElement(By.id(name)).sendKeys("testna stranka");
        CommonUtilis.wait(100);
        driver.findElement(By.id(surname)).sendKeys("testna stranka");
        CommonUtilis.wait(100);
        driver.findElement(By.id(email)).sendKeys("testniNaslov@gmail.com");
        CommonUtilis.wait(100);
        driver.findElement(By.id(phone)).sendKeys("040123456");
        CommonUtilis.wait(100);
        driver.findElement(By.id(acceptDataProcessing)).click();
        CommonUtilis.wait(100);
        driver.findElement(By.cssSelector(submit)).click();
        CommonUtilis.wait(100);

    }

    @Test
    public void test_02() throws Exception {
        System.out.println("test 02");
        if (driver.findElement(By.cssSelector(errorSign)).isDisplayed()) {
            driver.findElement(By.id(fillTheForm)).click();
            driver.findElement(By.cssSelector(submit)).click();
        } else {
            driver.findElement(By.cssSelector(submit)).click();
        }
    }

}
