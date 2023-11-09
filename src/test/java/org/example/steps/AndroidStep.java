package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.AndroidPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AndroidStep {
    AndroidPage androidPage = new AndroidPage();

    @Given("[Android] I am on the Google search page")
    public void androidIAmOnTheGoogleSearchPage() {
        androidPage.openGoogleChrome();
    }

    @When("[Android] I search for {string}")
    public void androidISearchFor(String query) {
        androidPage.inputSearch(query);
    }

    @Then("[Android] Text in search box changes into {string}")
    public void androidTextInSearchBoxChangesInto(String query) {
        String actual = androidPage.getSearchText();
        assertEquals(query, actual, "Query is not change");
    }
}
