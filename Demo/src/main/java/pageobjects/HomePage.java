package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resuable.BaseCode;

import java.io.IOException;

public class HomePage extends BaseCode{



    public static void enterProduct() throws IOException {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(prob.getProperty("product"));
    }


    public static void serachClick()
    {
        driver.findElement(By.id("nav-search-submit-button")).click();

    }

    public static String getSearchTitle()
    {
        String str=driver.getTitle();
        return str;
    }



}
