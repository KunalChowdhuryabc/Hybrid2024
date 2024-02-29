package com.ots.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ots.helper.Utility;

public class BeforeLoginJobsPage {

WebDriver driver;
	
	public BeforeLoginJobsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By jobs=By.xpath("//*[@id=\"navbar\"]/div[2]/ul/li[3]/a");
	
	private By browseJobs=By.xpath("//*[@id=\"mat-tab-content-3-0\"]/div/div/div/div[1]/div/div/div[2]/div[3]/div[2]/button");

	private By downloadJD=By.xpath("/html/body/app-root/app-jobdetails/div/div/div[1]/div[1]/div/div[2]/div[4]/div[2]/div/span[1]/button");
	
	private By applyNow=By.xpath("/html/body/app-root/app-jobdetails/div/div/div[1]/div[1]/div/div[2]/div[4]/div[2]/div/span[2]");
   




public void navigateToJobs()
{
	
	Utility.getElement(driver,jobs).click();

}



public void navigateToBrowseJobs()
{
	
	Utility.getElement(driver,browseJobs).click();

}



public void navigateToDownloadJD()
{
	
	Utility.getElement(driver,downloadJD).click();

}




public void navigateToApplyNow()
{
	
	Utility.getElement(driver,applyNow).click();

}
}

