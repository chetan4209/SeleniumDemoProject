package Org.qsp.testNGdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test(invocationCount=5)   //testcase will execute 5 times and Default invovationCount=1
	public void m1() {
		Reporter.log("hiiiiiiiiii",true);
	}

}
