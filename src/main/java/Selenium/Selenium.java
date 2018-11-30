package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Selenium {
	@Test

	public void testSearch()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Nilmie\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/register.php");
		
		
		//driver.findElement(By.id("user_title")).sendKeys("Selenium");
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.linkText("Selenium - Web Browser Automation"));
		//driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
		//String webTitle = driver.getTitle();
		
		//Assert.assertEquals(webTitle, "Selenium - Web Browser Automation");
		//driver.close();
		//driver.quit();
		
		Select Title = new Select(driver.findElement(By.id("user_title")));
		Title.selectByVisibleText("Mrs");
		Title.selectByIndex(1);
		
		driver.findElement(By.id("user_firstname")).sendKeys("Nilmie");
		driver.findElement(By.id("user_surname")).sendKeys("Gamhewa");
		driver.findElement(By.id("user_phone")).sendKeys("0772273515");
		
		
		Select BirthYear = new Select(driver.findElement(By.id("user_dateofbirth_1i")));
		BirthYear.selectByVisibleText("1988");
		
		Select BirthMonth = new Select(driver.findElement(By.id("user_dateofbirth_2i")));
		BirthMonth.selectByVisibleText("January");
		
		Select BirthDate = new Select(driver.findElement(By.id("user_dateofbirth_3i")));
		BirthDate.selectByVisibleText("21");
		
		//driver.findElement(By.id("licencetype_t")).sendKeys("Full");
		
		WebElement Full = driver.findElement(By.id("licencetype_t"));
		WebElement Provisional = driver.findElement(By.id("licencetype_f"));
		
		Provisional.click();
		
	
		Select licenceperiod = new Select(driver.findElement(By.id("user_licenceperiod")));
		licenceperiod.selectByVisibleText("1");

		Select occupation = new Select(driver.findElement(By.id("user_occupation_id")));
		occupation.selectByVisibleText("Academic");
		
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("Pannipitiya");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Maharagama");
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("Sri Lanka");
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("10230");
		driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("nilmie.gamhewa@gmail.com");
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("1234");
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		
		driver.close();
		driver.quit();
	}
}
