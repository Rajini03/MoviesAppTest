package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPageTestSteps {

    WebDriver driver = Hooks.getDriver();

    @Given("I am on the Movies App Page")
    public void navigateToURL() {
        driver.get("https://qamoviesapp.ccbp.tech");
    }

    @When("I test the login website logo is displayed and I get the expected output")
    public void testTheLoginPageLogo() {

        WebElement image = driver.findElement(By.className("login-website-logo"));
        Assert.assertTrue(image.isDisplayed());
        System.out.println("Image is displayed");
    }

    @Then("I test the sign in heading text and I get the expected output")
    public void testTheLoginPageHeadingText() {

        WebElement heading = driver.findElement(By.className("sign-in-heading"));
        String headingText = heading.getText();

        Assert.assertEquals(headingText, "Login", "Heading Text not match");
    }

    @When("I test the USERNAME text and I get the expected output")
    public void testTheUSERNAMEText() {

        WebElement username = driver.findElement(By.xpath("//div/label[text() = 'USERNAME']"));
        String usernameText = username.getText();

        Assert.assertEquals(usernameText, "USERNAME", "username Text not match");
    }

    @Then("I test the PASSWORD text and I get the expected output")
    public void testThePASSWORDText() {

        WebElement password = driver.findElement(By.xpath("//div/label[text() = 'PASSWORD']"));
        String passwordText = password.getText();

        Assert.assertEquals(passwordText, "PASSWORD", "password Text not match");
    }

    @When("I test the login button is displayed and  I can view the login button")
    public void testTheLoginBtn() {

        WebElement loginBtn = driver.findElement(By.className("login-button"));
        Assert.assertTrue(loginBtn.isDisplayed());
        System.out.println("Login button is displayed");
    }


    @When("I test the login with out inputs and I get this '*Username or password is invalid' error message")
    public void testTheWithOutInputs() {


        WebElement loginBtn = driver.findElement(By.className("login-button"));
        loginBtn.click();

        WebElement error = driver.findElement(By.className("error-message"));
        String errorMsg = error.getText();
        Assert.assertEquals(errorMsg, "*Username or password is invalid", "Error message did not match");

    }



    @And("I test the with empty username and I get this '*Username or password is invalid' error message")
    public void testTheWithEmptyUsername() {

        WebElement password = driver.findElement(By.id("passwordInput"));

        password.sendKeys("rahul@202");

        WebElement loginBtn = driver.findElement(By.className("login-button"));
        loginBtn.click();

        WebElement error = driver.findElement(By.className("error-message"));
        String errorMsg = error.getText();
        Assert.assertEquals(errorMsg, "*Username or password is invalid", "Error message did not match");

    }

    @When("I test the with empty password and I get this '*Username or password is invalid' error message")
    public void testTheWithEmptyPassword() {

        WebElement username = driver.findElement(By.id("usernameInput"));
        username.sendKeys("rahul");


        WebElement loginBtn = driver.findElement(By.className("login-button"));
        loginBtn.click();

        WebElement error = driver.findElement(By.className("error-message"));
        String errorMsg = error.getText();
        Assert.assertEquals(errorMsg, "*Username or password is invalid", "Error message did not match");
    }


    @When("I enter the invalid username and password then I get this '*username and password didn't match' error message")
    public void EnterInvalidUsernameAndPassword(){

        WebElement username = driver.findElement(By.id("usernameInput"));
        username.clear();
        username.sendKeys("rahul");

        WebElement password = driver.findElement(By.id("passwordInput"));
        password.clear();
        password.sendKeys("rahul@202");


        WebElement loginBtn = driver.findElement(By.className("login-button"));
        loginBtn.click();

        WebElement error = driver.findElement(By.className("error-message"));
        String errorMsg = error.getText();

        Assert.assertEquals(errorMsg, "*username and password didn't match", "Error message did not message");
    }


    @When("I enter the valid username and password")
    public void enterValidInputs(){

        WebElement username = driver.findElement(By.id("usernameInput"));
        username.clear();
        username.sendKeys("rahul");

        WebElement password = driver.findElement(By.id("passwordInput"));
        password.clear();
        password.sendKeys("rahul@2021");


        WebElement loginBtn = driver.findElement(By.className("login-button"));
        loginBtn.click();

    }

    @Then("I successfully login to the Movies App")
    public void redirectedToLoginPage(){

        String currentUrl = driver.getCurrentUrl();
        String expectedURL = "https://qamoviesapp.ccbp.tech/login";

        Assert.assertEquals(currentUrl,expectedURL,  "URL's doesn't match");
        System.out.println("Redirected to page");
    }

}