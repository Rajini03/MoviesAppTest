package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MovieDetailsPageTestSteps {

    WebDriver driver = Hooks.getDriver();


    @When("I click on the Avatar image then I can test home page UI elements")
    public void testTheAvatarImageUIElements(){

        WebElement avatarImg = driver.findElement(By.cssSelector("img[alt = 'Avatar']"));
        avatarImg.click();

        WebElement heading = driver.findElement(By.className("movie-title"));
        Assert.assertEquals(heading.getText(), "Avatar", "Heading didn't match");

        WebElement description = driver.findElement(By.className("movie-overview"));
        String expectedDes = "Avatar is a 2009 American epic science fiction film directed, written, produced, and co-edited by James Cameron and starring Sam Worthington, Zoe Saldana";
        Assert.assertEquals(description.getText(), expectedDes, "Description doesn't match");

    }

    @And("I test the play button and list of all images whether displayed or not and test the Contact Us Section")
    public void testThePlayButton(){

        WebElement playBtn = driver.findElement(By.className("play-button"));
        Assert.assertTrue(playBtn.isDisplayed());

        List<WebElement> imgList = driver.findElements(By.xpath("//li/img"));
        System.out.println(imgList.size());

        for(WebElement img : imgList){
            boolean image = img.isDisplayed();

            Assert.assertTrue(image);

        }

        WebElement contactUsSection = driver.findElement(By.className("footer-container"));
        Assert.assertTrue(contactUsSection.isDisplayed());

    }

    @When("I click on the Popular link then I can test Popular page UI elements")
    public void testThePopularPageUIElements(){

        WebElement link = driver.findElement(By.linkText("Popular"));
        link.click();


        WebElement image = driver.findElement(By.cssSelector("img[alt = 'Luca']"));
        image.click();


        WebElement heading = driver.findElement(By.className("movie-title"));
        Assert.assertEquals(heading.getText(), "Luca", "Heading didn't match");

        WebElement description = driver.findElement(By.className("movie-overview"));
        String expectedDes = "Luca and his best friend Alberto experience an unforgettable summer on the Italian Riviera. But all the fun is threatened by a deeply-held secret: they are sea monsters from another world just below the water’s surface.";
        Assert.assertEquals(description.getText(), expectedDes, "Description doesn't match");

    }

}
