package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWordPress {
    WebDriver driver;
    public GetWordPress(WebDriver driver){
        this.driver = driver;
    }
    public String getText(By ele){
        return driver.findElement(ele).getText();
    }
}
