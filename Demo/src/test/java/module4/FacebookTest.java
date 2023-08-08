package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.support.ui.Select;

public class FacebookTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("Chanchal");
        driver.findElement(By.name("lastname")).sendKeys("Kumari");
        driver.findElement(By.name("reg_email__")).sendKeys("chanchal272007@gmail.com");
        String str=driver.findElement(By.name("reg_email__")).getAttribute("value");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(str);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Raj@123");
        Select s=new Select(driver.findElement(By.name("birthday_day")));
        s.selectByValue("12");
       // Thread.sleep(3000);
        Select s1=new Select(driver.findElement(By.name("birthday_month")));
        s1.selectByIndex(0);
       // Thread.sleep(3000);

        Select s2=new Select(driver.findElement(By.name("birthday_year")));
        s2.selectByVisibleText("1988");
       // driver.findElement(By.name("(sex)[2]")).click();
        driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        Thread.sleep(3000);










        driver.close();


    }
}
