package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IntellipathTest {


    public static void main(String[] args) {

        WebDriver driver= new EdgeDriver();
        driver.get("https://intellipaat.com/");
    }
}
