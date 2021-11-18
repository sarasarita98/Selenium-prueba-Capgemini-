package edureka.implementation.login.keywords;

import edureka.implementation.login.pages.LoginPage;

import javax.inject.Inject;
import java.net.MalformedURLException;

public class LoginKeywords {

    LoginPage loginPage = new LoginPage();

    public void userIsLogged() throws MalformedURLException {
        loginPage.goTo();
        loginPage.clickLoginButton();
        loginPage.introduceUser();
        loginPage.introducePassword();
        loginPage.clickEnterLoginButton();
    }

}
