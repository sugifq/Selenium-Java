package saucedemo.stepDef;

import helpers.Browser;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
    WebDriver driver = Browser.getInstance();
    @Then("I add backpack to chart")
    public void iAddBackpackToChart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("I checkout")
    public void iCheckout() {
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();

    }

    @Then("I fill checkout information")
    public void iFillCheckoutInformation() {
        driver.findElement(By.name("firstName")).sendKeys("Sugi");
        driver.findElement(By.name("lastName")).sendKeys("FQ");
        driver.findElement(By.name("postalCode")).sendKeys("27378");
        driver.findElement(By.id("continue")).click();
    }


    @Then("I finish checkout")
    public void iFinishCheckout() {
        driver.findElement(By.id("finish")).click();

    }
}
