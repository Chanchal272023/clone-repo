package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        String msg1=driver.getTitle();
        System.out.println(msg1);
        driver.close();

    }
}
