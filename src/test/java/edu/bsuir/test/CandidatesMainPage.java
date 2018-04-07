package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.CandidatePageElements;
import edu.bsuir.web.element.LoginElements;
import edu.bsuir.web.element.ResumeCreation;
import edu.bsuir.web.page.CandidatesPage;
import edu.bsuir.web.page.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.After;
import org.openqa.selenium.interactions.Actions;
import edu.bsuir.web.page.LoginPage;
import java.util.concurrent.TimeUnit;


public class CandidatesMainPage {
    public WebDriver driver = WebDriverSingleton.getInstance();

    CandidatesPage cp1 = new CandidatesPage();
    LoginPage lp1 = new LoginPage();


    @Before
    public void Login() {
        lp1.enterLoginPage();
        lp1.typeUsername("kabanov@tc.by");
        lp1.typePassword("welcome");
        lp1.clickLoginButton();
        lp1.checkRealName(); // assert
    }


    @Test
    public void FillingButtons() { //проверка заполнения всех элементов на странице кандидаты и баттона очистить

        cp1.enterCandidatePage();
        cp1.candidateExperience();
        cp1.statusNew();
        cp1.consideredStatus();
        cp1.availableStatus();
        cp1.hiredStatus();
        cp1.possibleMove();
        cp1.impossibleMove();
        cp1.Vacancy();
        cp1.vacancyDesigner();
        cp1.location3();
        cp1.Education();
        cp1.educationEmpty();
        cp1.educationMid();
        cp1.educationProf();
        cp1.educationSpec();
        cp1.educationHigh();
        cp1.educationPrehigh();
        cp1.location();
        cp1.Down();
        cp1.chooseUnivercity();
        cp1.UnivercityBSU();
        cp1.UnivercityBSUIR();
        cp1.UnivercityBSEU();
        cp1.UnivercityBSTU();
        cp1.location1();
        cp1.chooseCompetence();
        cp1.competenceAccess();
        cp1.competenceNote();
        cp1.competenceEnglish();
        cp1.location2();
        cp1.Up();
        cp1.clearButton();
    }

    @After
    public void shutDown() {
        driver.close();
    }

}