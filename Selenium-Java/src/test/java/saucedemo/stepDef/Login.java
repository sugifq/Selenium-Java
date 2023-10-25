package saucedemo.stepDef;

import configs.Config;
import helpers.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {


    WebDriver driver = Browser.getInstance();
    @Given("I Open browser")
    public void iOpenBrowser() throws InterruptedException{
        driver.get(Config.baseUrl);
    }

    @And("Open website saucedemo")
    public void openWebsiteSaucedemo() throws InterruptedException{
        try{
            driver.get(Config.baseUrl);
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @And("Located on saucedemo website")
    public void locatedOnSaucedemoWebsite() {
        driver.findElement(By.name("login-button")).isDisplayed();
    }

    @When("I input valid username")
    public void iInputValidUsername() {
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
    }

    @When("I input valid password")
    public void iInputValidPassword() {
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    }


    @Then("I go to homepage")
    public void iGoToHomepage() {
        driver.findElement(By.id("logout_sidebar_link")).isDisplayed();
    }


    @Given("I in homepage")
    public void iInHomepage() {
        driver.findElement(By.id("logout_sidebar_link")).isDisplayed();
    }


    @Then("I go to login page")
    public void iGoToLoginPage() {
        driver.get(Config.baseUrl);
    }

    @When("I input invalid password")
    public void iInputInvalidPassword() {
        driver.findElement(By.name("password")).sendKeys("secret_sauce_failed");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    }

    @Then("I get error login message")
    public void iGetErrorLoginMessage() {
        driver.findElement(By.className("input_error")).isDisplayed();

    }

    @Then("I close browser")
    public void iCloseBrowser() {
        driver.close();
        driver.quit();
    }

}
