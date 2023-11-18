package base;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class BaseClass {

    public static FirefoxDriver driver;

    @BeforeTest

    //public ChromeDriver driverInitialize() {
    public FirefoxDriver driverInitialize() {

        // Create Driver
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        ChromeDriver driver = new ChromeDriver(options);

        driver = new FirefoxDriver();
        // get URL

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Page is opened.");
        driver.manage().window().maximize();
        return driver;
        //return (FirefoxDriver) driver;
        // Sleep for 3 second

        //sleep(3000);

    }

    //    public static ChromeDriver getDriver(){
    public static FirefoxDriver getDriver(){

        return driver;
    }

    @AfterTest

    public void teardown () {

        driver.close();

    }

}
