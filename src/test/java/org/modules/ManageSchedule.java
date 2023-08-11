package org.modules;

import org.apache.poi.util.SystemOutLogger;
import org.locators.PageElements;
import org.mainclass.BaseClass;
import org.report.Report;

public class ManageSchedule extends BaseClass implements PageElements{
	public static void manageSchedule() throws Throwable {
	Report.ReportCreateTestcase("Manage Schedule");
	try {
		click(manageSchedule);
	IsElementDisplayed(MSValidate);
	Report.Pass("user navigate to Manage Schedule page Successfully");
	}catch(Exception e) {
		Report.Fail("User failed to navigate into Manage Schedule Page");
	}

}
	public static void createSlot() throws Throwable {
		Report.ReportCreateTestcase("Slot Creation");
		try {
		IsElementDisplayed(MSValidate);
		click(date);
		IsElementDisplayed(dateText);
		click(CreateSlotButton);
		IsElementDisplayed(dateText);
		click(dropdown);	
		click(SaveButton);
		IsElementDisplayed(CreateSuccess);
		Report.Pass("user can create a slot Successfully");
		}catch(Exception e) {
			Report.Fail("User failed to create a slot");
		}
		click(CloseButton);
	}
	public static void deleteSlot() throws Throwable {
		Report.ReportCreateTestcase("Delete Slot Creation");
		try {
		IsElementDisplayed(MSValidate);
		click(date);
		IsElementDisplayed(dateText);
		click(EditSlot);
		IsElementDisplayed(dateText);
		click(deleteSlot);	
		IsElementDisplayed(availableslot);
		IsElementDisplayed(myAccount);
		Report.Pass("user can create a slot Successfully");
		}catch(Exception e) {
			Report.Fail("User failed to create a slot");
		}
		
	}
	

}