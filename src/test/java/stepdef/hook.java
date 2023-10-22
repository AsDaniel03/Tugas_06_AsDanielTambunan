package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.loginPage;
public class hook {
    protected static WebDriver driver;

    @Given("user navigated to landing page")
    public void usernavigatedtolandingpage() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
    }
    @And("user login with existing account")
    public void userLoginWithExistingAccount() {
        loginPage loginpage=new loginPage(driver);
        loginpage.loginExistingAccount();
    }

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @After
    public void tearDown() {
        driver.quit();
    }

}

