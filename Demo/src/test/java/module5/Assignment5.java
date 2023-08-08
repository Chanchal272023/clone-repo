package module5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Assignment5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        Thread.sleep(1000);
        Alert a=driver.switchTo().alert();
        Thread.sleep(1000);

        a.sendKeys("chanchal");
        a.getText();
        Thread.sleep(1000);
        a.accept();
        Thread.sleep(1000);
        WebElement element= driver.findElement(By.id("demo"));
        System.out.println(element.getText());
         Thread.sleep(1000);
         driver.close();
    }


}
