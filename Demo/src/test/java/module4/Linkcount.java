package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Linkcount {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println("total number of links="+list.size());

        for(int i=0;i<list.size();i++)

            System.out.println(list.get(i).getText());

        Thread.sleep(2000);
        driver.close();

    }
}
