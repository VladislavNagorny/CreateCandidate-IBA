package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.page.CandidatesPage;
import edu.bsuir.web.page.CandidatesProfile;
import edu.bsuir.web.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CreateCandidatesCancelButton {

    public WebDriver driver = WebDriverSingleton.getInstance();

    LoginPage lp = new LoginPage();
    CandidatesProfile cp = new CandidatesProfile();
    CandidatesPage cpage = new CandidatesPage();

    @Before
    public void Login() {
        lp.enterLoginPage();
        lp.typeUsername("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        lp.checkRealName(); // assert
    }

    @Test
    public void cancelButton() { //проверка баттона "Cancel" при создании кандидата

        cpage.enterCandidatePage();
        cp.createButton();
        cp.cancelButton();
        cp.BackToCandidatesMainPage(); //assert
    }
//
//    @After
//    public void shutDown() {
//        driver.close();
//    }
}