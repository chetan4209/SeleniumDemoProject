package Org.qsp.testNGdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
	@Test(invocationCount=0)  //testcase will not get executed
	public void m1() {
		Reporter.log("hiiiiiiiiii......1",true);
	}
	@Test(enabled=false)     //testcase will not get executed
	public void m2() {
		Reporter.log("hiiiiiiiiii........2",true);
	}
	@Test(priority=5)
	public void m3() {
		Reporter.log("hiiiiiiiiii.....3",true);
	}

}
