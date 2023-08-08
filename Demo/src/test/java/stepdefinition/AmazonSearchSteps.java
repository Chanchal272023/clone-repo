package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageobjects.AmazonLoginPage;
import pageobjects.HomePage;
import pageobjects.SearchResult;
import resuable.BaseCode;
import runner.RunAmazon;


import java.io.IOException;

import static resuable.BaseCode.driver;
import static resuable.BaseCode.prob;

public class AmazonSearchSteps {

    @Given("User navigates to {string}")
    public void navigateSearch(String url) throws IOException {
       // driver =new EdgeDriver();
        //driver.get("https://www.amazon.in/");
      //  BaseCode b=new BaseCode();
       // BaseCode.browserInvocation();



     }

    @When("User enters the {string} in search bar")
    public void searchProduct(String product) {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
    }

    @And("User clicks on search")
    public void clicksOnSearch() {
       driver.findElement(By.id("nav-search-submit-button")).click();
        
    }

    @Then("User validates the search result")
    public void validatesTheSearch() {

        System.out.println("user validates the search");

    }

    @Given("User navigates to amazon home page")
    public void userPropertiesAmazonHome() throws IOException {
        BaseCode.browserInvocation();
    }

    @When("User enter the search key")
    public void userEnterPropSearch() throws IOException {
        HomePage.enterProduct();
    }

    @And("User clicks")
    public void userClicksProp() throws InterruptedException {
        HomePage.serachClick();
        Thread.sleep(2000);
    }

    @Then("User validates the result")
    public void userValidatesProp() {

        String actualstr=HomePage.getSearchTitle();
        System.out.println(actualstr);
        if(actualstr.contains("Amazon.in : iphone")) {
            Assert.assertTrue(true);
        }
        else             Assert.assertTrue(false);


        //Assert.assertEquals("Amazon.in : iphone",actualstr);



    }

    @Given("User enters the product and navigates to search result page")
    public void navigateToSearchResultPage() throws IOException {
        HomePage.enterProduct();
        HomePage.serachClick();
    }

    @When("User clicks on the sort by newest arrivals condition")
    public void clicksOnSortNewestArrivals()  {
       SearchResult.sortByFeature();
        SearchResult.newestArrival();

    }

    @Then("User validates the newest arrival result condition")
    public void validatesNewestArrivalResult() throws InterruptedException {
        String actualresult=SearchResult.validateSearchResult();
        System.out.println(actualresult);
     if (actualresult.contains("1-16 of over 1,000 results for"))
            Assert.assertTrue(true);
        else Assert.assertTrue(false);
    }

    @Given("user navigates to signin page")
    public void navigateSigninPage() {
        AmazonLoginPage.clickOnHelloSignin();

    }

    @When("User enters the email and password")
    public void emailnPassword() throws IOException {
        AmazonLoginPage.enterEmail();
        AmazonLoginPage.clickOnContinue();
        AmazonLoginPage.enterPassword();
    }

    @And("User clicks on signIn button")
    public void clicksOnSignIn() {
        AmazonLoginPage.signInSubmit();
    }

    @Then("User validates the signin Page")
    public void ValidatesTheSigninPage() {
        String actualstr=AmazonLoginPage.getSigninTitle();
        //System.out.println(actualstr);
       Assert.assertEquals("Amazon Sign In",actualstr);

    }



}

