
package com.abbey;

/**
 * It works
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class CreateNewUser {

  private Selenium selenium;

  @Before
  public void setUp() throws Exception {
    WebDriver driver = new FirefoxDriver();
    String baseUrl = "http://localhost:8080/";
    selenium = new WebDriverBackedSelenium(driver, baseUrl);
  }

  @Test
  public void testCreatenewuser() throws Exception {
    selenium.open("/home.seam");
    selenium.click("id=pit21");
    selenium.type("id=pit21", "oyesiji899");
    selenium.type("id=pass291", "oyesiji@gmail.com");
    selenium.type("id=pass29", "folake");
    selenium.type("id=pass30", "folake");
    selenium.click("id=som38");
    selenium.select("id=som38", "label=Male");
    selenium.click("css=option[value=\"Male\"]");
    selenium.click("id=som48");
    selenium.select("id=som48", "label=Female");
    selenium.click("css=#som48 > option[value=\"Female\"]");
    selenium.click("id=capTxt");
    selenium.type("id=capTxt", "999999");
    selenium.click("id=mdlhcb96");
    selenium.waitForPageToLoad("30000");
    selenium.select("id=j_id69:som25", "label=Hausa");
    selenium.select("id=j_id69:som58", "label=Christian-Protestant");
    selenium.select("id=j_id69:som77", "label=Some College");
    selenium.select("id=j_id69:som107", "label=Yes");
    selenium.select("id=j_id69:som121", "label=Yes");
    selenium.select("id=j_id69:som135", "label=Yes");
    selenium.select("id=j_id69:som149", "label=Athletic");
    selenium.select("id=j_id69:som165x", "label=5' 5\" (165cm)");
    selenium.select("id=j_id69:som931", "label=England");
    selenium.select("id=j_id69:som94", "label=Buckinghamshire");
    selenium.select("id=j_id69:som104", "label=Amersham Common");
    selenium.click("id=j_id69:hcb126");
    selenium.waitForPageToLoad("30000");
  }

  @After
  public void tearDown() throws Exception {
    selenium.stop();
    System.out.println("#########  Hoi");
    System.out.println("#########  Hoi33");
    System.out.println("#########  Hoi44");
  }

}
