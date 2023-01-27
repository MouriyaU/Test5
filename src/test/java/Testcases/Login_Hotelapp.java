package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import Letcode.designpattern.Hotel_App_Login;

public class Login_Hotelapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		Hotel_App_Login halp = new Hotel_App_Login (driver);
		
		halp.enterUerName("mou");
		halp.enterPassword("dgfdgf");
		halp.clickLoginButton();
		
	}

}
