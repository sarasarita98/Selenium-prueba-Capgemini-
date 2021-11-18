package edureka.implementation.menu.pages;

import base.BaseScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MenuPage extends BaseScenario {

    WebDriver driver;

    public MenuPage(){
        driver = super.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//a[@data-button-name='Profile picture']")
    WebElement menuButton;
    @FindBy(xpath = "//a[@data-button-name='My Profile']")
    WebElement myProfileMenu;
    @FindBy(xpath = "//footer//a[text()='Blog']")
    WebElement blogFooter;
    @FindBy(xpath = "//a[contains(@href,'signout')]")
    WebElement logOutButton;

    public void clickMenuButton(){
        menuButton.click();
        waitAction();
    }

    public void clickMyProfileMenuButton(){
        myProfileMenu.click();
        waitAction();
    }

    public void clickBlogFooterButton() {
        blogFooter.click();
        waitAction();
    }

    public void clickLogOutButton() {
        logOutButton.click();
        waitAction();
        driver.quit();
    }
}
