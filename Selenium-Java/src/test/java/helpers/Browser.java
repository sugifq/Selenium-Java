package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static WebDriver driver = null;

    public static WebDriver getInstance(){
        if(driver == null){
            chromeDriver();
            driver = new ChromeDriver();
        }
        return driver;
    }


    final static String dir =  System.getProperty("user.dir");
    static String driverPath="";

    private static void chromeDriver(){
//        System.out.println("Current dir :"+dir);
        // download from https://chromedriver.chromium.org/downloads
        if (System.getProperty("os.name").equals("Linux")){
            // ubuntu chrome driver
            driverPath = dir+"/driver/chromedriver";
        }else{
            // win32 chrome driver
            driverPath = dir+"/driver/chromedriver.exe";
        }
        System.setProperty("webdriver.chrome.driver", driverPath);
    }
}
