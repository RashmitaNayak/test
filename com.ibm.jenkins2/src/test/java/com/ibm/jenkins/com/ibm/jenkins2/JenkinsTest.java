package com.ibm.jenkins.com.ibm.jenkins2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsTest {
	WebDriver driver;
  @Test
  public void checktest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\seleniumsetupfiles\\chromedriver_win32\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.get("http://elearning.hommelle.com");
 String actual = driver.getTitle();
 System.out.println(actual);
 String expect = "elearning";
 Assert.assertEquals(actual,expect);
  }
}
