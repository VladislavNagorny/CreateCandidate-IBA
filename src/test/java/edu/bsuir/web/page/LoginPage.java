package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.CandidatePageElements;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import edu.bsuir.web.element.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    WebDriver driver = WebDriverSingleton.getInstance();


    public void enterLoginPage() {
        driver.get(LoginElements.URL);
    }

    public void typeUsername(String username){
        WebElement element = driver.findElement(LoginElements.USERNAME);
        element.sendKeys(username);
    }

    public void typePassword(String password) {
        WebElement element1 = driver.findElement(LoginElements.PASSWORD);
        element1.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement element = driver.findElement(LoginElements.LOGIN_BUTTON);
        element.click();
    }

    public void checkRealName() {
        WebElement userName = driver.findElement(LoginElements.REAL_NAME);
        Assert.assertEquals("Александр Евгеньевич Кабанов", userName.getText());
    }

    }