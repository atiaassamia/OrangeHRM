package model;

import org.openqa.selenium.By;


public class AdminUserManagementLocator {


    public static By adminButton = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)");

    public static By Username = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");

   public static By UserRole = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]");

    public static By UserRoleoption = By.cssSelector("[role='option']:nth-child(3)");

    public static By EmployeeName = By.xpath("//input[@placeholder='Type for hints...']");


    //public static By EmployeeNamehint = By.cssSelector("[role='listbox']:nth-child(1)");
    //public static By EmployeeNamehint = By.cssSelector("div[role='listbox']");
   // public static By EmployeeNamehint = By.xpath("//span[contains(text(),'Pratik')]");
    public static By EmployeeNamehint = By.xpath("//div[@role='option']");

    public static By Status = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]");

    public static By StatusOption = By.cssSelector("[role='option']:nth-child(2)");

    public static By Search = By.cssSelector("button[type='submit']");

}
