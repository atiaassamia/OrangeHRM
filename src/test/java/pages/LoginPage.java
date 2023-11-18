package pages;

import base.BaseClass;
import model.CommonMethods;
import model.LoginPageLocator;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage extends BaseClass {

    FirefoxDriver driver;
    CommonMethods commonMethods;

    public LoginPage (FirefoxDriver driver) {

        this.driver = driver;

        commonMethods = new CommonMethods(driver);

    }


    public void userNameInput() {

        commonMethods.setText(LoginPageLocator.UserName, "Admin");
    }

    public void PasswordInput() {

        commonMethods.setText(LoginPageLocator.Password, "admin123");
    }
    public void LoginButton() {

        commonMethods.clickOnButton(LoginPageLocator.loginButton);
    }

}
