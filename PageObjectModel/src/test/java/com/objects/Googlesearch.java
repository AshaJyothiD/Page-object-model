package com.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Googlesearch {
	
	WebDriver driver;
	
	public Googlesearch(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By search_box = By.name("q");
	By search_button = By.xpath("//input[@name='btnK']");
	By Facebook_link = By.xpath(" //a//h3[text()='Facebook - log in or sign up']");
	
	public void searchgoogle(String input) {
		try {
			driver.findElement(search_box).sendKeys(input);
			driver.findElement(search_button).click();
			}
		catch(Exception e) {
			System.out.println("Exceptions caught" + e.getMessage());
		}
		
	}
	
	public void clickFacebook() {
		try {
			driver.findElement(Facebook_link).click();
		}
		catch(Exception e) {
			System.out.println("Exception caught" +e.getMessage());
		}
		
	}
	

}
