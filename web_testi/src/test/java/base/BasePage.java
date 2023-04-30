package base;


import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BasePage {


    WebDriver driver = null;
    WebDriverWait wait = null;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    String strng = null;
    List<WebElement> elements;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).isDisplayed();
        findElement(by).click();
        System.out.println(by + " ögesine tıklandı.");
    }

    public void verify(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        driver.findElement(by).isDisplayed();
        System.out.println(by + " ögesinin kontrolü sağlandı.");
    }

    public void scroll(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        System.out.println("Scroll işlemi yapıldı.");
    }

    public void scrollUp(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println("Scroll işlemi yapıldı.");
    }

    public void jsClick(By by) {
        WebElement element = driver.findElement(by);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        System.out.println(by + " ögesine tıklandı.");
    }

    public void webElementListContainsString(By by, String strng) {
        elements = driver.findElements(by);
        int RowCount = elements.size();
        for (int i = 0; i < RowCount; i++) {
            containsString(elements.get(i), strng);
        }

    }

    public void webElementListEqualString(By by, String strng) {
        elements = driver.findElements(by);
        int RowCount = elements.size();
        for (int i = 0; i < RowCount; i++) {
            assert0(elements.get(i), strng);
        }

    }

    public void assert0(WebElement webElement, String strng) {

        Assert.assertEquals(strng, webElement.getText());
    }

    public void containsString(WebElement webElement, String strng) {
        String a = webElement.getText();
        try {
            if (a.contains(strng)) {
                System.out.println("Obje stringi içeriyor.");

            }
        } catch (Exception e) {

        }
    }

    public void assert1(By by, String strng) {
        WebElement element = driver.findElement(by);
        Assert.assertEquals(strng, element.getAttribute("title"));
    }

    public void hoverElement(WebElement webElement) {

        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).build().perform();
    }

    public void webElementListHoverElement(By by) {
        elements = driver.findElements(by);
        int RowCount = elements.size();
        for (int i = 0; i < RowCount; i++) {
            hoverElement(elements.get(i));
        }


    }

    public void webElementListClick(By by) {
        elements = driver.findElements(by);
        int RowCount = elements.size();
        int randomNum = ThreadLocalRandom.current().nextInt(0, RowCount);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elements.get(randomNum));
    }

    public void focusLastTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public void screenShot() throws IOException {

        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

        File destFile = new File("src/test/ss/testHta.png");
        FileUtils.copyFile(srcFile, destFile);
    }

}


