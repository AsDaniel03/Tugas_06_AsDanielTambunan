package stepdef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.loginPage;

import static stepdef.hook.driver;
public class login {
private final loginPage loginpage=new loginPage(driver);
        @When("user fill valid username")
        public void userfillvalidusername() throws InterruptedException{
            Assert.assertTrue(loginpage.isDisplayed());
            loginpage.fillVUsername();
            Thread.sleep(1500);
    }
    @And("user fill valid password")
    public void userfillvalidpassword() throws InterruptedException {
        loginpage.fillVPassword();
        Thread.sleep(1500);
    }
    @Then("user success login to home page")
    public void userSuccessLoginToHomePage() throws InterruptedException {
        loginpage.clickLogin();
        Assert.assertTrue(loginpage.isDisplayed2());
        Thread.sleep(1500);

    }
    @When("user fill invalid username")
    public void userFillInvalidUsername() {
    Assert.assertTrue(loginpage.isDisplayed());
    loginpage.fillIUsername();
    }
    @And("user fill invalid password")
    public void userFillInvalidPassword() {
    loginpage.fillIPassword();
    }
    @Then("user failed login and display error message")
    public void userFailedLoginAndDisplayErrorMessage() throws InterruptedException {
    loginpage.clickLogin();
    Assert.assertTrue(loginpage.isDisplayedError());
    Thread.sleep(1500);
    }
}
