package stepDefinitions;
import org.openqa.selenium.By;
import pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class wordPressSteps extends Base {
    HomePage home;
    GetWordPress word;
    PhotoDirectory photo;

    @Given("User launches WordPress application")
    public void user_launches_word_press_application() {
        driverSetUp();
    }

    @Then("Verify page title of the page")
    public void verify_page_title_of_the_page() {
            Assert.assertEquals(driver.getTitle(),"Blog Tool, Publishing Platform," +
                    " and CMS – WordPress.org");
    }

    @When("User mouse over on Extend and clicks Get WordPress")
    public void user_mouse_over_on_extend_and_clicks_get_word_press() {
        home = new HomePage(driver);
        home.mouseHover(Variables.EXTEND_MOVER);
        driver.findElement(Variables.GET_WORDPRESS).click();
    }

    @Then("Verify Get WordPress text is displayed")
    public void verify_get_word_press_text_is_displayed() {
        word = new GetWordPress(driver);
        String str = word.getText(Variables.WORDPRESS_TEXT);
        Assert.assertEquals(str,"Get WordPress");
    }

    @When("User clicks on Community and Photo Directory")
    public void user_clicks_on_community_and_photo_directory() {
        driver.findElement(Variables.COMMUNITY).click();
        driver.findElement(By.linkText(Variables.DropDownText)).click();
    }


    @When("User searches for a photo")
    public void user_searches_for_a_photo() {
        photo = new PhotoDirectory(driver);
        photo.sendKeysFunc(Variables.SEARCH,Variables.SEARCH_TEXT);
    }

    @Then("Verify images are displayed")
    public void verify_images_are_displayed() {
        driver.findElement(Variables.IMAGES).isDisplayed();
        close();
    }

}
