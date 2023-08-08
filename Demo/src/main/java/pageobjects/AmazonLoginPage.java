package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;
import resuable.ExcelHandling;

import java.io.IOException;

public class AmazonLoginPage extends BaseCode {

    public static void clickOnHelloSignin()
    {
        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
    }

public static void enterEmail() throws IOException {

   // driver.findElement(By.name("email")).sendKeys(prob.getProperty("mailid"));
    driver.findElement(By.name("email")).sendKeys(ExcelHandling.readSheet("credit",0,0));

}

public static void enterPassword() throws IOException {

   // driver.findElement(By.name("password")).sendKeys(prob.getProperty("password"));
    driver.findElement(By.name("password")).sendKeys(ExcelHandling.readSheet("credit",1,1));

}

public static void clickOnContinue()
{
    driver.findElement(By.xpath("//input[@id='continue']")).click();

}

public static void signInSubmit()
{
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
}

public static String getSigninTitle()
{
    String str=driver.getTitle();
    return str;
}
}
