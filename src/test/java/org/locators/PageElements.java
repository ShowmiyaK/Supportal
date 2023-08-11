package org.locators;

import org.openqa.selenium.By;

public interface PageElements {
	
	By txtuser = By.xpath("(//input[@id='email'])");
	By password = By.xpath("(//input[@type='password'])");
	By signin = By.xpath("(//button[@type='submit'])");
	By welcome = By.xpath("(//h2[text()='Hi '])");
	By eyeicon = By.xpath("(//img[@alt='image'])");
	By myAccount = By.xpath("(//button[@id='button-basic'])");
	By logout = By.xpath("(//a[text()='Logout'])");
	By manageSchedule = By.xpath("(//a[@routerlink='/mentors/manage-schedule'])");
	By date = By.xpath("(//span[text()='24'])");
	By dateText = By.xpath("(//p[text()='24'])");
	By MSValidate = By.xpath("(//h2[text()='Manage Schedule'])");
	By CreateSlotButton = By.xpath("(//button[text()='Create time slots'])");
	By timeDropdown = By.id("timeslot");
	By dropdown = By.xpath("(//select[@id='timeslot']//child::option[4])");
	By SaveButton = By.xpath("(//button[@type='submit'])");
	By AddSlot = By.xpath("(//span[text()='Add another one'])");
	By Logout = By.xpath("(//span[text()=\"Logout\"])");
	By CreateSuccess = By.xpath("(//h4[text()='Success'])");
	By CloseButton = By.xpath("(//button[@class='btn-close'])");
	By deleteSlot = By.xpath("(//img[@alt='delete']");
	By EditSlot = By.xpath("((//button[text()='Edit Slots'])");
	By HomeSignIn = By.xpath("(//a[@class='nav-link'])[4]");
	By availableslot = By.xpath("(//p[text()='You have 0 available session. '])");
	
}
