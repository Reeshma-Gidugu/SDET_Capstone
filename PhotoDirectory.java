package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PhotoDirectory {
    WebDriver driver;
    public PhotoDirectory(WebDriver driver){
        this.driver =driver;
    }
    public void sendKeysFunc(By ele, String str){
        driver.findElement(ele).sendKeys(str + Keys.ENTER);
    }
}
