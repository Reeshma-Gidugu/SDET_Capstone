package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver =driver;
    }
    public void mouseHover(By ele){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ele)).perform();
    }
}
