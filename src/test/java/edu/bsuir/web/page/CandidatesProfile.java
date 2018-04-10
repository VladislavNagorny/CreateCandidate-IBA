package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.CandidatePageElements;
import edu.bsuir.web.element.LoginElements;
import edu.bsuir.web.element.ResumeCreation;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CandidatesProfile {

    WebDriver driver = WebDriverSingleton.getInstance();

    public void createButton() {
        WebElement create_Button = driver.findElement(ResumeCreation.CREATE_BUTTON);
        create_Button.click();
    }

    public void Surname() {
        WebElement surname = driver.findElement(ResumeCreation.SURNAME);
        surname.sendKeys("Фомичева");
    }

    public void Name() {
        WebElement name = driver.findElement(ResumeCreation.NAME);
        name.sendKeys("Екатерина");
    }

    public void secondName() {
        WebElement second_Name = driver.findElement(ResumeCreation.SECOND_NAME);
        second_Name.sendKeys("Евгеньевна");
    }

    public void Telephone() {
        WebElement telephone = driver.findElement(ResumeCreation.PRIMARY_TELEPHONE);
        telephone.sendKeys("+375 29 352 82 34");
    }

    public void Email() {
        WebElement email = driver.findElement(ResumeCreation.PRIMARY_EMAIL);
        email.sendKeys("ekaterinafomi4eva@mail.ru");
    }

    public void Skype() {
        WebElement skype = driver.findElement(ResumeCreation.SKYPE);
        skype.sendKeys("ekat_fomi4eva");
    }

    public void Country() {
        WebElement country = driver.findElement(ResumeCreation.COUNTRY);
        country.sendKeys("Беларусь");
    }

    public void Adress() {
        WebElement address = driver.findElement(ResumeCreation.ADDRESS);
        address.sendKeys("Минск, улица Петруся Бровки 6/2");
    }

    public void Relocation() {
        WebElement relocation = driver.findElement(ResumeCreation.RELOCATION);
        relocation.click();
    }

    public void DD() {
        WebElement dd = driver.findElement(ResumeCreation.DD);
        dd.sendKeys("05");
    }

    public void MM() {
        WebElement mm = driver.findElement(ResumeCreation.MM);
        mm.sendKeys("11");
    }

    public void YYYY() {
        WebElement yyyy = driver.findElement(ResumeCreation.YYYY);
        yyyy.sendKeys("1989");
    }

    public void EducationResume() {
        Select dropdown = new Select(driver.findElement(ResumeCreation.EDUCATION_RESUME));
        dropdown.selectByValue("4");
    }

    public void Position() {
        WebElement position = driver.findElement(ResumeCreation.POSITION);
        position.sendKeys("Программист");
    }

    public void saveButton() {
        WebElement save_Button = driver.findElement(ResumeCreation.SAVE_BUTTON);
        save_Button.click();
    }

    public void SleepWait() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public void removeButton() {
        WebElement remove_Button = driver.findElement(ResumeCreation.REMOVE_BUTTON);
        remove_Button.click();
    }

    public void acceptButton() {
        WebElement accept_Remove = driver.findElement(ResumeCreation.ACCEPT_REMOVE);
        accept_Remove.click();
    }

    public void cancelButton() {
        WebElement cancel_Button = driver.findElement(ResumeCreation.CANCEL);
        cancel_Button.click();
    }

    public void BackToCandidatesMainPage() {
        WebElement cand = driver.findElement(CandidatePageElements.CANDIDATE_PAGE);
        Assert.assertEquals("Опыт работы", cand.getText());
    }

    public void LoadCVLink() {
        driver.findElement(By.id("loadCVLink")).click();
    }

    public void LoadCVLinkAccept() {
        driver.findElement(By.xpath("//button[text() = 'OK']")).click();
    }
}