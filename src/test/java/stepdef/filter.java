package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.filterPage;
import pageObject.loginPage;

import static stepdef.hook.driver;

public class filter {
    private final filterPage filterpage=new filterPage(driver);
    @When("user click filter Name A to Z")
    public void userclickfilterNameAtoZ() throws InterruptedException{
    filterpage.clickAtoZ();
    }
    @Then("product on list has been changed to Name A to Z")
    public void productOnListHasBeenChangedToNameAToZ() throws InterruptedException {
        Assert.assertTrue(filterpage.DisplayedAToZ());
        Thread.sleep(2000);
    }

    @When("user click filter Name Z to A")
    public void userClickFilterNameZToA() throws InterruptedException {
        filterpage.clickIcon();
        filterpage.clickZtoA();
        Thread.sleep(1500);
    }
    @Then("product on list has been changed to Name Z to A")
    public void productOnListHasBeenChangedToNameZToA() throws InterruptedException {
        Assert.assertTrue(filterpage.DisplayedZToA());
        Thread.sleep(2000);
    }
    @When("user click filter low to high")
    public void userClickFilterLowToHigh() {
        filterpage.clickLowToHigh();
    }
    @Then("product on list has been changed to price low to high")
    public void productOnListHasBeenChangedToPriceLowToHigh() throws InterruptedException {
        Assert.assertTrue(filterpage.DisplayedLowToHigh());
        Thread.sleep(2000);
    }

    @When("user click filter high to low")
    public void userClickFilterHighToLow() {
        filterpage.clickHighToLow();
    }
    @Then("product on list has been changed to price high to low")
    public void productOnListHasBeenChangedToPriceHighToLow() throws InterruptedException {
        Assert.assertTrue(filterpage.DisplayedHighToLow());
        Thread.sleep(2000);
    }
}
