package edureka.stepDefinitions;

import base.BaseScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edureka.implementation.blog.keywords.BlogKeywords;
import edureka.implementation.menu.keywords.MenuKeywords;
import edureka.implementation.login.keywords.LoginKeywords;
import edureka.implementation.myProfile.keywords.MyProfileKeywords;

import java.net.MalformedURLException;

public class EdurekaStepDefinition extends BaseScenario {

    LoginKeywords loginKeywords = new LoginKeywords();
    MenuKeywords menuKeywords = new MenuKeywords();
    MyProfileKeywords myProfileKeywords = new MyProfileKeywords();
    BlogKeywords blogKeywords = new BlogKeywords();

    @When("user is logged in")
    public void userIsLogged() throws MalformedURLException {
        loginKeywords.userIsLogged();
    }

    @And("user goes to My Profile")
    public void userGoesToMyProfile(){
        menuKeywords.goToMyProfileMenu();
    }

    @And ("user changes professional and personal data \"(.*?)\"$")
    public void userChangesProfessionalAndPersonalData(String name){
        myProfileKeywords.editProfessionalAndPersonalData(name);
    }

    @And ("user goes to blogs and goes back to home page")
    public void userGoesToBlogs(){
        myProfileKeywords.goToBlogMenu();
        blogKeywords.exploreBlogPage();
    }

    @Then("user log out")
    public void userLogOut(){
        menuKeywords.logOut();
    }
}
