package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HdfcNetbanking {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
       driver.switchTo().frame("login_page");
       //driver.findElement(By.linkText("Know More....")).click();
        //driver.findElement(By.xpath("//div[@id='welcomesec1']/descendant::a")).click();
        driver.findElement(By.partialLinkText("Know")).click();
        Thread.sleep(1000);

        System.out.println(driver.getTitle());
        driver.navigate().forward();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.quit();



    }
}