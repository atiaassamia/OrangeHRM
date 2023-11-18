package model;

import org.openqa.selenium.By;

public class LoginPageLocator {

   // public static By UserName = By.xpath("//input[@placeholder='Username']");
    public static By UserName = By.xpath("//input[@name='username']");

    public static By Password = By.xpath("//input[@name='password']");

    //public static By ClickContinueButton = By.xpath("//button[normalize-space()='Continue']");

    public static By loginButton = By.xpath("//button[normalize-space()='Login']");
}
