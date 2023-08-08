package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import resuable.BaseCode;

public class DynamicDropDown extends BaseCode {

    public  static void fromDynamicDropdn(String city) throws InterruptedException {
   driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
   driver.findElement(By.xpath("//a[@value='"+city+"']")).click();
     Thread.sleep(1000);

    }

    public  static void toDynamicDropdn(String toCity) throws InterruptedException {
driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click();
       // driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']")).click();
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//a[@value='"+toCity+"']")).click();
    }

    }
