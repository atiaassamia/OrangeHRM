package model;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

    FirefoxDriver driver;

    public CommonMethods(FirefoxDriver driver){


        this.driver = driver;
    }

    public void setText(By fieldText, String inputText){

        driver.findElement(fieldText).sendKeys(inputText);
    }

    public void keyboardAction(By fieldText, Keys keys, Keys keys1){
        driver.findElement(fieldText).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
    }
    public void keyboardEnter(By fieldText, Keys keys){
        driver.findElement(fieldText).sendKeys(Keys.ENTER);
    }
    public void clickOnButton(By btnLocator){


        driver.findElement(btnLocator).click();
    }

    public void clickOnField(By btnLocator){


        driver.findElement(btnLocator).click();
    }





//    public void selectoptionfromDropdown( By element, String option){
//
//        Select dropdown = new Select(element);
//        try {
//            dropdown.selectByVisibleText(option);
//        } catch (Exception e) {
//
//            dropdown.selectByVisibleText(option);
//        }
//
//    }



    public String getLocatorText(By elementsLocator){
        String text = driver.findElement(elementsLocator).getText();

        return text;
    }

}


