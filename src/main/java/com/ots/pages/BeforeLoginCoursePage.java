package com.ots.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ots.helper.Utility;

public class BeforeLoginCoursePage {

		
		WebDriver driver;
		
		
		public BeforeLoginCoursePage(WebDriver driver)
		
		{
			this.driver=driver;
		}
		
		private By searchTextField=By.xpath("//*[@id=\"txtSearchKeyworld\"]");
		
		private By searchButton=By.xpath("//img[@alt='menu']");
		
		private By ratingsFilter=By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]/span[2]");
		
		private By selectRatings=By.xpath("//*[@id=\"4\"]");
		
		private By skillsFilter=By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]/span[2]");

		private By selectSkills=By.xpath("//*[@id=\"mat-mdc-checkbox-14-input\"]");
		
		private By moreSkills=By.xpath("//*[@id=\"cdk-accordion-child-1\"]/div/div[1]/div/div[6]/div/a");
		
		private By searchSkills=By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/div/div[2]/div/input");
		
		private By selectAnotherSkills=By.xpath("//*[@id=\"mat-mdc-checkbox-5-input\"]");
		
		private By applySelectedAnotherSkills=By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
		
		private By closeSelectedAnotherSkills=By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]");

		private By browseCourse=By.xpath("/html/body/app-root/app-allcourses/div[1]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div/a");
		
		private By clearFilter=By.xpath("//*/html/body/app-root/app-allcourses/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div/button");
		
		private By startLearning=By.xpath("/html/body/app-root/app-course-detail-view/div/div/div/div[2]/div[1]/a[2]");
		
		
		
		
		
		
		
		
		
		
		
		
		public void navigateToSearchTextField()
		{
			
			Utility.getElement(driver,searchTextField).click();
		
		}
		
		
		
		public void navigateToSearchButton()
		{
			
			Utility.getElement(driver,searchButton).click();
		
		}

		
		
		public void navigateToRatingsFilter()
		{
			
			Utility.getElement(driver,ratingsFilter).click();
		
		}
		
		
		
		
		public void navigateToSelectRatings()
		{
			
			Utility.getElement(driver,selectRatings).click();
		
		}
		
		
		
		public void navigateToSkillsFilter()
		{
			
			Utility.getElement(driver,skillsFilter).click();
		
		}
		
		
		
		
		public void navigateToSelectSkills()
		{
			
			Utility.getElement(driver,selectSkills).click();
		
		}
		
		
		
		public void navigateToBrowseCourse()
		{
			
			Utility.getElement(driver,browseCourse).click();
		
		}
		
		
		
		
		public void navigateToClearFilter()
		{
			
			Utility.getElement(driver,clearFilter).click();
		
		}
		
		
		
		public void navigateToStartLearning()
		{
			
			Utility.getElement(driver,startLearning).click();
		
		}
		
		
		
		public void navigateToMoreSkills()
		{
			
			Utility.getElement(driver,moreSkills).click();
		
		}
		
		
		
		public void navigateToSearchSkills()
		{
			
			Utility.getElement(driver,searchSkills).click();
		
		}
		
		
		
		public void navigateToSelectAnotherSkills()
		{
			
			Utility.getElement(driver,selectAnotherSkills).click();
		
		}
		
		
		
		public void navigateToApplySelectedAnotherSkills()
		{
			
			Utility.getElement(driver,applySelectedAnotherSkills).click();
		
		}
		
		
		
		public void navigateToCloseSelectedAnotherSkills()
		{
			
			Utility.getElement(driver,closeSelectedAnotherSkills).click();
		
		}
	}





