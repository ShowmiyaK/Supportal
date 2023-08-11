package org.modules;

import org.locators.PageElements;
import org.mainclass.BaseClass;
import org.report.Report;

public class LogOutModule extends BaseClass implements PageElements{

	public static void LogOut() throws Throwable {
		Report.ReportCreateTestcase("Log Out the application");
		try {
			IsElementDisplayed(availableslot);
			IsElementDisplayed(myAccount);
			click(myAccount);
			click(logout);
			Report.Pass("User Logged Out successfully");
		}catch(Exception e) {

			Report.Fail("user failed to Log out");
		}
		Report.ReportCooldown();	
	}
}
