package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customers {
	
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */
	public static void createCustomer(WebDriver oBrowser)
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Mercury1");
			oBrowser.findElement(By.xpath("//textarea[@id='customerLightBox_descriptionField']")).sendKeys("Customer-Mercury1 will be created");
	        oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(3000);
			
			
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */
	public static void modifyCustomer(WebDriver oBrowser)
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='    Active    ']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[@class='cpInfo']/preceding-sibling::div[@class='closeButton']")).click();
			Thread.sleep(3000);
			
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */
	public static void deleteCustomer(WebDriver oBrowser)
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			Thread.sleep(3000);
			

		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
