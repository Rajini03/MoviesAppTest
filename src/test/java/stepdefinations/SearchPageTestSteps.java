package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPageTestSteps {

    WebDriver driver = Hooks.getDriver();


    @When("I click on the Popular link and click on search bar")
    public void clickOnThePopularLinkAndSearchBar(){

        WebElement link = driver.findElement(By.linkText("Popular"));
        link.click();

        WebElement searchBar = driver.findElement(By.cssSelector("div[class ^=  'search'] svg"));
        searchBar.click();

    }

    @Then("I send some movie names so that I get those movies by click on searching button")
    public void sendSomeMovieNamesAndClickONSearchBtn(){

        WebElement searchItem = driver.findElement(By.cssSelector("div[class = 'search-container']>input"));
        searchItem.sendKeys("J");

        WebElement searchBtn = driver.findElement(By.cssSelector("div[class = 'search-container'] button"));
        searchBtn.click();

    }

    @And("the size of the list of searched movies has arrived")
    public void printTheSizeList(){

        List<WebElement> movieList = driver.findElements(By.className("movie-icon-item"));
        System.out.println(movieList.size());

    }
}
