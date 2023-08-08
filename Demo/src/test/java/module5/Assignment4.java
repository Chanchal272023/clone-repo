package module5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
        driver.findElement(By.xpath("//button[contains(text(),'Click here to show confirm alert')]")).click();

        Alert a=driver.switchTo().alert();
        System.out.println(a.getText());
        Thread.sleep(2000);
        a.accept();
        System.out.println("after click on ok ,\n"+a.getText());
        a.accept();
        Thread.sleep(2000);
        driver.close();
    }
}
