package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import pageobjects.*;

import javax.swing.*;

import static resuable.BaseCode.driver;

public class SalesforceSteps {



   /* @Given("User navigates to the {String}")
    public void login(String url)
    {
       // driver=new EdgeDriver();
        driver.get("https://login.salesforce.com/");
    }*/


    @When("User Enters the username {string} and password {string}")
    public void enter(String username, String pwd) {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
    }

    @And("User clicks on login button")
    public void clickLogin() {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).click();

    }

    @Then("User validates the error msg")
    public void validateMsg() {
       String actualerr= driver.findElement(By.id("error")).getText();
       String expectederr="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

       if(actualerr.equals(expectederr))
           System.out.println("Pass");

           else System.out.println("fail");


    }

    @Then("User navigates to home page of application.")
    public void navigatesToHomePage() {
        System.out.println("Pass");
    }

    @Given("User navigates to the {string}")
    public void userNavigatesToThe(String url) {

           //  driver=new EdgeDriver();
           // driver.get(url);
    }

    @Given("User selects the currency dropdown")
    public void selectsTheCurrencyDropdown() throws InterruptedException {

       StaticDropDown.currencySelectByIndex(3);

    }


    @Given("User handles the dynamic drop down")
    public void dynamicDropDown() throws InterruptedException {
        DynamicDropDown.fromDynamicDropdn("RDP");
        DynamicDropDown.toDynamicDropdn("GOI");

    }

    @Given("User click and holds the mouse")
    public void clickNHold() throws InterruptedException {

        MouseHoverAction.mouseHover();
    }

    @Given("Handle the hyperlink")
    public void handleTheHyperlink() throws InterruptedException {
        Hyperlink.handleLink();
        Thread.sleep(1000);


    }

    @Given("Handle the checkbox")
    public void handleTheCheckbox() {

        CheckBox.handleCheckBox("familyandfriendsdiscount");


    }
}

