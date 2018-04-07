package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.CandidatePageElements;
import edu.bsuir.web.element.LoginElements;
import edu.bsuir.web.page.CandidatesPage;
import edu.bsuir.web.page.CandidatesProfile;
import edu.bsuir.web.page.LoginPage;
import edu.bsuir.web.page.SearchField;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchCandidatesField {

    public WebDriver driver = WebDriverSingleton.getInstance();

    LoginPage lp = new LoginPage();
    CandidatesPage cp2 = new CandidatesPage();
    SearchField sf = new SearchField();

    @Before
    public void Login() {
        lp.enterLoginPage();
        lp.typeUsername("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        lp.checkRealName(); // assert
    }

    @Test
    public void SearchField() { // проверка поведения поля поиска
        cp2.enterCandidatePage();
        sf.searchFieldData();
        sf.searchingName(); //assert

    }

//    @After
//    public void shutDown() {
//        driver.close();
//    }

}
