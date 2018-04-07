package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.CandidatePageElements;
import edu.bsuir.web.element.LoginElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CandidatesPage {

    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterLoginPage() {
        driver.get(LoginElements.URL);
    }


    public void enterCandidatePage() {

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(CandidatePageElements.LEFT_ICON);
        actions.moveToElement(element).build().perform();
        WebElement element1 = driver.findElement(CandidatePageElements.CANDIDATES);
        actions.moveToElement(element1).build().perform();
        element1.click();

    }

    public void candidateExperience() {
        Select dropdown = new Select(driver.findElement(CandidatePageElements.EXPERIENCE));
        dropdown.selectByValue("12");
//        dropdown.selectByValue("36");
//        dropdown.selectByValue("60");
    }

    public void statusNew() {
        WebElement status_New = driver.findElement(CandidatePageElements.STATUS_NEW);
        status_New.click();
    }

    public void consideredStatus() {
        WebElement considered_Status = driver.findElement(CandidatePageElements.CONSIDERED_STATUS);
        considered_Status.click();
    }

    public void availableStatus() {
        WebElement available = driver.findElement(CandidatePageElements.AVAILABLE_TO_CONSIDER);
        available.click();
    }

    public void hiredStatus() {
        WebElement hired = driver.findElement(CandidatePageElements.HIRED);
        hired.click();
    }

    public void possibleMove() {
        WebElement possible_Move = driver.findElement(CandidatePageElements.MOVE_IS_POSSIBLE);
        possible_Move.click();
    }

    public void impossibleMove() {
        WebElement impossible_Move = driver.findElement(CandidatePageElements.MOVE_IMPOSSIBLE);
        impossible_Move.click();
    }

    public void Vacancy() {
        WebElement vacancy = driver.findElement(CandidatePageElements.CHOOSE_VACANCY);
        vacancy.click();
    }

    public void vacancyDesigner() {
        WebElement vacancyDesigner = driver.findElement(CandidatePageElements.VACANCY_DESIGNER);
        vacancyDesigner.click();
    }

    public void location3() {
        WebElement loc3 = driver.findElement(CandidatePageElements.EDUCATION_LOC3);
        loc3.click();
    }

    public void Education() {
        WebElement education = driver.findElement(CandidatePageElements.CHOOSE_EDUCATION);
        education.click();
    }

    public void educationEmpty() {
        WebElement education_Empty = driver.findElement(CandidatePageElements.EDUCATION_EMPTY);
        education_Empty.click();
    }

    public void educationMid() {
        WebElement education_Mid = driver.findElement(CandidatePageElements.EDUCATION_COM_MID);
        education_Mid.click();
    }

    public void educationProf() {
        WebElement education_Prof = driver.findElement(CandidatePageElements.EDUCATION_PROF);
        education_Prof.click();
    }

    public void educationSpec() {
        WebElement education_Spec = driver.findElement(CandidatePageElements.EDUCATION_MID_SPEC);
        education_Spec.click();
    }

    public void educationHigh() {
        WebElement education_High = driver.findElement(CandidatePageElements.EDUCATION_HIGH);
        education_High.click();
    }

    public void educationPrehigh() {
        WebElement education_PreHigh = driver.findElement(CandidatePageElements.EDUCATION_PREHIGH);
        education_PreHigh.click();
    }

    public void location() {
        WebElement loc = driver.findElement(CandidatePageElements.EDUCATION_LOC);
        loc.click();
    }

    public void Down() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
    }

    public void chooseUnivercity() {
        WebElement choose_Univercity = driver.findElement(CandidatePageElements.CHOOSE_UNIVERCITY);
        choose_Univercity.click();
    }

    public void UnivercityBSU() {
        WebElement Univercity_BSU = driver.findElement(CandidatePageElements.UNIVERCITY_BSU);
        Univercity_BSU.click();
    }

    public void UnivercityBSUIR() {
        WebElement UnivercityBSUIR = driver.findElement(CandidatePageElements.UNIVERCITY_BSUIR);
        UnivercityBSUIR.click();
    }

    public void UnivercityBSEU() {
        WebElement Univercity_BSEU = driver.findElement(CandidatePageElements.UNIVERCITY_BSEU);
        Univercity_BSEU.click();
    }

    public void UnivercityBSTU() {
        WebElement Univercity_BSTU = driver.findElement(CandidatePageElements.UNIVERCITY_BSTU);
        Univercity_BSTU.click();
    }

    public void location1() {
        WebElement loc1 = driver.findElement(CandidatePageElements.EDUCATION_LOC1);
        loc1.click();
    }

    public void chooseCompetence() {
        WebElement choose_Competence = driver.findElement(CandidatePageElements.CHOOSE_COMPETENCE);
        choose_Competence.click();
    }

    public void competenceAccess() {
        WebElement competence_Access = driver.findElement(CandidatePageElements.COMPETENCE_ACCESS);
        competence_Access.click();
    }

    public void competenceNote() {
        WebElement competenceNote = driver.findElement(CandidatePageElements.COMPETENCE_NOTE);
        competenceNote.click();
    }

    public void competenceEnglish() {
        WebElement competence_English = driver.findElement(CandidatePageElements.COMPETENCE_ENGLISH);
        competence_English.click();
    }

    public void location2() {
        WebElement loc2 = driver.findElement(CandidatePageElements.EDUCATION_LOC2);
        loc2.click();
    }

    public void Up() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)", "");
    }

    public void clearButton() {
        WebElement clear_Button = driver.findElement(CandidatePageElements.CLEAR_BUTTON);
        clear_Button.click();
    }


}
