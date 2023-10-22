package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testData.loginData;

public class filterPage extends basePage{
    public filterPage(WebDriver driver) {
        super(driver);
    }
        @FindBy(xpath ="//select[@class='product_sort_container']")
        private WebElement iconFilter;
        @FindBy(xpath ="//div[@class='header_secondary_container']")
        private WebElement AtoZ;
        @FindBy(xpath ="//div[@class='inventory_list']/div[contains(.,'Test.allTheThings() T-Shirt (Red)This classic Sauce Labs t-shirt is perfect to w')]")
        private WebElement ZtoA;
        @FindBy(xpath ="//div[@class='inventory_list']/div[contains(.,'Sauce Labs OnesieRib snap infant onesie for the junior automation engineer in de')]")
        private WebElement lowToHigh;
        @FindBy(xpath ="//div[@class='inventory_list']/div[contains(.,\"Sauce Labs Fleece JacketIt's not every day that you come across a midweight quar\")]")
        private WebElement HighTolow;
        @FindBy(xpath ="//div[.='Sauce Labs Backpack']")
        private WebElement productAtoZ;
        @FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
        private WebElement productZtoA;
        @FindBy(xpath = "//div[.='Sauce Labs Onesie']")
        private WebElement productLowToHigh;
        @FindBy(xpath = "//div[.='Sauce Labs Fleece Jacket']")
        private WebElement productHighToLow;

        public boolean DisplayedAToZ(){
        return isElementDisplayed(productAtoZ);
     }
        public boolean DisplayedZToA(){
        return isElementDisplayed(productZtoA);
    }
    public boolean DisplayedHighToLow(){
        return isElementDisplayed(productHighToLow);
    }
    public boolean DisplayedLowToHigh(){
        return isElementDisplayed(productLowToHigh);
    }
    public void clickAtoZ(){
        clickElement(AtoZ);
    }
    public void clickZtoA(){
        clickElement(ZtoA);
    }
    public void clickLowToHigh(){
        clickElement(lowToHigh);
    }
    public void clickHighToLow(){
        clickElement(HighTolow);
    }
    public void clickIcon(){
        clickElement(iconFilter);
    }

    }


