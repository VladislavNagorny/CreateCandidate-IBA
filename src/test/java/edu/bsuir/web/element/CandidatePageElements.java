package edu.bsuir.web.element;

import org.openqa.selenium.By;

public class CandidatePageElements {

    public static By LEFT_ICON = By.id("navigationIcon3");
    public static By CANDIDATES = By.xpath("//*[contains(text(), 'Кандидаты')]");

   // public static final By SEARCH_FIELD = By.id("searchInput");
    public static final By SEARCH_FIELD = By.xpath("//input[@class = 'form-control']");
    public static final By CLEAR_BUTTON = By.id("filter-clear-link");

    public static final By EXPERIENCE = By.id("experience");

    public static final By CHOOSE_VACANCY = By.xpath("//*[@title=\"Выбрать\"]");
    public static final By VACANCY_DESIGNER = By.id("vacancy_filtermultiselect-0");

    public static final By CHOOSE_EDUCATION = By.xpath("//*[@title=\"Выбрать\"]");
    public static final By EDUCATION_EMPTY = By.id("education_filtermultiselect-0");
    public static final By EDUCATION_COM_MID = By.id("education_filtermultiselect-1");
    public static final By EDUCATION_PROF = By.id("education_filtermultiselect-2");
    public static final By EDUCATION_MID_SPEC = By.id("education_filtermultiselect-3");
    public static final By EDUCATION_HIGH = By.id("education_filtermultiselect-4");
    public static final By EDUCATION_PREHIGH = By.id("education_filtermultiselect-5");


    public static final By EDUCATION_LOC = By.xpath("//div[@id='education_filter']/div/b");
    public static final By EDUCATION_LOC1 = By.xpath("//div[@id='education_filter']/div/b");
    public static final By EDUCATION_LOC2 = By.xpath("//div[@id='education_filter']/div/b");
    public static final By EDUCATION_LOC3 = By.xpath("//div[@id='education_filter']/div/b");

    public static final By CHOOSE_UNIVERCITY = By.xpath("//*[@title=\"Выбрать\"]");
    public static final By UNIVERCITY_BSU = By.id("universities_filtermultiselect-0");
    public static final By UNIVERCITY_BSUIR = By.id("universities_filtermultiselect-1");
    public static final By UNIVERCITY_BSEU = By.id("universities_filtermultiselect-2");
    public static final By UNIVERCITY_BSTU = By.id("universities_filtermultiselect-3");

    public static final By CHOOSE_COMPETENCE = By.xpath("//*[@title=\"Выбрать\"]");
    public static final By COMPETENCE_ACCESS = By.id("competencies_filtermultiselect-0");
    public static final By COMPETENCE_NOTE = By.id("competencies_filtermultiselect-1");
    public static final By COMPETENCE_ENGLISH = By.id("competencies_filtermultiselect-2");

    public static final By STATUS_NEW = By.xpath("//div[@id='status_0']/label");
    public static final By CONSIDERED_STATUS = By.xpath("//div[@id='status_1']/label");
    public static final By AVAILABLE_TO_CONSIDER = By.xpath("//div[@id='status_2']/label");
    public static final By HIRED = By.xpath("//div[@id='status_3']/label");

    public static final By MOVE_IS_POSSIBLE = By.xpath("//div[@id='relocation_0']/label");
    public static final By MOVE_IMPOSSIBLE = By.xpath("//div[@id='relocation_1']/label");

    public static final By SEARCHING_NAME = By.xpath("//*[contains(text(), 'Алексеев Игорь Иванович')]");
    public static final By CANDIDATE_PAGE = By.xpath("//div[@class = 'header-font']");

}
