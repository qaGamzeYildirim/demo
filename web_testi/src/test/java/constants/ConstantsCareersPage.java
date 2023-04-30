package constants;

import org.openqa.selenium.By;

public class ConstantsCareersPage {
    public static final By moreButton = By.xpath("//a[@id='mega-menu-1']/span[text()='More']");
    public static final By careersButton = By.xpath("//a[@class='d-flex flex-column flex-fill']/h5[text()='Careers']");
    public static final By careerPageControl = By.cssSelector("router.career-page");
    public static final By careersTeamsBlock = By.className("elementor-element-b6c45b2");
    public static final By careersLocationBlock = By.className("elementor-element-8ab30be");
    public static final By careersLifeAtInsiderBlock = By.className("elementor-element-a8e7b90");
    public static final By seeAllTeamsButton = By.cssSelector(".loadmore");

}
