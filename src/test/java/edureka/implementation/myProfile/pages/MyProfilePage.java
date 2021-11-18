package edureka.implementation.myProfile.pages;

import base.BaseScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyProfilePage extends BaseScenario {

    WebDriver driver;

    public MyProfilePage(){
        driver = super.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//a[@id='other_details']")
    List<WebElement> editIconList;
    @FindBy(id="fullName")
    WebElement fullNameTextField;
    @FindBy(id="goal")
    WebElement goalTextField;
    @FindBy(xpath = "//button[text()='Save']")
    List<WebElement> saveButtonList;
    @FindBy(id="footauto")
    WebElement pictureMenu;

    public void clickEditUserDetails(){
        editIconList.get(0).click();
        waitAction();
    }

    public void introduceName(String name){
        fullNameTextField.sendKeys(name);
        waitAction();
    }

    public void clickSaveALittleAboutYourselfButton(){
        saveButtonList.get(0).click();
        waitAction();
    }

    public void  clickPictureMenu(){
        pictureMenu.click();
    }
}
