package org.modules;

import org.datadriven.DataDriven;
import org.locators.PageElements;
import org.mainclass.BaseClass;
import org.report.Report;

public class UserSigninWithInvalidvalues extends BaseClass implements PageElements {

	public static void invalidEmail() throws Throwable {
		Report.ReportCreateTestcase("user sigin with invalid");
		browserlaunch("https://dev.supportal.health/");
		try {
			click(HomeSignIn);
			IsElementDisplayed(txtuser);
			sendkeys(txtuser,DataDriven.readData(1, 0, "TestData"));
			sendkeys(password,DataDriven.readData(1, 1, "TestData"));
			click(signin);
			IsElementDisplayed(welcome);
			Report.Pass("Error message displayed successfully");
		}catch(Exception e) {
			Report.Fail("Error message not displayed successfully");
		}
		ToQuit();
	}
	public static void invalidPassword() throws Throwable {
		Report.ReportCreateTestcase("user sigin with invalid");
		try {
			sendkeys(txtuser,DataDriven.readData(1, 0, "TestData"));
			sendkeys(password,DataDriven.readData(1, 1, "TestData"));
			click(signin);
			IsElementDisplayed(welcome);
			Report.Pass("Error message displayed successfully");
		}catch(Exception e) {
			Report.Fail("Error message not displayed successfully");
		}
		ToQuit();
	}
	public static void invaliddata() throws Throwable {
		Report.ReportCreateTestcase("user sigin with invalid");
		try {
			sendkeys(txtuser,DataDriven.readData(4, 0, "TestData"));
			sendkeys(password,DataDriven.readData(4, 1, "TestData"));
			click(signin);
			IsElementDisplayed(welcome);
			Report.Pass("Error message displayed successfully");
		}catch(Exception e) {
			Report.Fail("Error message not displayed successfully");
		}
		ToQuit();
	}
}


