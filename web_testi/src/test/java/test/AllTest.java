package test;

import base.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.CareersPage;
import page.HomePage;
import page.QualityAssurancePage;

public class AllTest extends BaseTest {

    HomePage homePage;
    CareersPage careersPage;
    QualityAssurancePage qualityAssurancePage;

    @Before
    public void before(){
        homePage = new HomePage(chrome);
        careersPage = new CareersPage(chrome);
        qualityAssurancePage = new QualityAssurancePage(chrome);

        //careersPage = new CareersPage(firefox);
        //homePage = new HomePage(firefox);

    }

    @Test
    public void test() throws InterruptedException {
        homePage.homePageControl();
        careersPage.clickMore().clickCareers().careersPageControl().careerPageTeamsBlockControl().careerPageLocationBlockControl().careerPageLifeAtInsiderBlockControl();
        qualityAssurancePage.clickSeeAllTeamsButton().clickQualityAssurance().clickSeeAllQAJobs().filterByLocations().controlDepartments().jobListControl().jobClick();
    }

    @After
    public void after(){
        chrome.quit();
    }
}
