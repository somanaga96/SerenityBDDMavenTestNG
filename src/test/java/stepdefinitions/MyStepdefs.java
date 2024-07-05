package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    private Actor actor;
    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        actor = Actor.named("DefaultActor");
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("{string} launched the cricbuzz")
    public void launchedTheCricbuzz(String actorName) {
        actor = Actor.named(actorName);
        actor.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");
    }
}
