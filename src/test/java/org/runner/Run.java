package org.runner;

import org.mainclass.BaseClass;
import org.modules.LogOutModule;
import org.modules.ManageSchedule;
import org.modules.UserSignInWithValidValues;
import org.modules.UserSigninWithInvalidvalues;
import org.report.Report;
import org.modules.ManageSchedule;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Run extends BaseClass {

	@BeforeSuite
	public void test1() {
		Report.Report();
		System.out.println("Starting");
	}
	@AfterSuite
	public void test21() {
		Report.ReportCooldown();
		System.out.println("Ending");
	}
	@Test
	public void test2() throws Throwable {
		
		//UserSigninWithInvalidvalues.invalidEmail();
		//UserSigninWithInvalidvalues.invalidPassword();
		//UserSigninWithInvalidvalues.invaliddata();
		UserSignInWithValidValues.validSignIn();
		ManageSchedule.manageSchedule();
		ManageSchedule.createSlot();
		ManageSchedule.deleteSlot();
		LogOutModule.LogOut();
	}
}
