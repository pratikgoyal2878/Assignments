package com.utilities;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationBase {

    public static WebDriver driver;

    public AutomationBase(WebDriver driverInstance) {
        driver = driverInstance;
    }

    public static void launchApp(String url) {
        driver.get(url);
    }

    public static void closeCurrentPage() {
        if (driver != null) {
            driver.close();
        }
    }

    public static String getCurrentWindow() {
        return driver.getWindowHandle();
    }

    public static void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public static void switchToAlert() {
        try {
            driver.switchTo().alert();
        } catch (Exception e) {
            throw e;
        }
    }

    public static int getWindowCount() {
        return driver.getWindowHandles().size();
    }

    public static void switchToWindow(String windowHandle) {
        driver.switchTo().window(windowHandle);
    }

    public static void switchToNewWindow(String parentWindow) {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String winHandle : windowHandles) {
            if (!winHandle.equals(parentWindow)) {
                driver.switchTo().window(winHandle);
            }

        }

    }

    public static void switchToNewWindow(String parentWindow, String ChildWindow) {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String winHandle : windowHandles) {
            if (!winHandle.equals(parentWindow) && !winHandle.equals(ChildWindow)) {
                driver.switchTo().window(winHandle);
            }

        }

    }

    public static void refreshPage() {
        driver.navigate().refresh();
    }

    public static void sendEscapeKey() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE);
    }

    public static void sendDownArrow() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN);
    }

    public static void pressEnter() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER);
    }
    public static WebDriver getDriver() {
        return AutomationBase.driver;

    }

    public static String getTitle() {
        return AutomationBase.driver.getTitle();

    }
}
