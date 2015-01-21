package com.guidewire.web;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

        driver.quit();
    }

}
