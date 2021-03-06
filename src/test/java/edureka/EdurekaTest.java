package edureka;


import base.BaseScenario;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)

// Default:
@Cucumber.Options(tags={"@focus"},format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
//@Cucumber.Options(tags={"@now"},format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class EdurekaTest {

    @AfterClass
    public static void tearDownClass() {
        // Close web driver
        BaseScenario.quitDriver();
    }
}