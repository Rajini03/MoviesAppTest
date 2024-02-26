package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HeaderSectionTestSteps {

    WebDriver driver = Hooks.getDriver();

    @When("I test the website logo is displayed or not")
    public void testTheWebsiteLogo(){

        WebElement logo = driver.findElement(By.className("website-logo"));

        Assert.assertTrue(logo.isDisplayed());

    }

    @And("I test the navigation element texts")
    public void testTheNavigationElements(){

        List<WebElement> links = driver.findElements(By.cssSelector("a[class ^= 'nav']"));

        String linkText = links.get(0).getText();
        Assert.assertEquals(linkText , "Home" , "Link text doesn't match");

        String linkText2 = links.get(1).getText();
        Assert.assertEquals(linkText2 , "Popular" , "Link text doesn't match");

    }

    @When("I click on the navigation links then I navigate to corresponding link")
    public void clickOnTheNavigationLinks(){

        List<WebElement> links = driver.findElements(By.cssSelector("a[class ^= 'nav']"));

        links.get(0).click();
        System.out.println("Navigate to Home");

        links.get(1).click();
        System.out.println("Navigate to Popular");


    }

    @Then("I click on the Avatar Image and I navigate to it")
    public void clickOnTheAvatarImage(){

        WebElement avatarImg = driver.findElement(By.className("avatar-img"));
        avatarImg.click();
        System.out.println("Navigate to Avatar");
    }
}
