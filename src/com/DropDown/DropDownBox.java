package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownBox {
	@Test
	public void dropDownBox() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		WebElement month_Dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_Dropdown);
	
		
		WebElement option = month_dd.getFirstSelectedOption();
		String monthindex = option.getText();
		System.out.println("By default it was selected: "+monthindex);
		
		month_dd.selectByIndex(10);
		System.out.println("Month selected by index: "+month_dd.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		month_dd.selectByValue("9");
		System.out.println("Month selected by value: "+month_dd.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		month_dd.selectByVisibleText("Dec");
		System.out.println("Month selected by visible text: "+month_dd.getFirstSelectedOption().getText());
		//Printing the number of options available.
		System.out.println("There are "+month_dd.getOptions().size()+" options available in months.");
		
		//day,year are the id name.
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("22");
		System.out.println("Day selected by value: "+day.getFirstSelectedOption().getText());
		
		day.selectByIndex(22);
		System.out.println("Day selected by index: "+day.getFirstSelectedOption().getText());
		
		day.selectByVisibleText("24");
		System.out.println("Day selected by visible text: "+day.getFirstSelectedOption().getText());
		System.out.println("There are "+day.getOptions().size()+" options available in days.");

		
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("2008");
		System.out.println("Year selected by value: "+year.getFirstSelectedOption().getText());
		
		year.selectByIndex(100);
		System.out.println("Year selected by index: "+year.getFirstSelectedOption().getText());
		
		year.selectByVisibleText("2013");
		System.out.println("Year selected by visible text: "+year.getFirstSelectedOption().getText());
		
		System.out.println("There are "+year.getOptions().size()+" options available in months.");

		driver.quit();
		
		
		
	}
	

}
