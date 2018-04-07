package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.CandidatePageElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

    public class SearchField {

        public WebDriver driver = WebDriverSingleton.getInstance();

        public void searchFieldData() {
            WebElement search = driver.findElement(CandidatePageElements.SEARCH_FIELD);
            search.sendKeys("Игорь");
        }

        public void searchingName() {
            WebElement userName = driver.findElement(CandidatePageElements.SEARCHING_NAME);
            Assert.assertEquals("Алексеев Игорь Иванович", userName.getText());
        }
    }