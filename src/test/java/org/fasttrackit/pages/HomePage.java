package org.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {
    @FindBy(id = "search")
    private WebElement searchBar;


}
