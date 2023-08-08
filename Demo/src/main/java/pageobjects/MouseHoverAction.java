package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import resuable.BaseCode;

public class MouseHoverAction extends BaseCode {

    public static void mouseHover() throws InterruptedException {
        Actions action=new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).build().perform();
        Thread.sleep(1000);
    }
}
