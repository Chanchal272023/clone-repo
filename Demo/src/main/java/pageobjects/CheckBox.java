package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class CheckBox extends BaseCode {

    public static void handleCheckBox(String value)
    {
        driver.findElement(By.xpath("//div[@id='divdiscountcheckbox']//p[@id='"+value+"']")).click();
    }

}
