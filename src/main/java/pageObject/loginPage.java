package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testData.loginData;

public class loginPage extends basePage {
    private final loginData logindata;
    public loginPage(WebDriver driver){
        super(driver);
        logindata=new loginData();
    }
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElement textLogin;
    @FindBy(xpath = "//h3[.='Epic sadface: Username and password do not match any user in this service']")
    private WebElement textErrorLogin;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement textProduct;
    public boolean isDisplayed(){
        return isElementDisplayed(textLogin);
    }
    public boolean isDisplayed2(){
        return isElementDisplayed(textProduct);
    }
    public boolean isDisplayedError(){
        return isElementDisplayed(textErrorLogin);
    }
    public void clickLogin(){
        clickElement(loginButton);
    }
    public void fillIUsername(){
        setTextElement(usernameField,logindata.getInputIUsername());
    }
    public void fillVUsername(){
        setTextElement(usernameField,logindata.getInputVUsername());
    }
    public void fillVPassword(){
        setTextElement(passwordField,logindata.getInputVPassword());
    }
    public void fillIPassword(){
        setTextElement(passwordField,logindata.getInputIPassword());
    }

    public void loginExistingAccount(){
        setTextElement(usernameField,logindata.getInputVUsername());
        setTextElement(passwordField,logindata.getInputVPassword());
        clickElement(loginButton);
    }
}

