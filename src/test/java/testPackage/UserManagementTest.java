package testPackage;

import model.TimeOut;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pages.UserManagementPage;

import static base.BaseClass.getDriver;

public class UserManagementTest extends LoginTest {
    public static FirefoxDriver driver;
    TimeOut waitTime = new TimeOut();

    @Test(priority = 2)

    public void UManagement() {


       // FirefoxDriver driver = getDriver();
      driver = getDriver();

        UserManagementPage UM  = new UserManagementPage(driver);


        System.out.println("Start the test of the Admin/ User Management page");

        UM.AdminButton();
        waitTime.timeOut(6000);

       UM.UserNameField();
        waitTime.timeOut(4000);

        UM.UserRoleField();
        waitTime.timeOut(6000);

        UM.UserRoleFieldOptionSelect();
        waitTime.timeOut(6000);


        UM.EmployeeNameField();
        waitTime.timeOut(3000);

        UM.EmployeeNamehint();
        waitTime.timeOut(3000);

       UM.StatusField();
       waitTime.timeOut(3000);

        UM.StatusFieldOptionSelect();
        waitTime.timeOut(3000);

        UM.SearchButton();
        waitTime.timeOut(4000);
    }

}
