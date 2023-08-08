package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")).sendKeys("cccc");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("12345");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("8292216000");
Thread.sleep(2000);
Select s=new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]")));
s.selectByIndex(1);
Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
        Thread.sleep(2000);


Thread.sleep(2000);

// driver.findElement();

        driver.close();
    }
}
