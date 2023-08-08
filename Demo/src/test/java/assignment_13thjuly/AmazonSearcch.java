package assignment_13thjuly;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonSearcch {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='a-autoid-0']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
        Thread.sleep(1000);


        String msg=driver.findElement(By.cssSelector(".a-section.a-spacing-small.a-spacing-top-small")).getText();

        System.out.println(msg);
        String searchResult= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/child::span[1]")).getText();
        System.out.println(searchResult);

        if(msg.contains("iphone"))
        System.out.println("pass");
        else System.out.println("fail");
        driver.close();

    }
}
