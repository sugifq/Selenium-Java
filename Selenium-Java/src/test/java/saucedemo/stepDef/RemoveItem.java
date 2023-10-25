package saucedemo.stepDef;

import helpers.Browser;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveItem {

    WebDriver driver = Browser.getInstance();

    @Then("I remove backpack")
    public void iRemoveBackpack() {
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }
}
