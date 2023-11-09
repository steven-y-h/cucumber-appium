package org.example.pages;

import io.appium.java_client.android.AndroidDriver;
import org.example.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidPage extends PageObject {
    @FindBy(className = "android.widget.EditText")
    WebElement searchBox;

    @FindBy(className = "android.widget.TextView")
    WebElement searchText;

    @FindBy(className = "android.widget.LinearLayout")
    WebElement searchResult;

    public void inputSearch(String query) {
        searchBox.sendKeys(query);
        searchResult.click();
    }

    public void openGoogleChrome() {
    }

    public String getSearchText() {
        return searchText.getText();
    }
}
