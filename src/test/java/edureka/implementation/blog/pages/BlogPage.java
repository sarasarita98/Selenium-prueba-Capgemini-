package edureka.implementation.blog.pages;

import base.BaseScenario;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BlogPage extends BaseScenario {

    WebDriver driver;

    public BlogPage(){
        driver = super.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//div[@class='row']//a[contains(@href,'artificial-intelligence')]")
    WebElement artificialIntelligenceButton;
    @FindBy(xpath = "//div[@class='row']//a[contains(@href,'big-data-analytics')]")
    WebElement bigDataButton;
    @FindBy(xpath = "//ol[@class='breadcrumb no-padding']//li//a[text()='Blog']")
    WebElement backToBlog;
    @FindBy(xpath = "//ol[@class='breadcrumb no-padding']//li//a[text()='Home']")
    List<WebElement> backToHomePage;

    public void switchToNewWindow(){
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }

    public void clickArtificialIntelligenceButton(){
        artificialIntelligenceButton.click();
        waitAction();
    }

    public void clickBigDataButton(){
        bigDataButton.click();
        waitAction();
    }

    public void clickBackToBlog(){
        backToBlog.click();
        waitAction();
    }

    public void clickBackToHomePage(){
        backToHomePage.get(0).click();
        waitAction();
    }

}
