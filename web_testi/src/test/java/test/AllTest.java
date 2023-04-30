package test;

import base.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.CareersPage;
import page.HomePage;
import page.QualityAssurancePage;

import java.io.IOException;

public class AllTest extends BaseTest {

    HomePage homePage;
    CareersPage careersPage;
    QualityAssurancePage qualityAssurancePage;

    @Before
    public void before() {
        homePage = new HomePage(driver);
        careersPage = new CareersPage(driver);
        qualityAssurancePage = new QualityAssurancePage(driver);
    }

    @Test
    public void test() throws InterruptedException, IOException {
        homePage.homePageActions();
        careersPage.careersPageActions();
        qualityAssurancePage.qualityAssurancePageActions();
    }

    @After
    public void after() {
        driver.quit();
    }
}
