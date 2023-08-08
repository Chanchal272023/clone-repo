package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xx {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(1000);
        driver.close();
    }
}
