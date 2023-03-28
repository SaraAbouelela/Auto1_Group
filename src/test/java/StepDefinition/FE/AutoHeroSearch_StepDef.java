package StepDefinition.FE;

import PageObjectModel.FE.AutoHeroSearch_POM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.TestBase;

public class AutoHeroSearch_StepDef
{
     AutoHeroSearch_POM autoHeroSearch_pom = new AutoHeroSearch_POM();

    @Given("AutoHero search URL")
    public void redirectingToAutoHeroSearchURL() throws InterruptedException {
        autoHeroSearch_pom.navigateToSearchURL();
        autoHeroSearch_pom.acceptCookies();
    }

}
