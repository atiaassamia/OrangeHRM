package pages;

import base.BaseClass;
import model.AdminUserManagementLocator;
import model.CommonMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserManagementPage extends BaseClass {

    FirefoxDriver driver;
    CommonMethods commonMethods;

    public UserManagementPage (FirefoxDriver driver) {

        this.driver = driver;

        commonMethods = new CommonMethods(driver);

    }


    public void AdminButton() {

        commonMethods.clickOnButton(AdminUserManagementLocator.adminButton);
    }

    public void UserNameField() {

        commonMethods.setText(AdminUserManagementLocator.Username, "David.Morris");
    }
    public void UserRoleField() {

        //commonMethods.keyboardAction(AdminUserManagementLocator.UserRole, Keys.ARROW_DOWN,Keys.ENTER);
        commonMethods.clickOnField(AdminUserManagementLocator.UserRole);

    }
    public void UserRoleFieldOptionSelect() {
        //commonMethods.keyboardAction(AdminUserManagementLocator.UserRole, Keys.ARROW_DOWN,Keys.ENTER);
        commonMethods.clickOnField(AdminUserManagementLocator.UserRoleoption);

    }

    public void EmployeeNameField() {

        commonMethods.setText(AdminUserManagementLocator.EmployeeName, "David");

    }

    public void EmployeeNamehint() {

       //commonMethods.keyboardEnter(AdminUserManagementLocator.EmployeeNamehint, Keys.ENTER);
        commonMethods.clickOnField(AdminUserManagementLocator.EmployeeNamehint);
    }

    public void StatusField() {

        commonMethods.clickOnField(AdminUserManagementLocator.Status);
       // commonMethods.keyboardAction(AdminUserManagementLocator.Status, Keys.ARROW_DOWN,Keys.ENTER);
    }
        public void StatusFieldOptionSelect() {

        commonMethods.clickOnField(AdminUserManagementLocator.StatusOption);
    }

    public void SearchButton() {

        commonMethods.clickOnButton(AdminUserManagementLocator.Search);
    }

}
