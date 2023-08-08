package assignment_13thjuly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBasic {

    public static void main(String[] args) {

        WebDriver driver =new EdgeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("chanchal");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.id("Login")).click();
    }
}
