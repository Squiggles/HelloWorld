package com.guidewire.web;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumTest extends TestCase {

        /**
         * Create the test case
         *
         * @param testName name of the test case
         */
        public SeleniumTest(String testName)
        {
            super( testName );
        }

        /**
         * @return the suite of tests being tested
         */
        public static Test suite()
        {
            return new TestSuite( SeleniumTest.class );
        }

    public void testWebDriver() {
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://www.guidewire.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Guidewire Software | Deliver Insurance Your Way";

        Assert.assertEquals(actualTitle, expectedTitle);

        driver.quit();
    }

    public void testWebMail() {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://mail.guidewire.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl + "/owa/auth/logon.aspx?replaceCurrent=1&url=https%3a%2f%2fmail.guidewire.com%2fowa%2f");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("skushekbayev");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Balapan15!");
        driver.findElement(By.cssSelector("input.btn")).click();
        driver.findElement(By.xpath("//a[@id='newmsgc']/span")).click();
        Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
        Iterator<String> itererator = windowId.iterator();

        String mainWinID = itererator.next();
        String  newAdwinID = itererator.next();

        driver.switchTo().window(newAdwinID);
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | title=Untitled Message | ]]
        driver.findElement(By.id("divTo")).click();
        driver.findElement(By.id("divTo")).clear();
        driver.findElement(By.id("divTo")).sendKeys("skushekbayev@guidewire.com");
        driver.findElement(By.id("txtSubj")).clear();
        driver.findElement(By.id("txtSubj")).sendKeys("Selenium Test");
        driver.findElement(By.xpath("//a[@id='send']/span")).click();

        driver.quit();
    }

}
