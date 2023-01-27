package Letcode.designpattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Hotel_App_Login {

	
	WebDriver driver;
	public Hotel_App_Login(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	//locator fot usname
	
	By usr_name = By.id("username");
	
	// locators for pswd
	
	By usr_pwd = By.id("password");
	
	//locators for login button
	
	By lgn_btn = By.id("login");
	
	//methode to enter username
	
	public void enterUerName(String username)
	{
		driver.findElement(usr_name).sendKeys(username);
	}
	
	
	// methode for pswd 
	
	public void enterPassword(String password)
	{
		driver.findElement(usr_pwd).sendKeys(password);
	}
	
	//method login button
	public void clickLoginButton()
	{
		driver.findElement(lgn_btn).click();
	}
}
