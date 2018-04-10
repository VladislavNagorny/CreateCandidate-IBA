package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.util.helper.Helper;
import edu.bsuir.web.page.CandidatesPage;
import edu.bsuir.web.page.CandidatesProfile;
import edu.bsuir.web.page.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class UploadImage {

    private WebDriver driver = WebDriverSingleton.getInstance();
    LoginPage lp = new LoginPage();
    CandidatesPage cp1 = new CandidatesPage();
    CandidatesProfile cp = new CandidatesProfile();

    @Test
    public void uploadFileUsingSelenium() {
        cp1.enterCandidatePage();
        cp.createButton();
        cp.LoadCVLink();
        cp.LoadCVLinkAccept();
        sendFile(getAbsolutePath("D:\\IBA\\IBA_App.doc"));
    }

    private void login() {
        lp.enterLoginPage();
        lp.typeUsername("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        lp.checkRealName();
    }

    @Test
    public void uploadFileUsingRobot() {
        login();
        cp1.enterCandidatePage();
        cp.createButton();
        cp.LoadCVLink();
        cp.LoadCVLinkAccept();
        sendFile(getAbsolutePath("D:\\IBA\\IBA_App.doc"));
    }

    private void sendFile(String path) {
        try {
            setClipboardData(path);
            Robot robot = new Robot();
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public String getAbsolutePath(String file) {
        Path path = Paths.get(file);
        return path.toAbsolutePath().toString();
    }

    private void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    @Test
    public void uploadFileUsingSikuli() throws Exception {

        Pattern filePath = new Pattern("resources/sikuli/FilePath.JPG");
        Pattern openButton = new Pattern("resources/sikuli/OpenButton.JPG");
        login();
        cp1.enterCandidatePage();
        cp.createButton();
        cp.LoadCVLink();
        cp.LoadCVLinkAccept();

        Screen screen = new Screen();
        screen.wait(filePath, 20);
        screen.type(filePath, getAbsolutePath("D:\\IBA\\IBA_App.doc"));
        screen.click(openButton);
        Helper.waitForTime(3);

    }

    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }

}
