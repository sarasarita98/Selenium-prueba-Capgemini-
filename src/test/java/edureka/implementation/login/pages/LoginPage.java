package edureka.implementation.login.pages;

import base.BaseScenario;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseScenario {

    WebDriver driver;

    public LoginPage(){
        driver = super.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//span[@data-gi-action='Login']")
    WebElement loginButton;
    @FindBy(id = "si_popup_email")
    WebElement userTextField;
    @FindBy(id = "si_popup_passwd")
    WebElement passwordTextField;
    @FindBy(xpath = "//button[text()='Login']")
    WebElement enterLoginButton;

    public void goTo() throws MalformedURLException {
        driver.manage().window().setPosition(new Point(0, 0));
        //driver.get(getSiteBaseUrl() + "/");
        driver.get("https://www.edureka.co" + "/");
    }

    public void clickLoginButton(){
        loginButton.click();
        waitAction();
    }

    public void introduceUser(){
        //userTextField.sendKeys(getUserName());
        userTextField.sendKeys("sarazahrafem@gmail.com");
        waitAction();
    }

    public void introducePassword(){
        //passwordTextField.sendKeys(getPassword());
        passwordTextField.sendKeys("Edureka21");
        waitAction();
    }

    public void clickEnterLoginButton(){
        enterLoginButton.click();
        waitAction();
    }


}
