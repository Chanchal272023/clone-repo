package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class SearchResult extends BaseCode {

public static void sortByFeature()
{
    driver.findElement(By.xpath("//span[@id='a-autoid-0']")).click();
}

public static void newestArrival()
{
    driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
}

public static String validateSearchResult() throws InterruptedException {
Thread.sleep(2000);
   String searchResult= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/child::span[1]")).getText();
    return searchResult;
}
}
