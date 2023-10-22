package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.filterPage;
import pageObject.logoutPage;

import static stepdef.hook.driver;

public class logout {
    private final logoutPage logoutpage=new logoutPage(driver);
    @When("user click logout on action")
    public void userclicklogoutonaction() throws InterruptedException{
        logoutpage.clickAction();
        Thread.sleep(1000);
        logoutpage.clickLogout();
        Thread.sleep(1000);
    }
    @Then("user successfull logout and redirect to login page")
    public void userSuccessfullLogoutAndRedirectToLoginPage() throws InterruptedException {
        Assert.assertTrue(logoutpage.displayTextHomePage());
        Thread.sleep(1000);
    }
}
