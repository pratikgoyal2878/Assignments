package com.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Utility {

    public static Logger logger = LogManager.getLogger(Utility.class);
    public static WebDriver driver;
    public static FileInputStream fileInputStream = null;
    public static XSSFWorkbook workbook = null;
    public static XSSFSheet sheet = null;

    public Utility() {

    }

    public Utility(WebDriver driverInstance) {
        driver = driverInstance;
    }

    public static boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean isDisplayedJS(WebElement element) {
        try {
            return (boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete;", element);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void clickElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void hoverOnElement(WebElement element) {
        try {
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void sendDownArrow() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN);
    }

    public static void pressEnter() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER);
    }

    public static void sendKeys(WebElement element, String value) {
        try {
            element.sendKeys(value);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void clickToRightOf(String tag, WebElement element) {
        try {
            driver.findElement(with(By.tagName(tag)).toRightOf(element)).click();
        } catch (Exception e) {
            System.out.println("Exception:: " + e);
            e.printStackTrace();
        }
    }

    public void submitForm(WebElement element) {
        try {
            element.submit();
        } catch (Exception e) {
            throw e;
        }
    }

    public static String getText(WebElement element) {
        try {
            return element.getText();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void scrollToElement(WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void clickElementJS(WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            throw e;
        }
    }

    public static String getAppUrl(String app) throws Exception {
        XSSFSheet sheetData = null;
        String appName = null;
        String appUrl = null;

        //Reading appUrl from properties file
        /*
         * try { FileReader reader = new
         * FileReader("./src/test/resources/app.properties"); Properties p = new
         * Properties(); p.load(reader); appUrl = p.getProperty("appUrl"); } catch
         * (Exception e) { throw e; }
         */

        //Reading appUrl from excel spreadsheet
        sheetData = getSheetData("./src/test/resources/data/AppData.xlsx", "ItemDetails");
        //appName = getValBasedonColNum(sheetData, "App", 0);
        //appUrl = getValBasedonColNum(sheetData, "App", 1);
        //System.out.println("**************"+getValBasedonColNum(sheetData, app, 1));
        return getValBasedonColNum(sheetData, app, 1);

        //return appUrl;
    }

    public static void main_test(String args[]) throws Exception {
        XSSFSheet sheetData = null;
        String appName = null;
        String appUrl = null;

        //Reading appUrl from properties file
        /*
         * try { FileReader reader = new
         * FileReader("./src/test/resources/app.properties"); Properties p = new
         * Properties(); p.load(reader); appUrl = p.getProperty("appUrl"); } catch
         * (Exception e) { throw e; }
         */

        //Reading appUrl from excel spreadsheet
        sheetData = getSheetData("./src/test/resources/data/AppData.xlsx", "ItemDetails");
        appName = getValBasedonColNum(sheetData, "ShoppingApp", 0);
        appUrl = getValBasedonColNum(sheetData, "ShoppingApp", 1);
        System.out.println("appName: " + appName);
        System.out.println("appUrl: " + appUrl);
    }

    public static WebElement returnElement(WebElement element, String action) {
        WebElement pageElement = element;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            switch (action) {
                case "visible":
                    wait.until(ExpectedConditions.visibilityOf(element));
                    pageElement = element;
                    break;
                case "clickable":
                    wait.until(ExpectedConditions.elementToBeClickable(element));
                    pageElement = element;
                    break;
                case "scrollTo":
                    Actions actions = new Actions(driver);
                    actions.moveToElement(element);
                    actions.perform();
                    wait.until(ExpectedConditions.visibilityOf(element));
                    pageElement = element;
                    break;
                case "invisible":
                    wait.until(ExpectedConditions.invisibilityOf(element));
                    pageElement = element;
                    break;
            }
        } catch (Exception e) {
            logger.info("Caught an exception at returnElement() " + e);
            throw e;
        }
        return pageElement;
    }

    public static XSSFSheet getSheetData(String fileName, String sheeName) throws Exception {
        try {
            fileInputStream = new FileInputStream(new File(fileName)); // "C://Users//VasudevB//Downloads//EC_Test_Scripts_AutomationV1.xlsx"

            // Create Workbook instance holding reference to .xlsx file
            workbook = new XSSFWorkbook(fileInputStream);

            // Get first/desired sheet from the workbook
            sheet = workbook.getSheet(sheeName);
            fileInputStream.close();
            return sheet;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getValBasedonColNum(XSSFSheet sheet, String fieldName, int columnNum) throws Exception {
        boolean isFieldMatched = false;
        String fieldValue = "";

        // Iterate through each rows one by one
        Iterator<Row> rowIterator = sheet.iterator();
//        System.out.println("row count**********"+sheet.getPhysicalNumberOfRows());
        while (rowIterator.hasNext()) {
            try {
                Row row = rowIterator.next();
                // For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                if (isFieldMatched) {
                    break;
                }

//                while (cellIterator.hasNext()) {
                    try {
                        Cell cell = cellIterator.next();
                        // Check the cell type and format accordingly
                        String value = "";
                        switch (cell.getCellType()) {
                            case NUMERIC:
                                value = String.valueOf(cell.getNumericCellValue());
//                                System.out.println("************1"+value);
                                if (value.equals(fieldName)) {
                                    isFieldMatched = true;
                                    // System.out.print(value + "\t");
                                    Cell actualCell = row.getCell(columnNum);

                                    DataFormatter formatter = new DataFormatter();
                                    String val = formatter.formatCellValue(actualCell);

                                    fieldValue = val;
                                    break;
                                }
                                break;
                            case STRING:
                                value = cell.getStringCellValue();
//                                System.out.println("************2"+value);
//                                System.out.println("************2"+fieldName);
                                if (value.equals(fieldName)) {
                                    isFieldMatched = true;

                                    Cell cell1  = cellIterator.next();
                                    value = cell1.getStringCellValue();
//                                    System.out.println("final******"+value);
                                    // System.out.print(value + "\t");
//                                    row = sheet.getRow(row.getRowNum() + 1);
//                                    Cell actualCell = row.getCell(columnNum);
//                                    DataFormatter formatter = new DataFormatter();
//                                    String val = formatter.formatCellValue(actualCell);
                                    fieldValue = value;
                                    break;
                                }
                                break;
                        }
                    } catch (NullPointerException e) {
                        System.out.println("****** Caught an exception while getting fieldData: " + e);
                    }
               // }
            } catch (Exception e) {
                throw e;
            }
        }

        return fieldValue;
    }

    public static void setPositionValue(String fileName, String sheetName, String testCaseIterationID,
                                        int columnTestIteration, int columnPosition, String positionCreated) throws Exception {

        try {
            System.out.println(" ** Updated the value " + fileName + sheetName + testCaseIterationID
                    + columnTestIteration + columnPosition + positionCreated);
            FileInputStream fileInputStream = new FileInputStream(new File(fileName));

            workbook = new XSSFWorkbook(fileInputStream);
            sheet = workbook.getSheet(sheetName);
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Cell actualCell = row.getCell(columnTestIteration);
                DataFormatter formatter = new DataFormatter();
                String val = formatter.formatCellValue(actualCell);
                if (val.contains(testCaseIterationID)) {
                    actualCell = row.getCell(columnPosition);
                    actualCell.setCellValue(positionCreated);
                    break;
                }
            }
            // Write the changes to workbook as shown below
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            workbook.write(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            throw e;
        }
    }

}
