package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import resuable.BaseCode;

import java.util.ArrayList;
import java.util.List;

public class TableValidation extends BaseCode {

    public static void tableHandle() {
        WebElement element = driver.findElement(By.xpath("//table[@class='infobox vcard']"));
        List<WebElement> list = element.findElements(By.xpath("//tr/th"));
        List<String> l2 = new ArrayList<String>();
        for (int i = 1; i < list.size(); i++) {
            //e.getText();
            l2.add(list.get(i).getText());

        }
        System.out.println(l2);
    }

    public static void table2Handle(int index)
    {

        WebElement element=driver.findElement(By.xpath("//table[@class='wikitable']"));
        List<WebElement> list=element.findElements(By.xpath("//tr//td["+index+"]"));

        for (WebElement e:list)
            System.out.println(e.getText());
    }
}