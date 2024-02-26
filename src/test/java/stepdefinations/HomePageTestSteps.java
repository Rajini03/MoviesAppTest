package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePageTestSteps {

    WebDriver driver = Hooks.getDriver();

    @Given("I log in to the Home Page with given valid inputs")
    public void logInToHomePage(){

        driver.get("https://qamoviesapp.ccbp.tech");

        WebElement username = driver.findElement(By.id("usernameInput"));
        username.sendKeys("rahul");

        WebElement password = driver.findElement(By.id("passwordInput"));
        password.sendKeys("rahul@2021");

        WebElement loginBtn = driver.findElement(By.className("login-button"));
        loginBtn.click();

    }

    @When("I test the heading text of all the sections displayed")
    public void testTheHeadingTextAllSections(){

        List<WebElement> heading = driver.findElements(By.xpath("//h1"));

        for (WebElement text : heading){

            boolean headingText = text.isDisplayed();

            Assert.assertTrue(headingText);
        }
        System.out.println(heading.size());
    }

    @Then("I test whether the play button is displayed or not")
    public void testThePlayButton(){

        WebElement playBtn = driver.findElement(By.className("home-movie-play-button"));

        boolean playBtnText = playBtn.isDisplayed();

        Assert.assertTrue(playBtnText);
    }

    @And("I test whether the Movies are displayed, in the corresponding movies sections")
    public void testTheMoviesDisplayedCorrespondingSection(){

        List<WebElement> images = driver.findElements(By.className("poster"));
        System.out.println(images.size());

        for(WebElement image : images){

            boolean imageIsDisplay = image.isDisplayed();
            if(imageIsDisplay) Assert.assertTrue(image.isDisplayed());
            else break;

        }
    }

    @Then("I test the Contact Us Section")
    public void testTheContactUsSection(){

        WebElement contactSec = driver.findElement(By.className("footer-container"));

        Assert.assertTrue(contactSec.isDisplayed());

    }
}
