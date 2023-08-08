package assignment_13thjuly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesforceLogin {

    public static void main(String[] args) {

        WebDriver driver =new EdgeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rajani");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).click();
        String msg=driver.findElement(By.id("error")).getText();
        System.out.println(msg);
    }
}
