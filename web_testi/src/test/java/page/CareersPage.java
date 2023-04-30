package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static constants.ConstantsCareersPage.*;

public class CareersPage extends BasePage {

    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public void careersPageActions() throws IOException {
        try {
            this.clickMore();
            this.clickCareers();
            this.careersPageControl();
            this.careerPageTeamsBlockControl();
            this.careerPageLocationBlockControl();
            this.careerPageLifeAtInsiderBlockControl();
        } catch (Exception e) {
            screenShot();
            throw e;
        }
    }
    public CareersPage clickMore() {
        click(moreButton);
        return this;
    }

    public CareersPage clickCareers() {
        click(careersButton);
        return this;
    }

    public CareersPage careersPageControl() {
        verify(careerPageControl);
        return this;
    }

    public CareersPage careerPageTeamsBlockControl() {
        scroll(careersTeamsBlock);
        verify(careersTeamsBlock);
        return this;
    }

    public CareersPage careerPageLocationBlockControl() {
        scroll(careersLocationBlock);
        verify(careersLocationBlock);
        return this;
    }

    public CareersPage careerPageLifeAtInsiderBlockControl() {
        scroll(careersLifeAtInsiderBlock);
        verify(careersLifeAtInsiderBlock);
        return this;
    }

}
