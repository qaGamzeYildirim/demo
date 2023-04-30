package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static constants.ConstantsHomePage.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void homePageActions() throws IOException {
        try {
            this.homePageControl();
        }catch (Exception e) {
            screenShot();
            throw e;
        }
    }
    public HomePage homePageControl() {

        verify(insiderLogo);
        return this;
    }
}
