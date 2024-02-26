package stepdefinations;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AccountPageTestSteps {

    WebDriver driver = Hooks.getDriver();

    @When("I click on Account image and test all the UI elements present on the web page")
    public void testTheAccountUIElements(){

        WebElement accountImg = driver.findElement(By.className("avatar-img"));
        accountImg.click();

        WebElement heading = driver.findElement(By.className("account-heading"));
        Assert.assertEquals(heading.getText(), "Account", "heading doesn't match");

        //check the membership details
        WebElement membershipUsername = driver.findElement(By.className("membership-username"));
        //System.out.println(membershipUsername.getText());
        Assert.assertEquals(membershipUsername.getText(), "User name : rahul", "heading doesn't match");

        WebElement membershipPassword = driver.findElement(By.className("membership-password"));
        //System.out.println(membershipPassword.getText());
        Assert.assertEquals(membershipPassword.getText(), "Password : **********", "password doesn't match");


    }

    @Then("I test all the plan details")
    public void testThePlanDetails(){

        //check the plan details
        WebElement planPara = driver.findElement(By.className("plan-paragraph"));
        Assert.assertEquals(planPara.getText(), "Premium", "plan paragraph doesn't match");

        WebElement planDetails = driver.findElement(By.className("plan-details"));
        Assert.assertEquals(planDetails.getText(), "Ultra HD", "plan details doesn't match");
    }

    @And("I test the logout Functionality")
    public void testTheLogoutFunctionality(){

        WebElement logout = driver.findElement(By.className("logout-button"));
        logout.click();

        String currentURL = driver.getCurrentUrl();

        String expectedURL = "https://qamoviesapp.ccbp.tech/login";
        Assert.assertEquals(expectedURL, currentURL, "Url doesn't match");

    }
}
