package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import resuable.BaseCode;

import java.util.List;

public class Hyperlink extends BaseCode {

    public static void handleLink()
    {
        List <WebElement>list=driver.findElements(By.xpath("//tr[@class='footer-subheadings']//td[1]"));
          for (WebElement e:list)
          {
//              String str= Keys.chord(Keys.CONTROL,Keys.ENTER);
//              e.sendKeys(str);
              Keys.chord(e.getText());
          }

    }
}
