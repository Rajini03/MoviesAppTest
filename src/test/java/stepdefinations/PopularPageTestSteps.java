package stepdefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class PopularPageTestSteps {

    WebDriver driver = Hooks.getDriver();

    @When("I click on a Popular link and navigate to it")
    public void clickOnAPopularLink(){

        WebElement link = driver.findElement(By.linkText("Popular"));
        link.click();

    }

    @Then("I test whether the movies are displayed or not")
    public void testAllImages(){

        List<WebElement> movies = driver.findElements(By.className("movie-icon-item"));
        System.out.println(movies.size());

        for (WebElement movie : movies) {

            Assert.assertTrue(movie.isDisplayed());
        }

        System.out.println("All images displayed");
    }
}
