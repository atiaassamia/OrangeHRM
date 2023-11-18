package testPackage;

import base.BaseClass;
import model.TimeOut;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseClass  {

    public static FirefoxDriver driver;
    TimeOut waitTime = new TimeOut();
    @Test(priority = 1)

    public void LoginIntoOrangeHRM(){


        FirefoxDriver driver = getDriver();

        LoginPage login  = new LoginPage(driver);


        System.out.println("Start of Login Feature");

        //login.SignIn();
        waitTime.timeOut(3000);

        login.userNameInput();
        waitTime.timeOut(3000);

        login.PasswordInput();
        waitTime.timeOut(3000);

        login.LoginButton();
        waitTime.timeOut(5000);
    }

}
