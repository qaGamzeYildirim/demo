package constants;

import org.openqa.selenium.By;

public class ConstantsQualityAssurancePage {

    public static final By qualityAssurance = By.xpath("//h3[text()='Quality Assurance']");
    public static final By seeAllQAJobs = By.xpath("//a[normalize-space(text())='See all QA jobs']");
    public static final By filterByLocations = By.cssSelector("#select2-filter-by-location-container");
    public static final By istanbulLocation = By.xpath("//*[text()='Istanbul, Turkey']");
    public static final By filterByDepartment = By.cssSelector("#select2-filter-by-department-container");
    public static final By jobList = By.id("jobs-list");
    public static final By jobListPositionTitleList = By.cssSelector("#jobs-list .position-list-item .position-title");
    public static final By jobListPositionDepartmentList = By.cssSelector("#jobs-list .position-list-item .position-department");
    public static final By jobListPositionLocationList = By.cssSelector("#jobs-list .position-list-item .position-location");
    public static final By applyNowList = By.cssSelector("#jobs-list .position-list-item .btn");
    public static final By applyForThisJob = By.cssSelector("div.postings-btn-wrapper a.postings-btn");
    public static final By applicationForm = By.cssSelector("form#application-form");


}
