package saucedemo.stepDef;

import helpers.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
    WebDriver driver = Browser.getInstance();

    @When("I click menu")
    public void iClickMenu() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    @And("I click logout link")
    public void iClickLogoutLink() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
}
