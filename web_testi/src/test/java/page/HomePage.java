package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsHomePage.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage homePageControl() {

        verify(insiderLogo);
        return this;
    }
}
