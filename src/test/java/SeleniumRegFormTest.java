import data.ChangeBrowser;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobject.MainPage;
import pageobject.RegPage;

import java.time.Duration;

import static data.RandomCompany.*;
import static data.UniformResourceLocator.*;


public class SeleniumRegFormTest {
    @Test
    public void registerDataTest() {
        //WebDriver driver = ChangeBrowser.getBrowser(CHROME_WDM); // chrome с зависимостью WebDriverManager
        WebDriver driver = ChangeBrowser.getBrowser(CHROME);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage()
                .clickRegister();

        RegPage regPage = new RegPage(driver);
        regPage.enterCompany(COMPANY);
        regPage.enterOgrn("1234567890123");
        regPage.enterInn("1234567890");
        regPage.enterAddress(ADDRESS);

        // driver.quit();
    }
}