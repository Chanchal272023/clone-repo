package stepdefinition;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resuable.BaseCode;

import java.io.IOException;

public class Hooks {

    @Before()//before start of each scenario
    public void setUp() throws IOException {
        System.out.println("starts the browser");
        BaseCode.browserInvocation();
    }
    @After()//after executing all the test steps in the scenario
    public void end()
    {
        System.out.println("close the browser");
        BaseCode.driver.close();
    }
    @BeforeStep()
    public static void beforeScreenShot()
    {

    }

    @AfterStep()
    public static void takeScreenShot(Scenario sc)
    {
       byte[]  b= ((TakesScreenshot)BaseCode.driver).getScreenshotAs(OutputType.BYTES);
       sc.attach(b,"media/png",sc.getName());

    }

}
