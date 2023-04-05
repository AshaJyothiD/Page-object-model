package com.objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebooklogin {
       WebDriver driver;
       
       public Facebooklogin(WebDriver driver) {
    	   this.driver = driver;
       }
       
       By username_box = By.id("email");
       By password_box = By.id("pass");
       By login_button = By.xpath("//button[@name='login']");
       
       public void Enterusername() {
    	   driver.findElement(username_box).sendKeys("Tester");
       }
       public void Enterpassword() {
    	   driver.findElement(password_box).sendKeys("test123");
       }
       public void verifylogin() {
    	   driver.findElement(login_button).click();
    	   String title = driver.getTitle();
    	   assertEquals(title, "Facebook - log in or sign up");
    	   		
    	   		
       }

}
