package com.github.binarySmile.todolistmeautotest.tests;

import com.github.binarySmile.todolistmeautotest.core.BaseTest;
import com.github.binarySmile.todolistmeautotest.core.pageobjects.pages.MainPage;
import com.github.binarySmile.todolistmeautotest.core.pageobjects.pages.PrintPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.page;
import static org.testng.Assert.assertTrue;

public class OpenPageTest extends BaseTest {

    @Test
    public void checkOpenPage() {
        MainPage mainPage = page(MainPage.class);
        mainPage.todoListTitleName();
        assertTrue(mainPage.getByName(titleName).isDisplayed());
    }

    @Test
    public void availabilityOfSortButton() {
        MainPage mainPage = page(MainPage.class);
        mainPage.sortButton();
        assertTrue(mainPage.sortButton().isDisplayed());
    }

    @Test
    public void availabilityOfPrintButton() {
        PrintPage printPage = page(PrintPage.class);
        printPage.printButton();
        assertTrue(printPage.printButton().isDisplayed());
    }

    @Test
    public void availabilityOfAddListButton() {
        MainPage mainPage = page(MainPage.class);
        mainPage.addListButton();
        assertTrue(mainPage.addListButton().isDisplayed());
    }

    @Test
    public void availabilityOfAddCategoryButton() {
        MainPage mainPage = page(MainPage.class);
        mainPage.addCategoryButton();
        assertTrue(mainPage.addCategoryButton().isDisplayed());
    }
}
