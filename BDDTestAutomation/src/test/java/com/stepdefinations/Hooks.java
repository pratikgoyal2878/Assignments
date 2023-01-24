package com.stepdefinations;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utilities.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.objects.LoginPage;
import page.objects.PageObjects;

public class Hooks {

    static WebDriver driver;

    @Before("@FullSuite")
    public void before_launchBrowser(Scenario scenario) {
        if (System.getProperty("browser") == null) {
            String path = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", path+"\\src\\test\\resources\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
//            ChromeOptions options = new ChromeOptions();
//            options.setBinary(new File("/usr/bin/google-chrome"));
//            driver = new ChromeDriver(options);
        } else {
            switch (System.getProperty("browser")) {
                case "Chrome":
                    String path = System.getProperty("user.dir");
                    System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\chromedriver.exe");
                    //WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "Edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "IE":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        initPageDrivers(driver);
        driver.manage().window().maximize();
    }

    public static void initPageDrivers(WebDriver driver) {
        new AutomationBase(driver);
        new PageObjects(driver);
        new Utility(driver);
        new LoginPage(driver);
    }

    @After("@FullSuite")
    public void after_quitBrowser(Scenario scenario) {
        if (scenario.isFailed() && driver != null) {
            byte[] data = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
            driver.quit();
        }
        if (driver != null) {
            driver.quit();
        }
    }

}
