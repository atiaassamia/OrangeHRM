package testPackage;

import model.TimeOut;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pages.LogoutPage;
import pages.UserManagementPage;

public class LogoutTest extends UserManagementTest {

    public static FirefoxDriver driver;
    TimeOut waitTime = new TimeOut();

    @Test(priority = 3)

    public void logout() {

        driver = getDriver();

        LogoutPage LgOut  = new LogoutPage(driver);


        System.out.println("Start the test of Log Out page");

        LgOut.ProfileButton();
        waitTime.timeOut(3000);

        LgOut.LogOutButton();
        waitTime.timeOut(5000);

        System.out.println("End of Logout Feature");
    }



}



