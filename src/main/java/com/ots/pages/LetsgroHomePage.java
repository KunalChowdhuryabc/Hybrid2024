package com.ots.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ots.helper.Utility;

public class LetsgroHomePage {

WebDriver driver;
	
public LetsgroHomePage(WebDriver driver)
{
	this.driver=driver;
}

	private By signinButton=By.xpath("/html/body/app-root/app-header/div/div/div[2]/div/div/div/button[2]");
	
	
	private By registernowButton=By.xpath("/html/body/app-root/app-header/div/div/div[2]/div/div/div/button[1]");

	
    private By registerButton=By.xpath("//*[@id=\"navbar\"]/div[1]/div/div/ul/li[1]/a");
    
    
    private By courses=By.xpath("//*[@id=\"navbar\"]/div[2]/ul/li[2]/a");
    
    
    private By jobs=By.xpath("//*[@id=\"navbar\"]/div[2]/ul/li[3]/a");
    
    
    private By ourFeatures=By.xpath("//*[@id=\"navbar\"]/div[2]/ul/li[4]/a");
    
    
    private By services=By.xpath("//*[@id=\"navbar\"]/div[2]/ul/li[5]/a");
    
    
    private By faq=By.xpath("//*[@id=\"navbar\"]/div[2]/ul/li[6]/a");
    
    
    private By aboutus=By.xpath("//*[@id=\"navbar\"]/div[2]/ul/li[7]/a");
    
    
    private By takeatestButton=By.xpath("/html/body/app-root/app-home/div[1]/div[1]/div[1]/div/div[2]/button");
    
    
    private By exploreskillsButton=By.xpath("/html/body/app-root/app-home/div[1]/div[1]/div[2]/div/div[2]/a");
    
    
    private By exploretopicsButton=By.xpath("/html/body/app-root/app-home/div[1]/div[1]/div[4]/div/div[2]/button");


    private By exploreprogramsButton=By.xpath("/html/body/app-root/app-home/div[1]/div[1]/div[3]/div/div[2]/button");

    
    
    
	
	
	public void navigateToSignin()
	{
		
		Utility.getElement(driver,signinButton).click();
    }
	
	
	
	
	public void navigateToRegisternow()
	{
		
		Utility.getElement(driver,registernowButton).click();
    }
	
	
	
	
	public void navigateToRegister()
	{
		
		Utility.getElement(driver,registerButton).click();
    }
	
	
	
	
	public void navigateToCourses()
	{
		
		Utility.getElement(driver,courses).click();
    }
	
	
	
	public void navigateToJobs()
	{
		
		Utility.getElement(driver,jobs).click();
    }
	
	
	
	
	public void navigateToOurFeatures()
	{
		
		Utility.getElement(driver,ourFeatures).click();
    }
	
	
	
	public void navigateToServices()
	{
		
		Utility.getElement(driver,services).click();
    }
	
	
	
	
	public void navigateToFaq()
	{
		
		Utility.getElement(driver,faq).click();
    }
	
	
	
	public void navigateToAboutUs()
	{
		
		Utility.getElement(driver,aboutus).click();
    }
	
	
	
	public void navigateToTakeaTestButton()
	{
		
		Utility.getElement(driver,takeatestButton).click();
    }
	
	
	
	
	public void navigateToExploreSkillsButton()
	{
		
		Utility.getElement(driver,exploreskillsButton).click();
    }
	
	
	
	
	public void navigateToExploreTopicsButton()
	{
		
		Utility.getElement(driver,exploretopicsButton).click();
    }
	
	
	
	public void navigateToExploreProgramsButton()
	{
		
		Utility.getElement(driver,exploreprogramsButton).click();
    }
}



