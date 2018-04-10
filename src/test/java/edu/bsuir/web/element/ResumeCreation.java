package edu.bsuir.web.element;

import org.openqa.selenium.By;

public class ResumeCreation {

    //public static final String URL = "http://testing.cld.iba.by/web/guest/recruiting/candidates?p_p_id=TCCandidates_WAR_TCRecruitingAndOnboardingportlet";
    public static final By CREATE_BUTTON = By.id("createProfileButton");
    public static final By SAVE_BUTTON = By.id("saveButton");
    public static final By REMOVE_BUTTON = By.xpath("//a[@class = 'btn btn-secondary-danger']");
    public static final By ACCEPT_REMOVE = By.xpath("//button[text() = 'Удалить']");
    public static final By EDUCATION_RESUME = By.xpath("//div[@class='controls']//select");
    public static final By RELOCATION = By.id("relocation");


    public static final By NAME = By.id("name");
    public static final By SURNAME = By.id("surname");
    public static final By SECOND_NAME = By.id("secondName");
    public static final By PRIMARY_TELEPHONE = By.id("primaryTelephone");
    public static final By PRIMARY_EMAIL = By.id("primaryEmail");
    public static final By SKYPE = By.id("skype");
    public static final By COUNTRY = By.id("country");
    public static final By ADDRESS = By.id("city");
    public static final By DD = By.id("dateOfBirthDay");
    public static final By MM = By.id("dateOfBirthMonth");
    public static final By YYYY = By.id("dateOfBirthYear");

    public static final By POSITION = By.id("desiredPosition");

    public static final By ADDITIONALLY = By.id("additionalInfo");
    public static final By CANCEL = By.id("cancelButton");
    public static final By RESUME_DOWNLOAD = By.id("loadCVLink");
    public static final By RESUME_DOWNLOAD_ACCEPT = By.xpath("//button[text() = 'OK']");
    public static final By BACK_TO_LIST = By.xpath("//a[@href = 'http://testing.cld.iba.by/web/guest/recruiting/candidates/-/candidates/']");
    public static final By CHANGE_IMAGE = By.id("changeImgLink");

    public static final By EDUCATION = By.xpath("//a[@href = '#tab-8']");

    public static final By EXPIRIENCE = By.xpath("//a[@href = '#tab-2']");

    public static final By MOTIVATION = By.xpath("//a[@href = '#tab-3']");

    public static final By RECOMMENDATIONS = By.xpath("//a[@href = '#tab-6']");




    }
