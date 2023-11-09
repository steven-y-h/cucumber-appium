package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.IOSPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IOSStep {
    IOSPage iosPage = new IOSPage();

    @Given("[IOS] I am on the Google search page")
    public void iosIAmOnTheGoogleSearchPage() {
        iosPage.openGoogle();
    }

    @When("[IOS] I search for {string}")
    public void iosISearchFor(String query) {
        iosPage.inputSearch(query);
    }

    @Then("[IOS] The page title should start with {string}")
    public void iosThePageTitleShouldStartWith(String title) {
        boolean pageTitle = iosPage.isThePageTitleStartWith(title);
        assertTrue(pageTitle);
    }
}
