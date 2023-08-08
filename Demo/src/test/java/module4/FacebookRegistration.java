package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookRegistration {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.findElement(By.name("firstname")).sendKeys("Chanchal");
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Abhishek");
        Thread.sleep(1000);
        String str =driver.findElement(By.name("firstname")).getAttribute("value");
        System.out.println(str);
        driver.close();


    }
}
