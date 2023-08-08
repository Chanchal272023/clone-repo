package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chanchal272007@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rajani@123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@name='login']")).click();

Thread.sleep(2000);
driver.close();

        WebDriver driver1= new ChromeDriver();
        driver1.get("https://www.facebook.com/");
        driver1.findElement(By.xpath("//input[@id='email']")).sendKeys("rajani272007@gmail.com");
        driver1.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rajani@123");
        Thread.sleep(1000);
        driver1.findElement(By.xpath("//button[@name='login']")).click();

        Thread.sleep(2000);
        driver1.close();


    }
}
