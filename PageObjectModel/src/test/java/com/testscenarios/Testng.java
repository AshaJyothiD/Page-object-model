package com.testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.objects.Facebooklogin;
import com.objects.Googlesearch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng {
	
	WebDriver driver;
	Googlesearch obj;
	
   @BeforeTest
   public void beforetest() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   driver.get("https://www.google.com/");
   }
   
   
    @Test(priority=0)
    public void searchoperation()  {
    	Googlesearch search = new Googlesearch(driver);
    	search.searchgoogle("facebook");
    	
    }
    
    @Test(priority=1)
    public void verifyAndAcessFacebook() throws InterruptedException {
    	obj = new Googlesearch(driver);
    	obj.clickFacebook();
    }	
    @Test(priority=2)
    public void verifyFacebooklogin() {
    	Facebooklogin page = new Facebooklogin(driver);
    	page.Enterusername();
    	page.Enterpassword();
    	page.verifylogin();
    	
    }
    	
     @AfterTest
    public void teardown() {
 	   driver.quit();
    }
}
