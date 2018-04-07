package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.CandidatePageElements;
import edu.bsuir.web.element.LoginElements;
import edu.bsuir.web.element.ResumeCreation;
import edu.bsuir.web.page.CandidatesPage;
import edu.bsuir.web.page.CandidatesProfile;
import org.junit.Assert;
import org.junit.Before;
import edu.bsuir.web.element.LoginElements;
import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.After;
import org.openqa.selenium.interactions.Actions;
import edu.bsuir.web.page.LoginPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;


public class CandidatesCreateProfile {

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
    public void CreateCandidate() { //создание кандидата с валидными данными и его удаление

        cpage.enterCandidatePage();
        cp.createButton();
        cp.Surname();
        cp.Name();
        cp.secondName();
        cp.Telephone();
        cp.Email();
        cp.Skype();
        cp.Country();
        cp.Adress();
        cp.Relocation();
        cp.DD();
        cp.MM();
        cp.YYYY();
        cp.EducationResume();
        cp.Position();
        cp.saveButton();
        cp.SleepWait();
        cp.removeButton();
        cp.acceptButton();
    }

    @After
    public void shutDown() {
        driver.close();
    }

    }