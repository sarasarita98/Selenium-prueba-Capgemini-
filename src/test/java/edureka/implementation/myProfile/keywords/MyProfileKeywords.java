package edureka.implementation.myProfile.keywords;


import edureka.implementation.menu.pages.MenuPage;
import edureka.implementation.myProfile.pages.MyProfilePage;

import java.awt.*;

public class MyProfileKeywords   {

    MyProfilePage myProfilePage = new MyProfilePage();
    MenuPage menuPage = new MenuPage();

    public void editProfessionalAndPersonalData(String name){
        myProfilePage.clickEditUserDetails();
        myProfilePage.introduceName(name);
        myProfilePage.clickSaveALittleAboutYourselfButton();
    }

    public void goToBlogMenu(){
        myProfilePage.clickPictureMenu();
        menuPage.clickBlogFooterButton();
    }


}
