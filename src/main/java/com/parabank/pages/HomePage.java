package com.parabank.pages;

import com.parabank.base.BasePage;

public class HomePage extends BasePage {
    public String getHomePageTitle() {
        return getTitle();
    }

    public boolean isHomePageDisplayed() {
        return getHomePageTitle().contains("ParaBank");
    }
}
