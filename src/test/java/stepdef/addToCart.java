package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.AddToCart;
import pageObject.filterPage;

import static stepdef.hook.driver;

public class addToCart {
    private final AddToCart addtocart=new AddToCart(driver);
    @When("user click add to cart")
    public void userclickaddtocart() throws InterruptedException{
        addtocart.addToCart();
//        Assert.assertTrue(addtocart.displayDescription());

    }
    @And("user checkout the product")
    public void userCheckoutTheProduct() {
        addtocart.FillData();
    }
    @Then("user success checkout the product")
    public void userSuccessCheckoutTheProduct() throws InterruptedException {
        Assert.assertTrue(addtocart.displaySuccessText());
        Thread.sleep(1500);
        addtocart.finish();

    }
}
