package Letcode.designpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Hotel_App_Second {

	WebDriver driver;
	public Hotel_App_Second(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	//locators for dropdown
	
	By location_dd = By.xpath("//select[@id='location']");
	

	By Hotel_value = By.xpath("//select[@id='hotels']");
	

	By Roomtype_values = By.xpath("//select[@id='room_type']");
	

	By Number_of_rooms = By.id("room_nos");
	
	By Check_in_Date = By.id("datepick_in");
	
	By Check_in_out = By.id("datepick_out");
	
	By Adults_per_room = By.id("adult_room");
	
	By Child_per_room = By.id("child_room");
	
	By Search_button  = By.id("Submit");
	
	By reset_button  = By.id("Reset");
	
	
	//methode to fill up values
	
	public void fillValues(String location, String hotel, String roomtype, String roomcount, String ckndate, String ckodate,String adults,String children)
	
	{
	
		new Select(driver.findElement(location_dd)).selectByValue(location);
		new Select(driver.findElement(Hotel_value)).selectByValue(hotel);
		new Select(driver.findElement(Roomtype_values)).selectByValue(roomtype);
		new Select(driver.findElement(Number_of_rooms)).selectByValue(roomcount);
		
		
	    driver.findElement(Check_in_Date).clear();
		((WebElement) Check_in_Date).sendKeys(ckndate);
		
		
		driver.findElement(Check_in_out).clear();;
		
		((WebElement) Check_in_out).sendKeys(ckodate);
		
		new Select(driver.findElement(Adults_per_room)).selectByValue(adults);
		new Select(driver.findElement(Child_per_room)).selectByValue(children);
		
		
		}
	
	public void Search_button()
	{
		driver.findElement(Search_button).click();
	}
	
	}
	
	
	
	
	
	
	
	
	

