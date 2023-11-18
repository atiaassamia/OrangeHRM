package pages;

import model.CommonMethods;
import model.LogOutLocator;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogoutPage {


    FirefoxDriver driver;
    CommonMethods commonMethods;

    public LogoutPage (FirefoxDriver driver) {

        this.driver = driver;

        commonMethods = new CommonMethods(driver);

    }

    public void ProfileButton() {

        commonMethods.clickOnButton(LogOutLocator.profileBtn);
    }


    public void LogOutButton() {

        commonMethods.clickOnButton(LogOutLocator.LogoutBtn);
    }


}
