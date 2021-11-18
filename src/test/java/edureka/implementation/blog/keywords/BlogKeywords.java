package edureka.implementation.blog.keywords;

import edureka.implementation.blog.pages.BlogPage;
import edureka.implementation.myProfile.keywords.MyProfileKeywords;
import org.junit.Assert;

public class BlogKeywords {

    BlogPage blogPage = new BlogPage();

    public void exploreBlogPage(){
        blogPage.switchToNewWindow();
        blogPage.clickArtificialIntelligenceButton();
        blogPage.clickBackToBlog();
        blogPage.clickBigDataButton();
        blogPage.clickBackToBlog();
        blogPage.clickBackToHomePage();
    }
}
