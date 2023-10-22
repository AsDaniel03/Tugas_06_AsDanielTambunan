package pageObject;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testData.AddToCartData;
import testData.loginData;

public class AddToCart extends basePage{
    private final AddToCartData addtocartdata;
    public AddToCart(WebDriver driver) {
        super(driver);
        addtocartdata=new AddToCartData();
    }
    @FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartButton;
    @FindBy(css =".shopping_cart_link")
    private WebElement iconCart;
    @FindBy(xpath ="//div[@class='inventory_item_desc']")
    private WebElement textDescription;
    @FindBy(xpath="//button[@id='checkout']")
    private WebElement checkoutButton;
    @FindBy(xpath ="//input[@id='first-name']")
    private WebElement inputFirstName;
    @FindBy(xpath ="//input[@id='last-name']")
    private WebElement inputLastName;
    @FindBy(xpath ="//input[@id='postal-code']")
    private WebElement inputPostalCode;
    @FindBy(xpath ="//input[@id='continue']")
    private WebElement continueButton;
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement textTotalHarga;
    @FindBy(xpath ="//button[@id='finish']")
    private WebElement finishButton;
    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement textSuccess;
    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement backToHomeButton;

    public boolean displayDescription(){
        return isElementDisplayed(textDescription);
    }
    public boolean displaySuccessText(){
        return isElementDisplayed(textSuccess);
    }
    public void addToCart(){
        clickElement(addToCartButton);
        clickElement(iconCart);
        clickElement(checkoutButton);}
    public void FillData(){
        setTextElement(inputFirstName,addtocartdata.getFirstname());
        setTextElement(inputLastName,addtocartdata.getLastName());
        setTextElement(inputPostalCode,addtocartdata.getPostalCode());
        clickElement(continueButton);
        clickElement(finishButton);
    }
    public void finish(){
        clickElement(backToHomeButton);
    }
    }



