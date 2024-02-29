package com.ots.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ots.helper.Utility;

public class AfterLoginCoursePage {

	WebDriver driver;
	
	
	public AfterLoginCoursePage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	private By searchtextfield=By.xpath("//*[@id=\"txtSearchKeyworld\"]");
	
	private By searchButton=By.xpath("/html/body/app-root/app-header/div/div/div[2]/div/div[2]/div/app-searchcourse/div/div/div/button");
	
	private By findcourse=By.xpath("//*[@id=\"txtSearchKeyworld\"]");

	private By searchcourse=By.xpath("/html/body/app-root/app-header/div/div/div[2]/div/div[2]/div[2]/app-searchcourse/div/div/div/button/font/font");

	private By browsecourse=By.xpath("/html/body/app-root/app-allcourses/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div/div/a");

	private By startyourlearning=By.xpath("/html/body/app-root/app-course-detail-view/div/div/div/div[2]/div[1]/a[2]");
	

	
	
	
	
	
	
	
	


   public void navigateToSearchTextField()
   {
	
	Utility.getElement(driver,searchtextfield).click();

   }



   public void navigateToSearchButton()
  {
	
	Utility.getElement(driver,searchButton).click();

  }
}


