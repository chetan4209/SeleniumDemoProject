package Org.qsp.testNGdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo6 {
	@Test(groups="functional") 
	public void m1() {
		Reporter.log("hii......1",true);
		}

	@Test(groups="functional")     
	public void m2() {
		Reporter.log("hii........2",true);
	}
	@Test(groups="Integration",dependsOnGroups="functional")
	public void m3() {
		Reporter.log("hi.....3",true);
		}
	
	@Test(groups="functional") 
	public void m4() {
		Reporter.log("hi.....4",true);
		}
	@Test(groups="Integration",dependsOnGroups="Unit")
	public void m5() {
		Reporter.log("hi.....5",true);
		}
	
	@Test(groups="Unit")
	public void m6() {
		Reporter.log("hi.....6",true);
		}


}
