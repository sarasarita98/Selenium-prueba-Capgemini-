package edureka.implementation.menu.keywords;

import edureka.implementation.menu.pages.MenuPage;

public class MenuKeywords {

    MenuPage menuPage = new MenuPage();

    public void goToMyProfileMenu(){
        menuPage.clickMenuButton();
        menuPage.clickMyProfileMenuButton();
    }

    public void logOut(){
        menuPage.clickMenuButton();
        menuPage.clickLogOutButton();
    }
}
