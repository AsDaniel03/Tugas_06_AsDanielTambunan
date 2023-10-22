package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testData.loginData;

public class logoutPage extends basePage {
    public logoutPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement iconAction;
    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement logoutButton;
    @FindBy(xpath = "//div[@class='login_wrapper-inner']")
    private WebElement textHomepage;

    public boolean displayTextHomePage(){
        return isElementDisplayed(textHomepage);
    }
    public void clickAction(){
        clickElement(iconAction);
    }
    public void clickLogout(){
        clickElement(logoutButton);
    }
}
