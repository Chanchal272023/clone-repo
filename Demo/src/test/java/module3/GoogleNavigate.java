package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleNavigate {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.selenium.dev/");
        Thread.sleep(1000);

        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        driver.close();





    }
}
