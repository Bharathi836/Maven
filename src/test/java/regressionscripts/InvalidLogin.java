package regressionscripts;

import org.testng.annotations.Test;

import generic.Datadriven_excelread;
import generic.Generic_Test;
import pom.OnlineShoppingSitePage;

public class InvalidLogin extends Generic_Test
{
@Test
public void InvalidLogin()
{
	   String username = Datadriven_excelread.getData("Sheet1", 0, 0);
	   String password = Datadriven_excelread.getData("Sheet1", 1, 1);
	   OnlineShoppingSitePage lp = new OnlineShoppingSitePage(driver);
	   reports.createTest("InValidLogin", "user is trying to login with invalid credentials");
       test.info("test start");
	        lp.setusername(username);
			lp.setpassword(password);
			lp.clicklogin();
			test.info("test ended");
}
}
