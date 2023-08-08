package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import resuable.BaseCode;

import java.util.ArrayList;
import java.util.List;

public class StaticDropDown extends BaseCode {

    public static void currencySelectByVal(String value)
    {
     Select s3=initializeDropDown();
     s3.selectByValue(value);
    }
    public static void currencySelectByIndex(int index) throws InterruptedException {
        Select s2=initializeDropDown();
                s2.selectByIndex(index);
                Thread.sleep(1000);
    }
    public static void currencySelectByText(String value)
    {
        Select s1=initializeDropDown();
        s1.selectByVisibleText(value);

    }

    public static Select initializeDropDown()
    {
        WebElement w=driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        List<WebElement> l= new ArrayList<WebElement>();

        l=w.findElements(By.tagName("option"));


        for(WebElement e:l) {
            System.out.println(e.getText());
        }


        /* for(int i=0;i<l.size();i++)
         {
            String str= l.get(i).getText();
             System.out.println(str);*/




        Select s=new Select(w);
        return s;
    }

}
