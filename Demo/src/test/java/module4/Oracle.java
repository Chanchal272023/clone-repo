package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Oracle {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://login.oracle.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//a[text()=' Create Account']")).click();
        driver.navigate().to("https://profile.oracle.com/myprofile/account/create-account.jspx");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='sView1:r1:0:email::content']")).sendKeys("chanchal@gmail.com");
        driver.findElement(By.xpath("//input[@id='sView1:r1:0:password::content']")).sendKeys("Abhishek@123");
        String str=driver.findElement(By.xpath("//input[@id='sView1:r1:0:password::content']")).getAttribute("value");
        driver.findElement(By.xpath("//input[@id='sView1:r1:0:retypePassword::content']")).sendKeys(str);
        Thread.sleep(2000);
        Select s1=new Select(driver.findElement(By.xpath("//select[@id=\"sView1:r1:0:country::content\"]")));
        s1.selectByIndex(4);
        Thread.sleep(2000);
        driver.close();


    }
}
