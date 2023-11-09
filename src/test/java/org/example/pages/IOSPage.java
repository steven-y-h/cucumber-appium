package org.example.pages;

import org.example.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IOSPage extends PageObject {
    @FindBy(id = "TabBarItemTitle")
    WebElement inputURL;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='search']/XCUIElementTypeOther[1]")
    WebElement inputSearch;

    public void inputSearch(String query) {
        inputSearch.sendKeys(query);
        inputSearch.submit();
    }

    public boolean isThePageTitleStartWith(String title) {
        return getDriver().getTitle().toLowerCase().startsWith(title);
    }

    public void openGoogle() {
        inputURL.sendKeys("https://www.google.com");
    }
}
