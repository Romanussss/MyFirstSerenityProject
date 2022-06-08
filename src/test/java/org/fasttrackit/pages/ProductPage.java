package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductPage extends PageObject {
    @FindBy(css = "body > div.wrapper > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul")
    private WebElementFacade list;

    public void clickAddToCart
}

