package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownExample {
	@Test
	public void dropDown() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		WebElement month_Dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_Dropdown);
		
//		month_dd.selectByIndex(9);
//		Thread.sleep(5000);
//		month_dd.selectByValue("9");
//		Thread.sleep(5000);
//		month_dd.selectByVisibleText("Dec");
//		Thread.sleep(5000);
		
		WebElement option = month_dd.getFirstSelectedOption();
		String monthindex = option.getText();
		System.out.println("By default it was selected: "+monthindex);
		
		month_dd.selectByIndex(10);
		//WebElement option1 =month_dd.getFirstSelectedOption();
		//String monthindex1 = option1.getText();
		System.out.println(month_dd.getFirstSelectedOption().getText());
		//System.out.println("Month selected by Index: "+monthindex1);
		
		Thread.sleep(10000);
		driver.quit();
		
		
		
	}
	

}
