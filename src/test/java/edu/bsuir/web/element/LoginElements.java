package edu.bsuir.web.element;

import org.openqa.selenium.By;

public class LoginElements {
    public static final String URL = "http://testing.cld.iba.by";

    public static final By USERNAME = By.id("_58_login");
    public static final By PASSWORD = By.id("_58_password");
    public static final By LOGIN_BUTTON = By.xpath("//div[@class = 'button-holder ']//button");
    public static final By REAL_NAME = By.xpath("//div[@class = 'float-box']//div//h3");
//    public static final Element DUMMY_SELECT = new Element("Пример выпадающего списка",
//            By.xpath("//input[@class='123']"));

    public static By getLoginButton(String name){
        return By.xpath("//button[text()=' " + name + " ']");
    }
}
