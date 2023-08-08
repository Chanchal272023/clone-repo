package resuable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseCode {

  public static  Properties prob;
   public static   WebDriver driver;

    public static void browserInvocation() throws IOException {
        FileInputStream fis=new FileInputStream(new File("src/main/resources/configuration/config.properties"));
        prob=new Properties();
        prob.load(fis);
       // driver=new EdgeDriver();
      // driver.navigate().to("https://www.amazon.com/");


        if (prob.getProperty("browser").equalsIgnoreCase("edge"))
          driver=new EdgeDriver();
        else if (prob.getProperty("browser").equalsIgnoreCase("chrome"))
            driver=new ChromeDriver();
        else if (prob.getProperty("browser").equalsIgnoreCase("safari"))
            driver= new SafariDriver();
        else new InvalidArgumentException(" enter the correct browser");

        driver.navigate().to(prob.getProperty("url"));
        driver.manage().window().maximize();
        //return driver;












    }
}
